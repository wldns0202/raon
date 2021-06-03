package com.raonse2.pms_project.ApiResponse;

import com.raonse2.pms_project.dto.MailResponseDto;
import lombok.Builder;


public class MailResponse extends ApiResponse<MailResponseDto> {

    @Builder
    public MailResponse(final MailResponseDto mailResponseDto) {
        super(mailResponseDto);
    }
}