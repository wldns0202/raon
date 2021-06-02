package com.raonse2.pms_project.ApiResponse;


import com.raonse2.pms_project.dto.MailResponseDto;

public class ApiAdapter {

    public static MailResponse mailResponse(final MailResponseDto mailResponseDto) {
        return MailResponse.builder()
                .mailResponseDto(mailResponseDto)
                .build();
    }


}

