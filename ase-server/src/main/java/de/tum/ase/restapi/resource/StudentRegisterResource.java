package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.Student;
import de.tum.ase.restapi.representation.UserData;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface StudentRegisterResource {

    @Post
    Student add(UserData bean) throws Exception;

    @Put
    Student store(UserData bean) throws Exception;

}

