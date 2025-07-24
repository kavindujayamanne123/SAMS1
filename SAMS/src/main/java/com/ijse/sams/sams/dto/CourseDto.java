package com.ijse.sams.sams.dto;

public class CourseDto {
    private String courseId;
    private String courseName;
    private String courseDescription;
    private String Lecturer;
    private String courseDuration;
    private String courseFee;
    private String courseStream;
    private String courseMinQualification;

    public CourseDto(String courseId, String courseName, String courseDescription, String lecturer, String courseDuration, String courseFee, String courseStream, String courseMinQualification) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        Lecturer = lecturer;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
        this.courseStream = courseStream;
        this.courseMinQualification = courseMinQualification;
    }

    public CourseDto(String courseStream) {
        this.courseStream = courseStream;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
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
        return "CourseDto{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", Lecturer='" + Lecturer + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseFee='" + courseFee + '\'' +
                ", courseMinQualification='" + courseMinQualification + '\'' +
                '}';
    }

    public String getCourseStream() {
        return courseStream;
    }

    public void setCourseStream(String courseStream) {
        this.courseStream = courseStream;
    }
}
