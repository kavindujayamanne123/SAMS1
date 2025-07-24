package com.ijse.sams.sams.service.coustome;

import com.ijse.sams.sams.dto.CourseDto;
import com.ijse.sams.sams.service.SuperService;

import java.util.ArrayList;

public interface CourseService extends SuperService {
    public String saveCourses(CourseDto courseDto) throws Exception;
    public String updateCourses(CourseDto courseDto)throws Exception;
    public String deleteCourses(String id)throws Exception;
    public CourseDto getCourseSelected(String id)throws Exception;
    public ArrayList<CourseDto> getAllCourses()throws Exception;

}
