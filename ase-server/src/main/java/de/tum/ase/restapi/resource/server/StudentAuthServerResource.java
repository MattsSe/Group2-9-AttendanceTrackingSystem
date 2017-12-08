package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.resource.StudentAuthResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class StudentAuthServerResource extends AbstractServerResource implements StudentAuthResource {

    // Define allowed roles for the method "post".
    private static final String[] post13AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post13DeniedGroups = new String[]{};

    public void add() throws Exception {
        checkGroups(post13AllowedGroups, post13DeniedGroups);


        try {
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }


    }


}

