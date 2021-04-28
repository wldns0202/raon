package com.se2.raonsecure.controller;

import com.se2.raonsecure.ApiResponse.MailAdapter;
import com.se2.raonsecure.ApiResponse.MailResponse;
import com.se2.raonsecure.dto.MailDto;
import com.se2.raonsecure.dto.MailResponseDto;
import com.se2.raonsecure.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MailController {
    private final MailService mailService;


    @PostMapping("/api/send")
    public @ResponseBody
    MailResponse execMail(@RequestBody MailDto mailDto){
        mailService.mailSend(mailDto);
        MailResponseDto mailResponseDto = new MailResponseDto("전송 완료");
        return MailAdapter.mailResponse(mailResponseDto);
    }
}
