package com.se2.raonsecure.controller;

import com.se2.raonsecure.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class ViewController {
    @GetMapping("/mail")
    public String dispMail(){
        return "mail";
    }

}
