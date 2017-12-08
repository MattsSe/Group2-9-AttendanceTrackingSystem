package de.tum.ase.restapi.representation;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;

@Entity
public class Group {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    @Id private String id;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    private String maxSlots;

    
    public String getMaxSlots() {
        return maxSlots;
    }

    public void setMaxSlots(String maxSlots) {
        this.maxSlots = maxSlots;
    }


    private java.util.List<String> students;

    
    
    public java.util.List<String> getStudents() {
        if (students == null) {
            students = new ArrayList<String>();
        }
        return students;
    }

    public void setStudents(java.util.List<String> students) {
        this.students = students;
    }

}
