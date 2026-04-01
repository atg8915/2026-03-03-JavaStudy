package com.sist.oop;
/*
 * 	접근지정어 / 제어자
 * 	구분 => 패키지 => 안에 있는 클래스 가져 오기=>import
 * 	1.package : 한번ㅁㅏㄴ사용
 * 	2.import => 여러번 가용가능
 *  3.class
 *  `------
 *  	|접근지정어
 *  
 *  4.클래스 구조
 *  	class ClassName{
 *  	변수=> private
 *  	생성자 => 다른 클래스와 연결 => public
 *  	메소드 => 다른 클래스와 통신 => public
 * 		}
 * 1) static / instance
 * 	  static 특
 * ------------- 공유 목적 => 사이트(동일한 내용이 나온다)
 * 							로그 / 공통 CSS
 * 					객체 생성없이 사용이 가능
 * 		=> 컴파일시에 메모리 저장
 * 		=> 독립적으로 사용이 가능 ==> 클래스.변수명
 * 								클래스.메소드()
 * 		=> 공유 멤버 변수 : 회사명 , 학교명 ...
 * 		---------- 변경이 되면 모든 인스턴스 한번에 변경
 * 		---------- 오라클 저장되는 데이터
 * 		=> 사용제한
 * 		--------- static메소드 안에서 static 만 사용이 가능	
 * 		--------- 인스턴스를 사용
 * 				  반드시 new 이용해서 객체 생성후에 사용이 가능
 * 		=> 사용 목적 : 전역 변수 / 전역 함수
 * 		2) instance 변수
 * 			객체변수 => 따로 메모리를 만들어서 저장 후 사용
 * 						맛집 : 300개
 * 						: 다른 주소에 저장된 데이터는 접근이 불가능
 * 						--------------------
 * 						반드시 저장시 new 생성자()
 * 								  ---- 새로운 메모리
 * 			=> static / instance => 프로그램 종료시까지 메모리유지
 * 			=> instance변수 구분 => this.변수명
 * 			=> **static은 this를 사용 할 수 없다
 * 			class A
 * 			{
 * 				int a,b;
 * 				static int c;
 * 			}
 * 			-------------------- 실제로 저장되는 메모리 크기 : 8byte
 * 			A aa=new A();
 * 			  Stack		heap		MethodArea
 * 			  aa--->    -----		-----c-----
 *  	
 *  	
 *  }
 *   
 */
class Sawon{
	private int sabun;
	private String name;
	String dept;
	protected String job;
	public String loc;
	private long pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
}
public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong=new Sawon();
		hong.dept = "개발부";
		hong.job="사원";
		hong.loc = "제주";
		// => 메소드를 이용하여 접근
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		// => 변수 => 저장 setXxx , 읽기 getXxx
		
		System.out.println("이름:" + hong.getName());
		System.out.println("사번:" + hong.getSabun());
		System.out.println("연봉:" + hong.getSabun());
		System.out.println("부서:" + hong.dept);
		System.out.println("직위:" + hong.job);
		System.out.println("근무지:" + hong.loc);
	}

}
