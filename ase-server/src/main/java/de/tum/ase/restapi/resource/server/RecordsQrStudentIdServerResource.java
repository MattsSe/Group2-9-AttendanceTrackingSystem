package de.tum.ase.restapi.resource.server;

import de.tum.ase.data.QrCodeGenerator;
import de.tum.ase.data.WeekIdGenerator;
import de.tum.ase.restapi.representation.QrCode;
import de.tum.ase.restapi.resource.RecordsQrStudentIdResource;
import org.restlet.data.Reference;
import org.restlet.data.Status;
import org.restlet.resource.ResourceException;

import java.util.logging.Level;

public class RecordsQrStudentIdServerResource extends AbstractServerResource implements RecordsQrStudentIdResource {

    // Define allowed roles for the method "get".
    private static final String[] get24AllowedGroups = new String[]{"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get24DeniedGroups = new String[]{};

    public static int DEFAULT_QR_CODE_SIZE = 125;

    /**
     * @return Create a new qr based on the student id and the current weekid.
     *  Values are separated by semicolon,
     *  Format of the qr code content is "{studentid};{weekId}"
     * @throws Exception
     */
    public QrCode represent() throws Exception {
        checkGroups(get24AllowedGroups, get24DeniedGroups);


        try {
            String $size = getQueryValue("$size");
            String $width = getQueryValue("$width");
            String $height = getQueryValue("$height");
            int width = DEFAULT_QR_CODE_SIZE;
            int height = DEFAULT_QR_CODE_SIZE;

            boolean done = false;
            if ($size != null) {
                int i = toInteger($size);
                width = i;
                height = i;
                done = true;
            }
            if (!done && $width != null) {
                int i = toInteger($width);
                width = i;
            }
            if (!done && $height != null) {
                int i = toInteger($height);
                height = i;
            }

            String studentId = Reference.decode(getAttribute("studentId"));

            String values = String.format("%s;%s", studentId, WeekIdGenerator.generateWeekId());

            String content = QrCodeGenerator.createQrCodeStringBase64(values, width, height, "png");
            QrCode qrCode = new QrCode();
            qrCode.setStudentId(toLong(studentId));
            qrCode.setContent(content);
            return qrCode;
        } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }


    }


}

