package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.Delete;

public interface GroupsGroupidStudentsStudentidResource {

    @Get
    de.tum.ase.restapi.representation.Student represent() throws Exception;

    @Put
    de.tum.ase.restapi.representation.Student store(de.tum.ase.restapi.representation.Student bean) throws Exception;

    @Delete
    void remove() throws Exception;

}

