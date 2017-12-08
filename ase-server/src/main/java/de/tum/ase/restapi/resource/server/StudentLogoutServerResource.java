package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.resource.StudentLogoutResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class StudentLogoutServerResource extends AbstractServerResource implements StudentLogoutResource {

    // Define allowed roles for the method "delete".
    private static final String[] delete14AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "delete".
    private static final String[] delete14DeniedGroups = new String[] {};

    public void remove() throws Exception {
        checkGroups(delete14AllowedGroups, delete14DeniedGroups);
        

        try {
         } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    
        
    }


}

