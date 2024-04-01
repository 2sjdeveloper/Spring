package com.dbal.app.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO {
	
    private String employeeId;   
    private String firstName;
    private String lastName;
    private String email;
    private Date hireDate; 
    private String jobId;	
    private String departmentId;
    private Integer salary;
}
