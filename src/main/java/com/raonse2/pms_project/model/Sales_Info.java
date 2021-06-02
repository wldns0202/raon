package com.raonse2.pms_project.model;

import com.raonse2.pms_project.util.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter                   //lombok
@NoArgsConstructor      //lombok
@Entity
@Table(name = "SALES_INFO")
public class Sales_Info extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SALES_INFO")
    @SequenceGenerator(name = "SEQ_SALES_INFO", sequenceName = "SEQ_SALES_INFO", allocationSize = 1)
    private int salesno;
    private String sales_name;
    private String sales_team;
    private String email_address;

    @Builder // 롬복, 빌더 패턴 클래스 생성
    public Sales_Info(String sales_name, String sales_team, String email_address){
        this.sales_name= sales_name;
        this.sales_team= sales_team;
        this.email_address= email_address;

    }
    public void update(String sales_name, String sales_team,String email_address){
        this.sales_name= sales_name;
        this.sales_team= sales_team;
        this.email_address= email_address;
    }

}
