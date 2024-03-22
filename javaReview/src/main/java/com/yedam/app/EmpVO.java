package com.yedam.app;

import java.util.Date;
import java.util.Objects;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class EmpVO {
	
	private int employeeId;
	final private String firstName;
	final private String lastName;
	private String email;
	private Date hireDate;
	final private Integer salary;
	private String jobId;
	private String departmentId;
	private String managerId;
	private String phone;
	private String photo;
		
	//생성자 역할 : 객체 생성될때 필드를 초기화 시켜줌
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getSalary() {
		return this.salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		EmpVO vo = (EmpVO) obj;	//부모, 자식간에는 형변환이 가능
		return this.firstName.equals(vo.getFirstName()) && 
				this.lastName.equals(vo.getLastName());  
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.firstName, this.lastName);
	}
}

