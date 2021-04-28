package com.se2.raonsecure.ApiResponse;

import com.se2.raonsecure.dto.MailResponseDto;
import lombok.Builder;


public class MailResponse extends ApiResponse<MailResponseDto> {

    @Builder
    public MailResponse(final MailResponseDto mailResponseDto) {
        super(mailResponseDto);
    }
}