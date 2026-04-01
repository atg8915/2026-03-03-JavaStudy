package com.sist.main;
/*
 * 	7장
 * 	--- 상속 / this / super / this() / super()
 * 		--- 메모리 할당
 * 	this : 자신의 객체
 * 		this는 객체 생성시에 주소값 저장
 * 		this => static으로 되어 있다
 * 		A a=new A();
 * 		this = a ===> JVM에서 자동화
 * 
 * 	class A
 * {
 * 		1.this 사용처 => 클래스에서만 사용이 가능
 * 		  생성자
 * 		  인스턴스 메소드에서만 사용이 가능
 * 	      static 메소드 , 블록에는 사용이 불가능
 * 		2. 보통 => 매개변수 / 인스턴스변수가 중복인 경우 => 구분을 위해서 사용
 * 		  private int a;
 * 		  public void displat(int a)
 * 		  {
 * 			a=a; ==> 매개변수
 * 			==> this.a=a
 * 			=> 지역변수와 매개변수 우선순위
 * 		  }
 * }
 */
class Animal
{
	String name = "동물";
	public void run() 
	{
		System.out.println("걷는다");
	}
	public void eat() 
	{
		System.out.println("먹는다");
	}
	int age = 3;
}
class Dog extends Animal
{
	
}
class Cat extends Animal
{
	
}
class Pig extends Animal
{
	
}
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.eat();
		Animal a = new Dog();
		a.eat();
		a=new Pig();
		a.eat();
		a=new Cat();
		a.eat();
	}

}
