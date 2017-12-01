package de.tum.ase.restapi.resource.server;

import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

import de.tum.ase.restapi.resource.RecordsAttendanceidResource;

public class RecordsAttendanceidServerResource extends AbstractServerResource implements RecordsAttendanceidResource {

    // Define allowed roles for the method "get".
    private static final String[] get18AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get18DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.AttendanceRecord represent() throws Exception {
       de.tum.ase.restapi.representation.AttendanceRecord result = null;
        checkGroups(get18AllowedGroups, get18DeniedGroups);
        

        try {
		
			// Path variables
			
	    String attendanceidPathVariable = Reference.decode(getAttribute("attendanceid"));

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

    // Define allowed roles for the method "put".
    private static final String[] put19AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "put".
    private static final String[] put19DeniedGroups = new String[] {};

    public void store(de.tum.ase.restapi.representation.AttendanceRecord bean) throws Exception {
        checkGroups(put19AllowedGroups, put19DeniedGroups);
        
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

    // Define allowed roles for the method "delete".
    private static final String[] delete20AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "delete".
    private static final String[] delete20DeniedGroups = new String[] {};

    public void remove() throws Exception {
        checkGroups(delete20AllowedGroups, delete20DeniedGroups);
        

        try {
         } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    
        
    }


}

