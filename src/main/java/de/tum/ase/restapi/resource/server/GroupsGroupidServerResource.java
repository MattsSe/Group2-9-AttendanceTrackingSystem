package de.tum.ase.restapi.resource.server;

import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

import de.tum.ase.restapi.resource.GroupsGroupidResource;

public class GroupsGroupidServerResource extends AbstractServerResource implements GroupsGroupidResource {

    // Define allowed roles for the method "get".
    private static final String[] get3AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get3DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.Group represent() throws Exception {
       de.tum.ase.restapi.representation.Group result = null;
        checkGroups(get3AllowedGroups, get3DeniedGroups);
        

        try {
		
			// Path variables
			
	    String groupidPathVariable = Reference.decode(getAttribute("groupid"));

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

    // Define allowed roles for the method "put".
    private static final String[] put4AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "put".
    private static final String[] put4DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.Group store(de.tum.ase.restapi.representation.Group bean) throws Exception {
       de.tum.ase.restapi.representation.Group result = null;
        checkGroups(put4AllowedGroups, put4DeniedGroups);
        
    	if (bean==null) {
    		throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
    	}

        try {
		
			// Path variables
			
	    String groupidPathVariable = Reference.decode(getAttribute("groupid"));

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

    // Define allowed roles for the method "delete".
    private static final String[] delete5AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "delete".
    private static final String[] delete5DeniedGroups = new String[] {};

    public void remove() throws Exception {
        checkGroups(delete5AllowedGroups, delete5DeniedGroups);
        

        try {
         } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    
        
    }


}

