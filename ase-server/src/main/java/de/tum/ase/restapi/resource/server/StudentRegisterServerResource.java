package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.resource.StudentRegisterResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class StudentRegisterServerResource extends AbstractServerResource implements StudentRegisterResource {

    // Define allowed roles for the method "post".
    private static final String[] post16AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post16DeniedGroups = new String[] {};

    public de.tum.ase.restapi .representation.Student add(de.tum.ase.restapi .representation.Student bean) throws Exception {
       de.tum.ase.restapi .representation.Student result = null;
        checkGroups(post16AllowedGroups, post16DeniedGroups);
        
    	if (bean==null) {
    		throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
    	}

        try {
		
        // Query parameters
        
        	
	    result = new de.tum.ase.restapi .representation.Student();
	    
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
    private static final String[] put17AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "put".
    private static final String[] put17DeniedGroups = new String[] {};

    public de.tum.ase.restapi .representation.Student store(de.tum.ase.restapi .representation.Student bean) throws Exception {
       de.tum.ase.restapi .representation.Student result = null;
        checkGroups(put17AllowedGroups, put17DeniedGroups);
        
    	if (bean==null) {
    		throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
    	}

        try {
		
        // Query parameters
        
        	
	    result = new de.tum.ase.restapi .representation.Student();
	    
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

