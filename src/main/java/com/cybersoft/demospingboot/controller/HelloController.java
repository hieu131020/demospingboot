package com.cybersoft.demospingboot.controller;

import com.cybersoft.demospingboot.entity.Student;
import com.cybersoft.demospingboot.entity.UsersEntity;
import com.cybersoft.demospingboot.payload.request.LoginRequest;
import com.cybersoft.demospingboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Controller :  Dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
 * @RessponseBody : Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *
 * @RestController : là sự kết hợp của @Controller  và @ResponseBody => Viết API
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    // tham số truỳen trên trình duyệt : @RequestParam
    // tham số truyền ngầm : @RequestParam
    // tham số đóng vai trò như là một đường dẫn : @PathVariable
    // tham số ngầm là đối tượng : @ResquestBody

    @Autowired
    private Student student;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<?> hello() {
        List<UsersEntity> list = userRepository.findAll();
        return new ResponseEntity<>(list,HttpStatus.OK);

    }

    @PostMapping("/cybersoft")
    public String helloCybersoft(@RequestBody LoginRequest loginRequest){
        return "Hello Sping Cybersoft " + loginRequest.getUsername() + " - " + loginRequest.getPassword();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id){

        return new ResponseEntity<>("Update " + id, HttpStatus.OK);
    }


}
