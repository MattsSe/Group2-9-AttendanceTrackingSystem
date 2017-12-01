package de.tum.ase.restapi.resource;

import org.restlet.resource.Post;

public interface StudentLoginResource {

    @Post
    void add() throws Exception;

}

