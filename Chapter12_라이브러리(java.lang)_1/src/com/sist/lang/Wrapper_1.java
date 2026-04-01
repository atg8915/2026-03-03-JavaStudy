package com.sist.lang;
//포장 클래스 => 데이터형을 쉽게 다르기 위해서 만들어진 클래스
//			  => 제네릭에서 사용이 가능하게 만든 클래스
// <클래스> : 데이터형 통일
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer i=10;
			Integer j=20;
			System.out.println(i+j);
			
			int k=10;
			int m=20;
			System.out.println(k+m);
			
			//주요 메소드
			//=> 웹 / 윈도우 => 넘어오는 모든 값 => String
			// String page=request.getParameter("page")
			//=> 정수형으로 변경
			// => 네트워크 => 정수(X), 문자열 전송
			// int page="1";
			/*
			 * 
			 * 	parseXxx()
			 * 	정수형 변환 : Integer.parseInt("10") => 10
			 * 	실수형 변환 : Double.parseDouble("10.5") => 10.5
			 * 	논리형 변한 : Boolean.parseBoolean(true) => true
			 */
			int a=10;
			System.out.println(Integer.toBinaryString(a));
			System.out.println(Integer.toHexString(a));
			System.out.println(Integer.toOctalString(a));
	}

}
