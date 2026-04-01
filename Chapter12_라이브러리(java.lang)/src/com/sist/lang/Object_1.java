package com.sist.lang;
/*
 * 	자바에서 지원하는 클래스 집합 : 라이브러리
 * 	= 라이브러리
 * 		1) 자바에서 지원
 * 		2) 외부 라이브러리 => 자바 개발업체 / 오픈소스
 * 			=> mvnrepository.com
 * 			=> lombok.jar / jsoup/jar ...
 * 			=> spring 
 * 
 * 		
 * 	499page
 * 	---------
 * 		Object 클래스 : 모든 클래스 상위 클래스
 * 			=> extends Object => java.lang.Object
 * 								 ----------------
 * 								 | System/String/number/StringBuffer/Thread
 * 		1. 객체 생성 ~ 소멸
 * 		   new		finalize() : 소멸자 메소드
 * 					=> 메모리에서 해제
 * 		2. 복제 / 비교
 * 		3. 문자열 
 */		
class Sawon
{
	private String name;
	private String dept;
	public Sawon(String name, String dept)
	{
		this.name=name;
		this.dept=dept;
		//this => Sawon 클래스 자신의 객체
		//구분 : 매개변수 / 인스턴스 변수 구분
		//this는 static => 모든 클래스에 대입
		//this는 new를 이용해서 객체 생성시에 주소값을 대입
		//변수 충돌이 없는 경우 => this.을 생략
		
	}
	
	
	
	public void print()
	{
		System.out.println("이름:" + name);
		System.out.println("부서:" + dept);
	}
	//소멸자
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제");
	}
	/*
	 * 	  설계			객체 생성			객체 활용
	 * 	class 제작 ===== new 생성자() ===== 객체.메소드()
	 * 										| 객체 소멸
	 * 									 객체=null
	 * 										| ---finalize()
	 * 									 GC()에 의해 해제
	 */
}
public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Sawon sa = new Sawon("홍길동", "개발부");
		//객체 활용
		sa.print();
		//객체 소멸
		sa=null;
		//자동으로 GC => 수거 => 메모리가 많은 상태 => 종료휴에 나즁에 회수
		//finalize가 호출
		//바로 해제
		System.gc();
	}

}
