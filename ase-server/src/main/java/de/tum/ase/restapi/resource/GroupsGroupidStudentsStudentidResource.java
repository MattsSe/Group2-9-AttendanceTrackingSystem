package de.tum.ase.restapi.resource;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

public interface GroupsGroupidStudentsStudentidResource {

    @Get
    de.tum.ase.restapi.representation.Student represent() throws Exception;

    @Delete
    void remove() throws Exception;

}

