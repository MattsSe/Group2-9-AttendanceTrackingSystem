package de.tum.ase.restapi.resource;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

public interface RecordsAttendanceidResource {

    @Get
    de.tum.ase.restapi.representation.AttendanceRecord represent() throws Exception;

    @Put
    void store(de.tum.ase.restapi.representation.AttendanceRecord bean) throws Exception;

    @Delete
    void remove() throws Exception;

}

