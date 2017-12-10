package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.resource.StudentAuthResource;
import org.restlet.Request;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;
import org.restlet.security.User;

import java.util.logging.Level;

public class StudentAuthServerResource extends AbstractServerResource implements StudentAuthResource {

    // Define allowed roles for the method "post".
    private static final String[] post13AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post13DeniedGroups = new String[]{};

    public Student add() throws Exception {
        Student result;
        checkGroups(post13AllowedGroups, post13DeniedGroups);


        try {
            User user = Request.getCurrent().getClientInfo().getUser();
            result = Student.fromUser(user);

        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }


}

