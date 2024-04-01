package com.dbal.app.emp.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVO {
	
    private String productId;   
    private String productName;
    private String productPrice;
    private String productInfo;
    private Date productDate;
    private String company;
    private String managerId;    
}
