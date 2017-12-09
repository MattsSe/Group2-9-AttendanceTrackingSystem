package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.representation.AttendanceRecord;
import de.tum.ase.restapi.resource.RecordsStudentsStudentIdResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.List;
import java.util.logging.Level;

public class RecordsStudentsStudentIdServerResource extends AbstractServerResource implements RecordsStudentsStudentIdResource {

    // Define allowed roles for the method "get".
    private static final String[] get24AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get24DeniedGroups = new String[]{};

    public List<AttendanceRecord> represent() throws Exception {
        List<AttendanceRecord> result = null;
        checkGroups(get24AllowedGroups, get24DeniedGroups);


        try {

            // Path variables

            String studentIdPathVariable = Reference.decode(getAttribute("studentId"));

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

