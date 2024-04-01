package com.dbal.app.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbal.app.emp.mapper.EmpMapper;
import com.dbal.app.emp.model.ProductVO;
import com.dbal.app.emp.service.EmpService;
import com.dbal.app.model.EmpVO;


@Service
public class EmpServiceImpl implements EmpService {

	@Autowired EmpMapper empMapper;
	
	@Override
	public EmpVO getEmp(EmpVO empVO) {
		return empMapper.getEmp(empVO);
	}

	@Override
	public List<EmpVO> getShopList() {
		return empMapper.getShopList();
	}

	@Override
	public boolean insertProduct(ProductVO vo) {
		return empMapper.insertProduct(vo) == 1? true :false;
	}

	@Override
	public int getProductNo() {
		return empMapper.getProductNo();
	}




}
