package com.raonse2.pms_project.dto;

import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MailDto {
    private String address;
    private String title;
    private String message;
}
