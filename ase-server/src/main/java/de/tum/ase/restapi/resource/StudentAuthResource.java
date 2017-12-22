package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.Student;
import org.restlet.resource.Post;

public interface StudentAuthResource {

    @Post
    Student add() throws Exception;

}

