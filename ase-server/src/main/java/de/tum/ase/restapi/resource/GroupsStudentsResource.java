package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;

public interface GroupsStudentsResource {

    @Get
    de.tum.ase.restapi.representation.Student represent() throws Exception;

}

