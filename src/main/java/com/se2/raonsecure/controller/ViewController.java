package com.se2.raonsecure.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class ViewController {
    @GetMapping("/mail")
    public String toMail(){
        return "mail";
    }

    @GetMapping("/select")
    public String toSelect(){
        return "select";
    }

}
