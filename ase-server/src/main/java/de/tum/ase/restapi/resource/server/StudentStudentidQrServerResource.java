package de.tum.ase.restapi.resource.server;

import de.tum.ase.restapi.resource.StudentStudentidQrResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class StudentStudentidQrServerResource extends AbstractServerResource implements StudentStudentidQrResource {

    // Define allowed roles for the method "get".
    private static final String[] get15AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get15DeniedGroups = new String[]{};

    public de.tum.ase.restapi.representation.QrCode represent() throws Exception {
        de.tum.ase.restapi.representation.QrCode result = null;
        checkGroups(get15AllowedGroups, get15DeniedGroups);


        try {

            // Path variables

            String studentidPathVariable = Reference.decode(getAttribute("studentid"));

            // Query parameters


            result = new de.tum.ase.restapi.representation.QrCode();

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

