package de.tum.ase.restapi.representation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Group {
    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    private Integer maxSlots;


    public Integer getMaxSlots() {
        return maxSlots;
    }

    public void setMaxSlots(Integer maxSlots) {
        this.maxSlots = maxSlots;
    }


    private List<Long> students;


    public List<Long> getStudents() {
        if (students == null) {
            students = new ArrayList<>();
        }
        return students;
    }

    public void setStudents(List<Long> students) {
        this.students = students;
    }

    @JsonIgnore
    public boolean isFull() {
        if (getStudents() == null || getMaxSlots() == null) {
            return false;
        }
        return getStudents().size() == getMaxSlots();
    }

    @JsonIgnore
    public boolean hasFreeSlots() {
        return !isFull();
    }

    @JsonIgnore
    public boolean isEmpty() {
        return  getStudents().isEmpty();
    }

    @JsonIgnore
    public boolean isValid() {
        return getId() != null && getMaxSlots() != null;
    }
}
