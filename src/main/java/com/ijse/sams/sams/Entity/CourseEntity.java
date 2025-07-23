package com.ijse.sams.sams.Entity;

public class CourseEntity {
    private String courseId;
    private String courseName;
    private String courseDescription;
    private String Lecturer;
    private String courseDuration;
    private String courseFee;
    private String courseMinQualification;

    public CourseEntity(String courseId, String courseName, String courseDescription, String lecturer, String courseDuration, String courseFee, String courseMinQualification) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.Lecturer = lecturer;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
        this.courseMinQualification = courseMinQualification;
    }

    public CourseEntity() {
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public void setLecturer(String lecturer) {
        Lecturer = lecturer;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    public String getCourseMinQualification() {
        return courseMinQualification;
    }

    public void setCourseMinQualification(String courseMinQualification) {
        this.courseMinQualification = courseMinQualification;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", Lecturer='" + Lecturer + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseFee='" + courseFee + '\'' +
                ", courseMinQualification='" + courseMinQualification + '\'' +
                '}';
    }
}
