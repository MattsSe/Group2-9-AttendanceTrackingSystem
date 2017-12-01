package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;

public interface StudentStudentidQrResource {

    @Get
    de.tum.ase.restapi.representation.QrCode represent() throws Exception;

}

