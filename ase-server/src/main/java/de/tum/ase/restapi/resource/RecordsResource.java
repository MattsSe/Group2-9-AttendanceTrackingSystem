package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.AttendanceRecord;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

import java.util.List;

public interface RecordsResource {

    @Get
    List<AttendanceRecord> represent() throws Exception;

    @Post
    void add(AttendanceRecord bean) throws Exception;

}

