package de.tum.ase.restapi.resource;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

public interface GroupsGroupidResource {

    @Get
    de.tum.ase.restapi.representation.Group represent() throws Exception;

    @Put
    de.tum.ase.restapi.representation.Group store(de.tum.ase.restapi.representation.Group bean) throws Exception;

    @Delete
    void remove() throws Exception;

}

