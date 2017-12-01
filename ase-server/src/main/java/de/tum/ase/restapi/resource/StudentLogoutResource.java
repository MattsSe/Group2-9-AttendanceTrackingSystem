package de.tum.ase.restapi.resource;

import org.restlet.resource.Delete;

public interface StudentLogoutResource {

    @Delete
    void remove() throws Exception;

}

