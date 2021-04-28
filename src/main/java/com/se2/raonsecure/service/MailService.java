package com.se2.raonsecure.service;

import com.se2.raonsecure.dto.MailDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MailService {
    private JavaMailSender mailSender;
    private static final String FROM_ADDRESS = "wldns0202@gmail.com";

    public String mailSend(MailDto mailDto){
        SimpleMailMessage message = new SimpleMailMessage();
        try {
            message.setTo(mailDto.getAddress()); //받는사람
            message.setFrom(MailService.FROM_ADDRESS); //보내는사람
            message.setSubject(mailDto.getTitle()); //제목
            message.setText(mailDto.getMessage()); //내용

            mailSender.send(message);
        } catch(MailException e){
            e.printStackTrace();
        }
        return "전송 성공";
    }
}
