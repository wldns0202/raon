package com.se2.raonsecure.controller;

import com.se2.raonsecure.ApiResponse.ApiAdapter;
import com.se2.raonsecure.ApiResponse.MailResponse;
import com.se2.raonsecure.dto.MailDto;
import com.se2.raonsecure.dto.MailResponseDto;
import com.se2.raonsecure.service.MailService;
import lombok.AllArgsConstructor;
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
        MailResponseDto mailResponseDto = null;
        try{
            mailService.mailSend(mailDto);
            mailResponseDto = new MailResponseDto("전송 완료");
        } catch(Exception e){
            mailResponseDto = new MailResponseDto("전송 실패. "+ e);
        }
        return ApiAdapter.mailResponse(mailResponseDto);
    }
}
