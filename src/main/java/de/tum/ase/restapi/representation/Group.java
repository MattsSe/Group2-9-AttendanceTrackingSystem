package de.tum.ase.restapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Group {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private String id;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    private String maxSpots;

    
    public String getMaxSpots() {
        return maxSpots;
    }

    public void setMaxSpots(String maxSpots) {
        this.maxSpots = maxSpots;
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
