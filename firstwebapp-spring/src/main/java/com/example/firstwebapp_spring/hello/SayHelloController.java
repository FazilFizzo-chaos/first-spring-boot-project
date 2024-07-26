package com.example.firstwebapp_spring.hello;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    //"say hello" => ""
    @RequestMapping("say-hello")
    public String sayHello() {
        return "Hello! What are you learning today?";
    }
}
