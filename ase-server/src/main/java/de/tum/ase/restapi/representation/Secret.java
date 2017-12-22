package de.tum.ase.restapi.representation;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Secret {

    private static final long serialVersionUID = 1L;

    public static  Secret create(Long studentId, String password) {
        Secret secret = new Secret();
        secret.setStudentId(studentId);
        secret.setPassword(password);
        return secret;
    }

    @Id
    Long studentId;

    String password;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
