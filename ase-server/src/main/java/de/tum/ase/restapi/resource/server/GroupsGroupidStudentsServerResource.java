package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.representation.Group;
import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.resource.GroupsGroupidStudentsResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.List;
import java.util.logging.Level;

public class GroupsGroupidStudentsServerResource extends AbstractServerResource implements GroupsGroupidStudentsResource {

    // Define allowed roles for the method "get".
    private static final String[] get6AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get6DeniedGroups = new String[]{};
    // Define allowed roles for the method "post".
    private static final String[] post7AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post7DeniedGroups = new String[]{};

    /**
     * Get users inside a group
     *
     * @return
     * @throws Exception
     */
    public List<Student> represent() throws Exception {
        List<Student> result;
        checkGroups(get6AllowedGroups, get6DeniedGroups);


        try {

            // Path variables
            String groupid = Reference.decode(getAttribute("groupid"));

            Group group = ObjectifyService.ofy().load().type(Group.class).id(groupid).now();
            if (group == null) {
                getLogger().log(Level.WARNING, "No group present with the id " + groupid);
                throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST, "No group present with the id " + groupid);
            }
            result = ObjectifyService.ofy().load().type(Student.class).filter("id in", group.getStudents()).list();

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    /**
     * Add a new student to the group
     *
     * @param bean
     * @return
     * @throws Exception
     */
    public Student add(Student bean) throws Exception {
        Student result;
        checkGroups(post7AllowedGroups, post7DeniedGroups);

        if (bean == null || bean.getId() == null) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
        }

        try {

            // Path variables
            String groupId = Reference.decode(getAttribute("groupid"));
            Group group = ObjectifyService.ofy().load().type(Group.class).id(groupId).now();
            group.getStudents().add(bean.getId());
            ObjectifyService.ofy().save().entity(group);
            // Query parameters
            result = bean;

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }


}

