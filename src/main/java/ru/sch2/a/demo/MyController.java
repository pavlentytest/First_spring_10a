package ru.sch2.a.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/about")
    public String bbbb() {
        return "about";
    }
}
