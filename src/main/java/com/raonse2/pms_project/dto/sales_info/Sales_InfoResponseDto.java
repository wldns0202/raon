package com.raonse2.pms_project.dto.sales_info;

import com.raonse2.pms_project.model.Sales_Info;
import lombok.Getter;

/**
 * 고유 Entity는 건들면 안됨.
 * 따로 DTO 객체 만들어서 전달.
 */
@Getter
public class Sales_InfoResponseDto {

    private int salesno;
    private String sales_name;
    private String sales_team;
    private String email_address;

    public Sales_InfoResponseDto(Sales_Info entity){
        this.salesno = entity.getSalesno();
        this.sales_name = entity.getSales_name();
        this.sales_team = entity.getSales_team();
        this.email_address = entity.getEmail_address();
    }
}
