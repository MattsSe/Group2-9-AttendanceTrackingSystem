package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface GroupsResource {

    @Get ("json")
    de.tum.ase.restapi.representation.Group represent() throws Exception;

    @Post ("json")
    de.tum.ase.restapi.representation.Group add(de.tum.ase.restapi.representation.Group bean) throws Exception;

}

