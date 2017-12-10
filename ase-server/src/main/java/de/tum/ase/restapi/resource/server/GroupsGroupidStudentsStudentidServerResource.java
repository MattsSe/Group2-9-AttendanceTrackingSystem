package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.representation.Group;
import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.resource.GroupsGroupidStudentsStudentidResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class GroupsGroupidStudentsStudentidServerResource extends AbstractServerResource implements GroupsGroupidStudentsStudentidResource {

    // Define allowed roles for the method "get".
    private static final String[] get8AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get8DeniedGroups = new String[]{};
    // Define allowed roles for the method "delete".
    private static final String[] delete10AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "delete".
    private static final String[] delete10DeniedGroups = new String[]{};

    public Student represent() throws Exception {
        Student result;
        checkGroups(get8AllowedGroups, get8DeniedGroups);


        try {

            // Path variables
            String groupId = Reference.decode(getAttribute("groupid"));

            String studentId = Reference.decode(getAttribute("studentid"));

            Objectify ofy = ObjectifyService.ofy();

            Group group = ofy.load().type(Group.class).id(groupId).now();
            Long id = toLong(studentId);
            // Query parameters
            if (group == null || !group.getStudents().contains(id)) {
                throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
            }

            result = ofy.load().type(Student.class).id(id).now();

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    public void remove() throws Exception {
        checkGroups(delete10AllowedGroups, delete10DeniedGroups);


        try {
            String groupId = Reference.decode(getAttribute("groupid"));

            String studentId = Reference.decode(getAttribute("studentid"));

            Objectify ofy = ObjectifyService.ofy();

            Group group = ofy.load().type(Group.class).id(groupId).now();
            Long id = toLong(studentId);
            // Query parameters
            if (group == null || !group.getStudents().contains(id)) {
                throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
            }

            // remove student id and save updated
            group.getStudents().remove(id);
            ofy.save().entity(group);


        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }


    }


}

