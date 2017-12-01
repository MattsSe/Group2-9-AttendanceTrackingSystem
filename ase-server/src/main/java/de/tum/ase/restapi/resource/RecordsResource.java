package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface RecordsResource {

    @Get
    de.tum.ase.restapi.representation.AttendanceRecord represent() throws Exception;

    @Post
    void add(de.tum.ase.restapi.representation.AttendanceRecord bean) throws Exception;

}

