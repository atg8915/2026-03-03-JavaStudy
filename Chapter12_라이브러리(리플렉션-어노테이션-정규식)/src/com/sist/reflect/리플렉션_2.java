package com.sist.reflect;

import java.lang.reflect.Field;

/*
 * 	자바는 시점
 * 		= 컴파일 시점 (javac)
 * 		= 실행 시점 (java)
 * 		= 리플렉션 실행시점에 클래스의 모든 정보를 읽어서 조작이 가능
 * 		  -----
 * 		  String / MyBatis / Hibernate
 * 			=> 동적 객체 생성 / 어노테이션 처리
 * 			=> 메소드를 자동 호출하게 만드는
 * 		= 클래스 정보
 * 		  클래스 구조
 * 		  class ClassName
 * 		  {
 * 			------
 * 			변수
 * 			------	
 * 			생성자
 * 			------
 * 			메소드
 * 			------
 * 		  }
 */
public class 리플렉션_2 {
class Student
{
	private String name="홍길동";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try
//		{
//			Student std = new Student();
//			Class cls = std.getClass();
//			Field f=cls.getDeclaredField("name");
//			f.setAccessible(true);
//			System.out.println(f.get(std));
//			f.set(std, "박문수");
//			System.out.println(f.get(std));
//		}catch(Exception ex) {}
	}
}
