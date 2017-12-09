package de.tum.ase.restapi.resource.server;

import com.googlecode.objectify.ObjectifyService;
import de.tum.ase.restapi.representation.AttendanceRecord;
import de.tum.ase.restapi.resource.RecordsAttendanceidResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class RecordsAttendanceidServerResource extends AbstractServerResource implements RecordsAttendanceidResource {

    // Define allowed roles for the method "get".
    private static final String[] get18AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get18DeniedGroups = new String[]{};
    // Define allowed roles for the method "put".
    private static final String[] put19AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "put".
    private static final String[] put19DeniedGroups = new String[]{};
    // Define allowed roles for the method "delete".
    private static final String[] delete20AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "delete".
    private static final String[] delete20DeniedGroups = new String[]{};

    public AttendanceRecord represent() throws Exception {
        de.tum.ase.restapi.representation.AttendanceRecord result;
        checkGroups(get18AllowedGroups, get18DeniedGroups);

        try {

            // Path variables

            String attendanceId = Reference.decode(getAttribute("attendanceid"));

            result = ObjectifyService.ofy()
                    .load()
                    .type(AttendanceRecord.class)
                    .id(attendanceId)
                    .now();

            // Initialize here your bean
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }

        return result;
    }

    /**
     * update
     *
     * @param bean
     * @throws Exception
     */
    public void store(de.tum.ase.restapi.representation.AttendanceRecord bean) throws Exception {
        checkGroups(put19AllowedGroups, put19DeniedGroups);

        if (bean == null) {
            throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
        }

        if (bean.getAttendance_id() == null) {
            bean.setAttendance_id(toLong(Reference.decode(getAttribute("attendanceId"))));
        }

        try {
            ObjectifyService.ofy().save().entity(bean);

        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }


    }

    public void remove() throws Exception {
        checkGroups(delete20AllowedGroups, delete20DeniedGroups);

        try {
            ObjectifyService.ofy().delete().type(AttendanceRecord.class).id(Reference.decode(getAttribute("attendanceId")));

        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }


    }


}

