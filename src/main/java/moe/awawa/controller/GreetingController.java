package moe.awawa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class GreetingController {

    @RequestMapping
    public String handle() {
        return "hello";
    }

    
}
