package de.tum.ase.restapi.representation;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Student {

    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    private String firstName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    private String lastName;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Index private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Id
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isComplete() {
        if (!isValid()) {
            return false;
        }
        if (!hasId()) {
            return false;
        }
        if (getPassword() == null || getPassword().isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean hasId() {
        if (getId() == null || getId() == 0) {
            return false;
        }
        return true;
    }

    public boolean isValid() {
        if (getFirstName() == null || getFirstName().isEmpty()) {
            return false;
        }
        if (getLastName() == null || getLastName().isEmpty()) {
            return false;
        }
        if (getEmail() == null || getEmail().isEmpty()) {
            return false;
        }
        return true;
    }

}
