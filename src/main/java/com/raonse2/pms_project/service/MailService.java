package com.raonse2.pms_project.service;

import com.raonse2.pms_project.dto.MailDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MailService {
    private JavaMailSender mailSender;
    public String mailSend(MailDto mailDto){
        SimpleMailMessage message = new SimpleMailMessage();
        try {
            String[] setTo = mailDto.getAddress().split(",");
            message.setTo(setTo); //받는사람
            message.setSubject(mailDto.getTitle()); //제목
            message.setText(mailDto.getMessage()); //내용

            mailSender.send(message);
        } catch(MailException e){
            e.printStackTrace();
            return "전송 실패";
        }
        return "전송 성공";
    }
}
