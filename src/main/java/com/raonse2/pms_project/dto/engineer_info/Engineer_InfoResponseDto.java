package com.raonse2.pms_project.dto.engineer_info;

import com.raonse2.pms_project.model.Engineer_Info;
import lombok.Getter;

/**
 * 고유 Entity는 건들면 안됨.
 * 따로 DTO 객체 만들어서 전달.
 */
@Getter
public class Engineer_InfoResponseDto {

    private int empno;
    private String emp_name;
    private String mail_address;
    private int create_emp_no;
    //private Date create_date;
    private int update_emp_no;
    //private Date update_date;

    public Engineer_InfoResponseDto(Engineer_Info entity){
        this.empno = entity.getEmpno();
        this.emp_name = entity.getEmp_name();
        this.mail_address = entity.getMail_address();
        this.create_emp_no = entity.getCreate_emp_no();
        this.update_emp_no = entity.getUpdate_emp_no();
    }
}
