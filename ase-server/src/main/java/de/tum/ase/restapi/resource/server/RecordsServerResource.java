package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.resource.RecordsResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class RecordsServerResource extends AbstractServerResource implements RecordsResource {

    // Define allowed roles for the method "get".
    private static final String[] get16AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get16DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.AttendanceRecord represent() throws Exception {
       de.tum.ase.restapi.representation.AttendanceRecord result = null;
        checkGroups(get16AllowedGroups, get16DeniedGroups);
        

        try {
		
        // Query parameters
        
        	
	    result = new de.tum.ase.restapi.representation.AttendanceRecord();
	    
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
    private static final String[] post17AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post17DeniedGroups = new String[] {};

    public void add(de.tum.ase.restapi.representation.AttendanceRecord bean) throws Exception {
        checkGroups(post17AllowedGroups, post17DeniedGroups);
        
    	if (bean==null) {
    		throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
    	}

        try {
         } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    
        
    }


}

