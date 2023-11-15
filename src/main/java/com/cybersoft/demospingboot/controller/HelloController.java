package com.cybersoft.demospingboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller :  Dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
 * @RessponseBody : Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *
 * @RestController : là sự kết hợp của @Controller  và @ResponseBody => Viết API
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Sping boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Sping Cybersoft";
    }

}
