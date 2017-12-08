package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.resource.FindsGroupsbyStudentResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class FindsGroupsbyStudentServerResource extends AbstractServerResource implements FindsGroupsbyStudentResource {

    // Define allowed roles for the method "get".
    private static final String[] get11AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get11DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.Group represent() throws Exception {
       de.tum.ase.restapi.representation.Group result = null;
        checkGroups(get11AllowedGroups, get11DeniedGroups);
        

        try {
		
        // Query parameters
        
        	
	    result = new de.tum.ase.restapi.representation.Group();
	    
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

