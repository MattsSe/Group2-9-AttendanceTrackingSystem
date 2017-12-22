package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.Student;
import org.restlet.resource.Get;

import java.util.List;

public interface GroupsStudentsResource {

    @Get
    List<Student> represent() throws Exception;

}

