package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.resource.GroupsStudentsResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.List;
import java.util.logging.Level;

public class GroupsStudentsServerResource extends AbstractServerResource implements GroupsStudentsResource {

    // Define allowed roles for the method "get".
    private static final String[] get12AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get12DeniedGroups = new String[]{};

    public List<Student> represent() throws Exception {
        List<Student>  result = null;
        checkGroups(get12AllowedGroups, get12DeniedGroups);


        try {

            // Query parameters

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

