package de.tum.ase.restapi.resource;

import org.restlet.resource.Post;
public interface StudentAuthResource {

    @Post
    void add() throws Exception;

}

