package de.tum.ase.restapi.representation;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class AttendanceRecord {
    /**
     * Default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    private Long attendance_id;


    public Long getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(Long attendance_id) {
        this.attendance_id = attendance_id;
    }


    private Long student_id;


    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }


    private Long tutorial_group_id;


    public Long getTutorial_group_id() {
        return tutorial_group_id;
    }

    public void setTutorial_group_id(Long tutorial_group_id) {
        this.tutorial_group_id = tutorial_group_id;
    }


    private String week_id;


    public String getWeek_id() {
        return week_id;
    }

    public void setWeek_id(String week_id) {
        this.week_id = week_id;
    }


    private Boolean presented;

    public Boolean getPresented() {
        return presented;
    }

    public void setPresented(Boolean presented) {
        this.presented = presented;
    }

}
