package de.tum.ase.restapi.representation;

public class AttendanceRecord {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private String attendance_id;

    
    public String getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(String attendance_id) {
        this.attendance_id = attendance_id;
    }


    private String student_id;

    
    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }


    private String tutorial_group_id;

    
    public String getTutorial_group_id() {
        return tutorial_group_id;
    }

    public void setTutorial_group_id(String tutorial_group_id) {
        this.tutorial_group_id = tutorial_group_id;
    }


    private String week_id;

    
    public String getWeek_id() {
        return week_id;
    }

    public void setWeek_id(String week_id) {
        this.week_id = week_id;
    }


    private String presented;

    
    public String getPresented() {
        return presented;
    }

    public void setPresented(String presented) {
        this.presented = presented;
    }

}
