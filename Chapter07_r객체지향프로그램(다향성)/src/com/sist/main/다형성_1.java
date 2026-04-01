/*
 * 	5장 : 클래스 구조
 * 	6장 : 객체지향 특성 : 캡슐화 => getter/setter
 * 	7장 : 재사용 : 상속 / 포함
 * 		=> 추가 / 설정 => 다형성
 * 	8장 : 클래스의 종류
 * 		추상클래스 / 인터페이스
 * 	9장 : 내부클래스
 * 	10장 : 라이브러리 => 모듈화
 * 	11장 : 견고한 프로그램 : 예외처리
 * 	------------------------------1권
 * 	2권 => 라이브러리
 * 	java.lang / java.util / java.io / java.net,sql
 * 							파일 			네트워크 	DB
 * 	=> 40%, 50%, 10% 
 * 	1. 204p 클래스 구조
 * 	[접근지정어][제어자] class ClassName
 * 			  -----
 * 			  static : 공통으로 사용
 * 			  final : 종단 => 상속을 내릴 수 없다 (고정)
 * 			  => 라이브러리 : String , System, Math
 * 			  => 제공한 기능을 그대로 사용
 * 			  abstract : 추상
 * 	------ public / protected / default / private
 * 		   ------
 * 		   다른 클래스와 연결 => public
 */
package com.sist.main;

class Super
{
	int a,b;
	public Super()
	{
		a = 100;
		b=200;
		System.out.println("Super a" +a);
		System.out.println("Super b" +b);
	}
	
}
class Sub extends Super
{
	public Sub() {
		System.out.println("Super a" +super.a);
		System.out.println("Super b" +super.b);
		System.out.println("this a" +this.a);
		System.out.println("this b" +this.a);
	}
	public void disp()
	{
		System.out.println("Sub.disCall..." );
	}
}

public class 다형성_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.disp();
	}

}
