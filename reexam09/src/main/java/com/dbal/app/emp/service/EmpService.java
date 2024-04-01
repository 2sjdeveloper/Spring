package com.dbal.app.emp.service;

import java.util.List;

import com.dbal.app.emp.model.ProductVO;
import com.dbal.app.model.EmpVO;


public interface EmpService {
	public int getProductNo();
	public EmpVO getEmp(EmpVO empVO);
	public List<EmpVO> getShopList();
	public boolean insertProduct(ProductVO vo);
}
