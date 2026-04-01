package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 	리플렉션 => 동적제어
 * 		=> 현재 실행중 프로그램을 제어
 * 					------
 * 					 클래스 : 멤버변수 / 생성자 / 메소드
 * 		=> 클래스명을 이용
 * 			반드시 => 패키지명부터 설정한다
 * 		=> 메소드 제어(호출) , 변수값을 변경
 * 						   ---------- private 접근이 가능
 * 									  OOP가 깨진다(보안)
 * 		=> 객체 생성
 * 		=> 어노테이션 확인
 * 		-----------------------> Spring(자동화)
 * 		=> 리플렉션 + 어노테이션 : 프레임워크 개발
 */
class Sawon 
{
	private String name;
	public Sawon() {}
	//public aa()
	public void info()
	{
		System.out.println("사원정보");
	}
}
public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class clsName = Class.forName("com.sist.reflect.Sawon");
			Constructor con = clsName.getConstructor();
			
			Object obj = con.newInstance();
			
			Method m = clsName.getMethod("info"); // 메소드 정보
			m.invoke(obj); //실제 메소드 호출
		}catch (Exception ex) {}
	}

}
