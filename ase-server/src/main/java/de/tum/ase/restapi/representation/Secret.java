package de.tum.ase.restapi.representation;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Secret {

    private static final long serialVersionUID = 1L;

    public Secret(Long studentId, String password) {
        this.studentId = studentId;
        this.password = password;
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
