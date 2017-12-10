package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.QrCode;
import org.restlet.resource.Get;
import org.restlet.resource.Options;
import org.restlet.representation.Representation;
public interface RecordsQrStudentIdResource {

    @Get
    QrCode represent() throws Exception;

}

