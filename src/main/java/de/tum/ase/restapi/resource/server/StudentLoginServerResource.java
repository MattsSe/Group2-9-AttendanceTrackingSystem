package de.tum.ase.restapi.resource.server;

import org.restlet.data.Status;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

import de.tum.ase.restapi.resource.StudentLoginResource;

public class StudentLoginServerResource extends AbstractServerResource implements StudentLoginResource {

    // Define allowed roles for the method "post".
    private static final String[] post13AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post13DeniedGroups = new String[] {};

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

