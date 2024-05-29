package com.example.demo2.Service;

import com.example.demo2.Model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private List<Course> listCourses = new ArrayList<>();
    public void add(Course newProduct){ listCourses.add(newProduct);}
    public List<Course> GetAll() {return listCourses;}
}
