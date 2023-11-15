package com.cybersoft.demospingboot.controller;

import com.cybersoft.demospingboot.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("")
    public String hello(@RequestParam String hoten, @RequestParam int tuoi) {
        return "Hello Sping boot " + hoten +" - tuoi " + tuoi;

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
