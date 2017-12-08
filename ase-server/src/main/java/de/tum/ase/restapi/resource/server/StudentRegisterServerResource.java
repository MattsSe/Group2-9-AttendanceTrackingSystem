package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.resource.StudentRegisterResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class StudentRegisterServerResource extends AbstractServerResource implements StudentRegisterResource {

    // Define allowed roles for the method "post".
    private static final String[] post16AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post16DeniedGroups = new String[]{};

    public de.tum.ase.restapi.representation.Student add(de.tum.ase.restapi.representation.Student bean) throws Exception {
        Student result = null;
        checkGroups(post16AllowedGroups, post16DeniedGroups);

        if (bean == null || !bean.isValid()) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
        }
        try {

            // check if a student with the email is already registered
            boolean exists = ObjectifyService.ofy()
                    .load()
                    .type(Student.class)
                    .filter("email", bean.getEmail())
                    .first()
                    .now() != null;
            if (exists) {
                getLogger().log(Level.WARNING, "An entry with this email already exists.");
                throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
            }

            // save the new student
            Key<Student> studentKey = ObjectifyService.ofy().save().entity(bean).now();

            // return the saved student
            result = ObjectifyService.ofy().load().key(studentKey).now();

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    // Define allowed roles for the method "put".
    private static final String[] put17AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "put".
    private static final String[] put17DeniedGroups = new String[]{};

    public de.tum.ase.restapi.representation.Student store(de.tum.ase.restapi.representation.Student bean) throws Exception {
        de.tum.ase.restapi.representation.Student result = null;
        checkGroups(put17AllowedGroups, put17DeniedGroups);

        if (bean == null || !bean.isValid()) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
        }

        try {

            // update the student
            ObjectifyService.ofy().save().entity(bean);

            result = bean;

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
        }

        return result;
    }


}

