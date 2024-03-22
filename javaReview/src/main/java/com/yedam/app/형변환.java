package com.yedam.app;

/* 래퍼클래스
 * char - Charcter
 * byte - Byte
 * int - Integer
 * short - Short
 * long - Long
 * float - Float
 * double - Double
 * boolean - Boolean
 *  
 * */

public class 형변환 {
	public static void main(String[] args) {
		// other type ==> String
		Integer score = 100;
		String s = Integer.toString(score);
		
		double avg = 90.5;
		s = Double.toString(avg);
		
		
		//String ==> other type
		score = Integer.parseInt(s);
		avg = Double.parseDouble(s);
	}
}
