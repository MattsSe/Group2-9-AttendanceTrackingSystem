package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;

public interface FindsGroupsbyStudentResource {

    @Get
    de.tum.ase.restapi.representation.Group represent() throws Exception;

}

