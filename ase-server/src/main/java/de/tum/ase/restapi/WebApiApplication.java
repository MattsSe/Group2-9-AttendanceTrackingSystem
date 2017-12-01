package de.tum.ase.restapi;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.data.ChallengeScheme;
import org.restlet.routing.Router;
import org.restlet.security.ChallengeAuthenticator;
import org.restlet.service.CorsService;
import org.restlet.security.MemoryRealm;
import org.restlet.security.User;
import org.restlet.security.Role;

import de.tum.ase.restapi.resource.server.GroupsServerResource;
import de.tum.ase.restapi.resource.server.GroupsGroupidServerResource;
import de.tum.ase.restapi.resource.server.GroupsGroupidStudentsServerResource;
import de.tum.ase.restapi.resource.server.GroupsGroupidStudentsStudentidServerResource;
import de.tum.ase.restapi.resource.server.FindsGroupsbyStudentServerResource;
import de.tum.ase.restapi.resource.server.GroupsStudentsServerResource;
import de.tum.ase.restapi.resource.server.StudentServerResource;
import de.tum.ase.restapi.resource.server.StudentLoginServerResource;
import de.tum.ase.restapi.resource.server.StudentLogoutServerResource;
import de.tum.ase.restapi.resource.server.StudentStudentidQrServerResource;
import de.tum.ase.restapi.resource.server.RecordsServerResource;
import de.tum.ase.restapi.resource.server.RecordsAttendanceidServerResource;

public class WebApiApplication extends Application {

    /*
     * Define route constants
     */
    public static final String ROUTE_GROUPS = "/groups/";

    public static final String ROUTE_GROUPSGROUPID = "/groups/{groupid}";

    public static final String ROUTE_GROUPSGROUPIDSTUDENTS = "/groups/{groupid}/students";

    public static final String ROUTE_GROUPSGROUPIDSTUDENTSSTUDENTID = "/groups/{groupid}/students/{studentid}";

    public static final String ROUTE_FINDSGROUPSBYSTUDENT = "/groups/findByStudent";

    public static final String ROUTE_GROUPSSTUDENTS = "/groups/students";

    public static final String ROUTE_STUDENT = "/student/";

    public static final String ROUTE_STUDENTLOGIN = "/student/login";

    public static final String ROUTE_STUDENTLOGOUT = "/student/logout";

    public static final String ROUTE_STUDENTSTUDENTIDQR = "/student/{studentid}/qr";

    public static final String ROUTE_RECORDS = "/records/";

    public static final String ROUTE_RECORDSATTENDANCEID = "/records/{attendanceid}/";


    /*
     * Define role names
     */
    public static final String ROLE_ADMIN = "admin";

    public static final String ROLE_ANYONE = "anyone";

    public static final String ROLE_DEV = "cellroledev";

    public static final String ROLE_OWNER = "cellroleowner";

    public static final String ROLE_USER = "cellroleuser";

    private String versionFull;

    private int versionMajor;

    private int versionMicro;

    private int versionMinor;
    
    public WebApiApplication() {
    	setName("aseAttendanceApi");
        CorsService corsService = new CorsService();
        corsService.setAllowedCredentials(true);
        corsService.setSkippingResourceForCorsOptions(true);
        getServices().add(corsService);
    }

	private ChallengeAuthenticator createApiGuard(Restlet next) {

        ChallengeAuthenticator apiGuard = new ChallengeAuthenticator(
                getContext(), ChallengeScheme.HTTP_BASIC, "realm");

        // Create in-memory users and roles.
        MemoryRealm realm = new MemoryRealm();
        User owner = new User("owner", "owner");
        realm.getUsers().add(owner);
        realm.map(owner, Role.get(this, ROLE_OWNER));
        realm.map(owner, Role.get(this, ROLE_USER));
        realm.map(owner, Role.get(this, ROLE_DEV));
        User admin = new User("admin", "admin");
        realm.getUsers().add(admin);
        realm.map(admin, Role.get(this, ROLE_ADMIN));
        realm.map(admin, Role.get(this, ROLE_OWNER));
        realm.map(admin, Role.get(this, ROLE_USER));
        realm.map(admin, Role.get(this, ROLE_DEV));
        User user = new User("user", "user");
        realm.getUsers().add(user);
        realm.map(user, Role.get(this, ROLE_USER));

        // Verifier : to check authentication
        apiGuard.setVerifier(realm.getVerifier());
        // Enroler : add authorization roles
        apiGuard.setEnroler(realm.getEnroler());

        // You can also create your own authentication/authorization system by
        // creating classes extending SecretVerifier or LocalVerifier (for
        // authentication) and Enroler (for authorization) and set these to the
        // guard.

        apiGuard.setNext(next);

        // In case of anonymous access supported by the API.
        apiGuard.setOptional(true);

        return apiGuard;
    }
    
    public Router createApiRouter() {
        Router apiRouter = new Router(getContext());
        apiRouter.attach(ROUTE_GROUPS.substring(0, ROUTE_GROUPS.length()-1), GroupsServerResource.class);
        apiRouter.attach(ROUTE_GROUPS, GroupsServerResource.class);
        apiRouter.attach(ROUTE_GROUPSGROUPID, GroupsGroupidServerResource.class);
        apiRouter.attach(ROUTE_GROUPSGROUPIDSTUDENTS, GroupsGroupidStudentsServerResource.class);
        apiRouter.attach(ROUTE_GROUPSGROUPIDSTUDENTSSTUDENTID, GroupsGroupidStudentsStudentidServerResource.class);
        apiRouter.attach(ROUTE_FINDSGROUPSBYSTUDENT, FindsGroupsbyStudentServerResource.class);
        apiRouter.attach(ROUTE_GROUPSSTUDENTS, GroupsStudentsServerResource.class);
        apiRouter.attach(ROUTE_STUDENT.substring(0, ROUTE_STUDENT.length()-1), StudentServerResource.class);
        apiRouter.attach(ROUTE_STUDENT, StudentServerResource.class);
        apiRouter.attach(ROUTE_STUDENTLOGIN, StudentLoginServerResource.class);
        apiRouter.attach(ROUTE_STUDENTLOGOUT, StudentLogoutServerResource.class);
        apiRouter.attach(ROUTE_STUDENTSTUDENTIDQR, StudentStudentidQrServerResource.class);
        apiRouter.attach(ROUTE_RECORDS.substring(0, ROUTE_RECORDS.length()-1), RecordsServerResource.class);
        apiRouter.attach(ROUTE_RECORDS, RecordsServerResource.class);
        apiRouter.attach(ROUTE_RECORDSATTENDANCEID.substring(0, ROUTE_RECORDSATTENDANCEID.length()-1), RecordsAttendanceidServerResource.class);
        apiRouter.attach(ROUTE_RECORDSATTENDANCEID, RecordsAttendanceidServerResource.class);

        return apiRouter;
	}

    public Restlet createInboundRoot() {

        // Router for the API's resources
        Router apiRouter = createApiRouter();
        // Protect the set of resources
        ChallengeAuthenticator guard = createApiGuard(apiRouter);

        return guard;
    }

}
