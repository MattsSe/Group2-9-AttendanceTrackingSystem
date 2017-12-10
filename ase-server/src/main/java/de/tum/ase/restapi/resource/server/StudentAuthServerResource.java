package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.LoadType;
import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.resource.StudentAuthResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class StudentAuthServerResource extends AbstractServerResource implements StudentAuthResource {

    // Define allowed roles for the method "post".
    private static final String[] post13AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post13DeniedGroups = new String[]{};

    public Student add(Student bean) throws Exception {
        checkGroups(post13AllowedGroups, post13DeniedGroups);


        try {
            LoadType<Student> loader = ObjectifyService.ofy().load().type(Student.class);

            if (bean.hasId()) {
                return loader.id(bean.getId()).now();
            }
            String email = bean.getEmail();
            if (email == null && !email.isEmpty()) {
                return loader.filter("email", email).first().now();
            }
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);

        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    }


}

