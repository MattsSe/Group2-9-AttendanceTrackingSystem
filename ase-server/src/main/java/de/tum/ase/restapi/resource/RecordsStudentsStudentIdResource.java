package de.tum.ase.restapi.resource;

import org.restlet.resource.Get;

public interface RecordsStudentsStudentIdResource {

    @Get
    de.tum.ase.restapi.representation.AttendanceRecord represent() throws Exception;

}

