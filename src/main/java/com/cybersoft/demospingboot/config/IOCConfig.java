package com.cybersoft.demospingboot.config;

import com.cybersoft.demospingboot.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOCConfig {

    @Bean
    public Student createStudentIOC(){
        Student student = new Student();
        student.setName("Cypersoft");
        student.setAge(21);

        return student;
    }
}
