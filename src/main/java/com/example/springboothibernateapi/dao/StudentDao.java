package com.example.springboothibernateapi.dao;

import com.example.springboothibernateapi.model.Student;

import java.util.List;

public interface StudentDao {
    //for get all Student
    List<Student> get();

    //for get student depend on department
    List<Student> get(String StudentDepartment);

    //for get student depend on department and cgpa
    List<Student> get(String StudentDepartment,int Cgpa);


    //for post the Student
    void save(Student student);

    //for Delete the student

    void delete(int StudentId);

    //for update the student 
    void updateStudent(Student studentObj);


}
