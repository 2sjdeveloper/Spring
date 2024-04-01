package com.dbal.app.emp.mapper;

import java.util.List;

import com.dbal.app.emp.model.ProductVO;
import com.dbal.app.model.EmpVO;

public interface EmpMapper {
	public int getProductNo();
	public List<EmpVO> getShopList();
	public EmpVO getEmp(EmpVO empVO);
	public int insertProduct(ProductVO vo);
}

