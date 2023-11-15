package com.cybersoft.demospingboot.controller;

import com.cybersoft.demospingboot.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private List<Student> list = new ArrayList<>();
    @PostMapping("")
    public ResponseEntity<?> insertPost(Student student){
        list.add(student);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> insertPath(@PathVariable String name,@PathVariable int age){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        list.add(student);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/body")
    public ResponseEntity<?> insertBody(@RequestBody Student student){
        list.add(student);

        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
