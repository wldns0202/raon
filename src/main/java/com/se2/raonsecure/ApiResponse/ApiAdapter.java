package com.se2.raonsecure.ApiResponse;


import com.se2.raonsecure.dto.MailResponseDto;

public class ApiAdapter {

    public static MailResponse mailResponse(final MailResponseDto mailResponseDto) {
        return MailResponse.builder()
                .mailResponseDto(mailResponseDto)
                .build();
    }


}
