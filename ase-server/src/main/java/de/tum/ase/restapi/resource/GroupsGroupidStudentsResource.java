package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.Student;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import java.util.List;

public interface GroupsGroupidStudentsResource {

    @Get
    List<Student> represent() throws Exception;

    @Post
    de.tum.ase.restapi.representation.Student add(de.tum.ase.restapi.representation.Student bean) throws Exception;

}

