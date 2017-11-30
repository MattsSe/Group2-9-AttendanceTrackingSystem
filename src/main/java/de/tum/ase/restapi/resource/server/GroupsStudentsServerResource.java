package de.tum.ase.restapi.resource.server;

import org.restlet.data.Status;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

import de.tum.ase.restapi.resource.GroupsStudentsResource;

public class GroupsStudentsServerResource extends AbstractServerResource implements GroupsStudentsResource {

    // Define allowed roles for the method "get".
    private static final String[] get12AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get12DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.Student represent() throws Exception {
       de.tum.ase.restapi.representation.Student result = null;
        checkGroups(get12AllowedGroups, get12DeniedGroups);
        

        try {
		
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

