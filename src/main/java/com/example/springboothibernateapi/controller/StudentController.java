package com.example.springboothibernateapi.controller;

import com.example.springboothibernateapi.model.Student;
import com.example.springboothibernateapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<Student> get()
    {
        return studentService.get();
    }

    @GetMapping("/{department}")
    public List<Student> get(@PathVariable("department") String StudentDepartment)
    {
        return studentService.get(StudentDepartment);
    }

    @GetMapping("{department}/{cgpa}")
    public List<Student> get(@PathVariable("department") String StudentDepartment, @PathVariable("cgpa") int cgpa)
    {
        return studentService.get(StudentDepartment,cgpa);
    }

    @PostMapping("/")
    public Student save(@RequestBody Student studentObj)
    {
        System.out.println(studentObj);
        studentService.save(studentObj);
        return  studentObj;

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id)
    {
        studentService.delete(id);
        return "delete successfully";
    }

    @PutMapping("/")
    public Student update(@RequestBody Student studentObj)
    {
         return studentService.update(studentObj);
   
    }


}
