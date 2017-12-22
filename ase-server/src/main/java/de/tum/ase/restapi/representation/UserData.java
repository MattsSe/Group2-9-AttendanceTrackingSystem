package de.tum.ase.restapi.representation;

public class UserData {

    private Long id;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) {
            email = email.toLowerCase();
        }
        this.email = email;
    }


    public Student toStudent() {
        Student s = new Student();
        s.setFirstName(getFirstName());
        s.setLastName(getLastName());
        s.setEmail(getEmail());
        s.setId(getId());

        return s;
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
