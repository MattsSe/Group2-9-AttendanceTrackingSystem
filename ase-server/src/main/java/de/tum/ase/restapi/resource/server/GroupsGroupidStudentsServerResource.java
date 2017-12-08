package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.resource.GroupsGroupidStudentsResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class GroupsGroupidStudentsServerResource extends AbstractServerResource implements GroupsGroupidStudentsResource {

    // Define allowed roles for the method "get".
    private static final String[] get6AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get6DeniedGroups = new String[]{};

    public de.tum.ase.restapi.representation.Student represent() throws Exception {
        de.tum.ase.restapi.representation.Student result = null;
        checkGroups(get6AllowedGroups, get6DeniedGroups);


        try {

            // Path variables

            String groupidPathVariable = Reference.decode(getAttribute("groupid"));

            // Query parameters


            result = new de.tum.ase.restapi.representation.Student();

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    // Define allowed roles for the method "post".
    private static final String[] post7AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post7DeniedGroups = new String[]{};

    public de.tum.ase.restapi.representation.Student add(de.tum.ase.restapi.representation.Student bean) throws Exception {
        de.tum.ase.restapi.representation.Student result = null;
        checkGroups(post7AllowedGroups, post7DeniedGroups);

        if (bean == null) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
        }

        try {

            // Path variables

            String groupidPathVariable = Reference.decode(getAttribute("groupid"));

            // Query parameters


            result = new de.tum.ase.restapi.representation.Student();

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

