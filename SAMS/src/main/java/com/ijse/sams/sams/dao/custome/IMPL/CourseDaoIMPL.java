package com.ijse.sams.sams.dao.custome.IMPL;

import com.ijse.sams.sams.Entity.CourseEntity;
import com.ijse.sams.sams.dao.CrudUtil;
import com.ijse.sams.sams.dao.custome.CourseDao;

import java.util.ArrayList;

public class CourseDaoIMPL implements CourseDao {
    @Override
    public boolean save(CourseEntity courseEntity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Courses(?,?,?,?,?,?,?,?)",
                courseEntity.getCourseId(),
                courseEntity.getCourseName(),
                courseEntity.getCourseDescription(),
                courseEntity.getLecturer(),
                courseEntity.getCourseDuration(),
                courseEntity.getCourseFee(),
                courseEntity.getCourseStream(),
                courseEntity.getCourseMinQualification());
    }

    @Override
    public boolean update(CourseEntity courseEntity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Courses SET name = ?,description = ?, lecturse = ?,duration = ?,coursefees = ?,courseStream = ?,qualification = ? WHERE = courseID",
                courseEntity.getCourseName(),
                courseEntity.getCourseDescription(),
                courseEntity.getLecturer(),
                courseEntity.getCourseDuration(),
                courseEntity.getCourseFee(),
                courseEntity.getCourseStream(),
                courseEntity.getCourseMinQualification(),
                courseEntity.getCourseId());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public CourseEntity search(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CourseEntity> getAll() throws Exception {
        return null;
    }
}
