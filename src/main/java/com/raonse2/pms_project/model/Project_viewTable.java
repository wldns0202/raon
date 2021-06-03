package com.raonse2.pms_project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Immutable
@Getter                   //lombok
@NoArgsConstructor      //lombok
@Table(name="PROJECT_VIEW")
public class Project_viewTable {

    @Id
    private String project_code;
    private String project_name;
    private String customer_name;
    private String sales_name;
    private Date start_date;
    private Date end_date;
    private String emp_name;

}
