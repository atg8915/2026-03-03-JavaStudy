package com.sist.main;
/*
 * 	객체지향의 4대 특성
 * 	=> 데이터 보호 : 캡슐화
 * 		변수는  private (은닉화)
 * 		=> 외부에서도 사용이 가능 => getter/setter
 * 		
 * 		캡슐화의 목적
 * 		1. 데이터보호 => 잘못된 값 설정 방지 (손실 , 변경)
 * 			=> 데이터베이스 : 무결정 원칙
 * 			=>AWS : 평생 1번만 무료
 * 		-------------------------------------	
 * 		2. 유지보수 용이 => 내부는 변경이 안됨
 * 		3. 코드 안정성 향상
 * 		4. 구현
 * 			변수는 private로 선언
 * 			getter / setter 접근 연습 : lombok
 * 			**전체를 만드는것보단 필요한 부분만 설정
 * 			=>윈도우 : Button/TextField
 * 			=> 다른 메소드를 사용할 수 있다
 * 		=>  캡술화는 데이터를 감추고 메소드를 이용해서 접근하는
 * 			기술(안정성 / 유지보수를 높이는 기술)
 * 			** 웹에서 주로 사용되는 기술
 * 			**웹에서는 시큐어 코딩(private)
 * 		2.상속 : 재사용 일종
 * 				------
 * 				상속 : is-a : 수정해서 확장
 * 				포함 : has-a: 있는 그대로 사용
 * 							=> 라이브러리 => 표준회
 * 							=> 80%
 * 					=> 데이터베이스 / 빅데이터 / 크롤링
 * 					=> 외부 라이브러리
 * 					=> 자바에서 지원하는 라이브러리
 * 					=> 외부업체에서 만든 라이브러리
 * 		1) 개념
 * 			1. 기존의 클래스의 멤버변수 /메소드 받아 확장 프로그램
 * 			2.코드의 재사용 / 확장성을 높이는 방법
 * 			3. 상속의 기워드 => extends
 * 		2) 특징
 * 			1. 단일 상속 (다중 상속 => 증복된 메소드 , 변수 => 충돌)
 * 				=> 다중 상속을 하려면 인터페이스를 사용한다
 * 			2.상속 예외
 * 			  = 생성자
 * 			  = 초기화 블록
 * 			  = static
 * 			  = private
 * 			3. super 키워드를 이용해 생성자 / 메소드 호출 가능
 * 		3) 장점
 * 			= 유지보수가 좋다
 * 			= 개발 시간 단축할 수 있다
 * 		4) 단점
 * 			= 캡슐화 파괴 => OOP의 기본 목적
 * 			=결합성 강하다 : 의존도가 상위 클래스 => 영향력이 높다
 * 			= 결함이 많이 발생
 * 				----------- 상속 => 재정의 : 개발자마다 다르게..
 * 			= 문서화 작업이 어렵다(포함)
 * 		단일 상속만 가능 => extends
 * 		상속 내리는 클래스 : 부모 클래스 / 슈퍼클래스 / 베이스 클래스
 * 		
 * 		상속 받는 클래스 : 자식 클래스 / 서브 클래스 / 파생 클래스
 * 			=> 메모리 상에서는 상속 받는 클래스가 크다
 * 			=> 위로 올라갈 수록 크다
 * 			=> 모든 클래스는 Object 클래스 상속을 받는다
 * 			=> 관련된 클래스를 여러개 묶어서 관리
 * 			=> 형변환 (클래스의 크다 : 상속 , 포함)
 * 			=> 예)
 * 			
 */
import java.util.*;
class Super
{
	int a, b, c;
	public void display() 
	{
		System.out.println("Super:display() Call");
	}
}
class Sub extends Super
{
	//int a, b, c; => 내리상속 => 모든 : 생성자 , 초기화블록 . static
	//private : 접근이 불가능 => getter / setter
	//메모리 상에 존재
	int d;
}
//상속 내리는 클래스는 상솓받은 클래스의 데이터나 메소드를 사용할 수 없다
public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println("sub.a= " + sub.a);
		System.out.println("sub.b= " + sub.b);
		System.out.println("sub.c= " + sub.c);
		System.out.println("sub.d= " + sub.d);
		sub.display();
		Super su = new Super();
		su.display();
		//System.out.println("su.d = " +sub.d);
		Super s = new Sub();
		s.display();
		//변수(클래스형) / 메소드(생성자)
		Sub ss = (Sub)su;
		ss.display();
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("aaa");
		list.add('A');
		list.add(new Sub());
		
		Object o= list.get(3);
		
		Sub sss=(Sub)list.get(3);
		//제네릭 
	}

}
