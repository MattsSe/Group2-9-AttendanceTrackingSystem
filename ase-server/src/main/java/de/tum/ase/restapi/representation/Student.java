package de.tum.ase.restapi.representation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import de.tum.ase.restapi.utils.BindingUtils;
import org.restlet.security.User;

@Entity
public class Student {


    public static Student fromUser(User user) {
        Student s = new Student();
        s.setEmail(user.getEmail());
        s.setFirstName(user.getFirstName());
        s.setLastName(user.getLastName());
        s.setId(Long.valueOf(user.getIdentifier()));

        return s;
    }

    @JsonIgnore
    public  User toUser(){
        User user = new User();
        user.setEmail(getEmail());
        user.setFirstName(getFirstName());
        user.setLastName(getLastName());
        user.setIdentifier(String.valueOf(getId()));

        return user;
    }

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


    @Index
    private String email;


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

    @JsonIgnore
    public boolean isComplete() {
        if (!isValid()) {
            return false;
        }
        if (!hasId()) {
            return false;
        }

        return true;
    }

    @JsonIgnore
    public boolean hasId() {
        if (getId() == null || getId() == 0) {
            return false;
        }
        return true;
    }

    @JsonIgnore
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
