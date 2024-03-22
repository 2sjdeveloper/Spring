package com.yedam.app.콜렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.yedam.app.EmpVO;

/* 값을 담는 자료구조.
 * 
 * List, Set, Map 
 * list : 중복값 허용. --> 순차적 목록을 쓸 때 사용(제일 많이 사용). add get.
 * set : 중복값 허용 안함. index로 접근 --> 중복값 허용 안할때 사용. 
 * map : <Key, Value> 쌍으로 이뤄짐. key로 접근 --> 검색할 때 사용. put map.
 * 
 * */

public class CollectionTest {
	public static void main(String[] args) {
		// 중복값 제거하기
		List<Integer> list = Arrays.asList(3, 3, 10, 11, 14, 3);
		System.out.println(list);

		// list ==> set
		HashSet set = new HashSet<>(list);
		System.out.println(set);
		
		// List<EmpVO>
		List<EmpVO> empList = new ArrayList<>();
		empList.add(new EmpVO("Kim", "bbb", 20000));
		empList.add(new EmpVO("Park", "ccc", 10000));
		empList.add(new EmpVO("Choi", "aaa", 14000));
		empList.add(new EmpVO("Park", "ccc", 10000));
		
		HashSet<EmpVO> empSet = new HashSet<>(empList);
		System.out.println(empSet.size());
		
		//필터링 : 급여가 15000이상인 사원만 검색
		List<EmpVO> filterList = new ArrayList<>();
		for(EmpVO vo : empSet) {
			if(vo.getSalary() > 15000) {
				filterList.add(vo);				
			}			
		}
		System.out.println(filterList.size());
		
		// ==> stream
		filterList = empSet.stream()
						   .filter(vo -> vo.getLastName().equals("bbb"))
						   .collect(Collectors.toList());
		System.out.println(filterList.get(0).getLastName());
		System.out.println(filterList.size());
	}
}