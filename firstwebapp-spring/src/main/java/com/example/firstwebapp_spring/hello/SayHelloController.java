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

    @RequestMapping("say-hello-html")
    public String sayHelloHtml() {
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append("<html>");
      stringBuffer.append("<head>");
      stringBuffer.append("<title>My first HTML Page</title>");
      stringBuffer.append("</head>");
      stringBuffer.append("<body>");
      stringBuffer.append("My first html page with body");
      stringBuffer.append("</body>");
      stringBuffer.append("</html>");
      
      return stringBuffer.toString();
    }
}
