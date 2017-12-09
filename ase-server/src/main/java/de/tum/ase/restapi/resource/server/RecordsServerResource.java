package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.representation.AttendanceRecord;
import de.tum.ase.restapi.resource.RecordsResource;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.List;
import java.util.logging.Level;

public class RecordsServerResource extends AbstractServerResource implements RecordsResource {

    // Define allowed roles for the method "get".
    private static final String[] get16AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get16DeniedGroups = new String[]{};
    // Define allowed roles for the method "post".
    private static final String[] post17AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post17DeniedGroups = new String[]{};

    public List<AttendanceRecord> represent() throws Exception {
        List<AttendanceRecord> result = null;
        checkGroups(get16AllowedGroups, get16DeniedGroups);


        try {

            // Query parameters
            String size = getQueryValue("$size");
            String week = getQueryValue("$weekId");
            String sort = getQueryValue("$sort");

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    public void add(AttendanceRecord bean) throws Exception {
        checkGroups(post17AllowedGroups, post17DeniedGroups);

        if (bean == null) {
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

