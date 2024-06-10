package com.crazy.microservicescli.controller;

import com.crazy.microservicescli.dao.StudentRepository;
import com.crazy.microservicescli.entity.Student;
import com.crazy.microservicescli.service.StudentService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author ASUS
 * @Date 2024/6/6 18:00
 * @Version 1.0
 */
@RequestMapping("students")
@RestController
public class StudentController {
    @Value("${secretKey}")
    private  String key;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentService service;
    @GetMapping("")
    public List<Student> getAllStudent(){
        System.out.println(key);
        return studentRepository.findAll();
    }
    @PostMapping()
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentRepository.getReferenceById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") Long id,Student updatedStudent){
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if(existingStudent !=null){
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setAge(updatedStudent.getAge());
            return studentRepository.save(existingStudent);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
    }
    @GetMapping("/feign/{id}")
    public Student feignGetStudentbyId(@PathVariable("id") Long id){
            return service.getStudentById(id);
    }


}
