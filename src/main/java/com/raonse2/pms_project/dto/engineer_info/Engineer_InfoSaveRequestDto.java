package com.raonse2.pms_project.dto.engineer_info;

import com.raonse2.pms_project.model.Engineer_Info;
import lombok.Builder;
import lombok.Getter;

/**
 * 고유 Entity는 건들면 안됨.
 * 따로 DTO 객체 만들어서 전달.
 */
@Getter
public class Engineer_InfoSaveRequestDto {

    private String emp_name;
    private String mail_address;
    private int create_emp_no;
    private int update_emp_no;

    @Builder
    public Engineer_InfoSaveRequestDto(String emp_name, String mail_address, int create_emp_no, int update_emp_no){
        this.emp_name = emp_name;
        this.mail_address = mail_address;
        this.create_emp_no = create_emp_no;
        this.update_emp_no = update_emp_no;

    }

    public Engineer_Info toEntity(){
        return Engineer_Info.builder()
                .emp_name(emp_name)
                .mail_address(mail_address)
                .create_emp_no(create_emp_no)
                .update_emp_no(update_emp_no)
                .build();
    }
}
