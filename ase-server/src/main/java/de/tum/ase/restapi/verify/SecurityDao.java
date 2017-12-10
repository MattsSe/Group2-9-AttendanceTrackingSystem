package de.tum.ase.restapi.verify;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.Loader;
import de.tum.ase.restapi.representation.Secret;
import de.tum.ase.restapi.representation.Student;
import org.restlet.Request;
import org.restlet.security.User;

public class SecurityDao {

    // https://stackoverflow.com/questions/14426879/simple-restlet-login
    public SecurityDao() {
    }

    public boolean hasUserPassword(String user, String password) {

        Loader loader = ObjectifyService.ofy()
                .load();

        Student student = loader
                .type(Student.class)
                .filter("email", user)
                .first()
                .now();

        if (student == null) {
            return false;
        }

        Secret secret = loader
                .type(Secret.class).id(student.getId()).now();
        boolean valid = secret.getPassword().equals(password);

        User appuser = new User(student.getEmail(), secret.getPassword());

        if (valid) {
            Request.getCurrent().getClientInfo().setUser(appuser);
        }
        return valid;
    }
}
