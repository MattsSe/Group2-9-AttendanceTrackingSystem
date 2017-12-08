package de.tum.ase.restapi.resource;

import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface StudentRegisterResource {

    @Post
    de.tum.ase.restapi.representation.Student add(de.tum.ase.restapi.representation.Student bean) throws Exception;

    @Put
    de.tum.ase.restapi.representation.Student store(de.tum.ase.restapi.representation.Student bean) throws Exception;

}

