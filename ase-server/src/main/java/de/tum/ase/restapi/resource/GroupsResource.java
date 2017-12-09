package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.Group;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import java.util.List;

public interface GroupsResource {

    @Get
    List<Group> represent() throws Exception;

    @Post("json")
    de.tum.ase.restapi.representation.Group add(de.tum.ase.restapi.representation.Group bean) throws Exception;

}

