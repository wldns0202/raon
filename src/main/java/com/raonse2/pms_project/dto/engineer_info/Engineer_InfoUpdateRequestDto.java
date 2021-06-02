package com.raonse2.pms_project.dto.engineer_info;

import lombok.Builder;
import lombok.Getter;

/**
 * 고유 Entity는 건들면 안됨.
 * 따로 DTO 객체 만들어서 전달.
 */
@Getter
public class Engineer_InfoUpdateRequestDto {

    private String emp_name;
    private String mail_address;
    private int update_emp_no;

    @Builder
    public Engineer_InfoUpdateRequestDto(String emp_name, String mail_address, int update_emp_no){
        this.emp_name = emp_name;
        this.mail_address = mail_address;
        this.update_emp_no = update_emp_no;

    }

}
