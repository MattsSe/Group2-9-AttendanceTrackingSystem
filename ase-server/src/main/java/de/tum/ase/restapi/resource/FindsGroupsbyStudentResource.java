package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.Group;
import org.restlet.resource.Get;

import java.util.List;

public interface FindsGroupsbyStudentResource {

    @Get
    List<Group> represent() throws Exception;

}

