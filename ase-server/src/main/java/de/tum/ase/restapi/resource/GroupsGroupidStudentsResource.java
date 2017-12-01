package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface GroupsGroupidStudentsResource {

    @Get
    de.tum.ase.restapi.representation.Student represent() throws Exception;

    @Post
    de.tum.ase.restapi.representation.Student add(de.tum.ase.restapi.representation.Student bean) throws Exception;

}

