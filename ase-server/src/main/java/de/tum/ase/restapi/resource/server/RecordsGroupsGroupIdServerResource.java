package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.representation.AttendanceRecord;
import de.tum.ase.restapi.resource.RecordsGroupsGroupIdResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.List;
import java.util.logging.Level;

public class RecordsGroupsGroupIdServerResource extends AbstractServerResource implements RecordsGroupsGroupIdResource {

    // Define allowed roles for the method "get".
    private static final String[] get23AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get23DeniedGroups = new String[]{};

    public List<AttendanceRecord> represent() throws Exception {
        List<AttendanceRecord> result = null;
        checkGroups(get23AllowedGroups, get23DeniedGroups);


        try {

            // Path variables

            String groupIdPathVariable = Reference.decode(getAttribute("groupId"));

            // Query parameters

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

