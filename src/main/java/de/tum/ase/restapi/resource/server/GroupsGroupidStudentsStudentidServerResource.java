package de.tum.ase.restapi.resource.server;

import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

import de.tum.ase.restapi.resource.GroupsGroupidStudentsStudentidResource;

public class GroupsGroupidStudentsStudentidServerResource extends AbstractServerResource implements GroupsGroupidStudentsStudentidResource {

    // Define allowed roles for the method "get".
    private static final String[] get8AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get8DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.Student represent() throws Exception {
       de.tum.ase.restapi.representation.Student result = null;
        checkGroups(get8AllowedGroups, get8DeniedGroups);
        

        try {
		
			// Path variables
			
	    String groupidPathVariable = Reference.decode(getAttribute("groupid"));

	    String studentidPathVariable = Reference.decode(getAttribute("studentid"));

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

    // Define allowed roles for the method "put".
    private static final String[] put9AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "put".
    private static final String[] put9DeniedGroups = new String[] {};

    public de.tum.ase.restapi.representation.Student store(de.tum.ase.restapi.representation.Student bean) throws Exception {
       de.tum.ase.restapi.representation.Student result = null;
        checkGroups(put9AllowedGroups, put9DeniedGroups);
        
    	if (bean==null) {
    		throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
    	}

        try {
		
			// Path variables
			
	    String groupidPathVariable = Reference.decode(getAttribute("groupid"));

	    String studentidPathVariable = Reference.decode(getAttribute("studentid"));

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

    // Define allowed roles for the method "delete".
    private static final String[] delete10AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "delete".
    private static final String[] delete10DeniedGroups = new String[] {};

    public void remove() throws Exception {
        checkGroups(delete10AllowedGroups, delete10DeniedGroups);
        

        try {
         } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    
        
    }


}

