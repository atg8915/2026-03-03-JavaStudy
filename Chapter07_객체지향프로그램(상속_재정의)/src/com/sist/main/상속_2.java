package com.sist.main;
/*
 * 	상속 => 다른 클래스의 변수 / 메소드는 사요이 가능
 * 							----
 * 							프로그램에 맞지 않는다
 * 							변경해서 사용 : 오버라이딩
 * 	오버라이딩 : 변경해서 덮어쓴다
 * 		1. 상속이 존재
 * 		2. 메소드명 동일
 * 		3. 매개변수 동일
 * 		4. 리턴형 동일
 * 		5. 접근지정어 => 확대 (o), 축소 (X)
 * 			<======= 확대
 * 			public > protected > default > private
 * 				=====> 축소
 * 		void aaa()
 * 		  |
 * 		private void aaa()
 * 
 * 		void aaa()
 * 		  |
 * 		protected void aaa()
 * 		public void aaa()
 * 		void aaa()
 * 		 
 */		
class A
{
	public void disp() {}
}
class B extends A
{
	//void disp() {}
	public void disp() {}
}
class Animal
{
	public void run() {
		System.out.println("두발로 걷는다");
	}
	public void eat() {
		System.out.println("수저로 먹는다");
	}
}
class Dog extends Animal
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		 System.out.println("개같이 먹는다");
	}
	
}
class Pig extends Animal
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("돼지 같이 먹는다");
	}
	
}
class Super
{
	int a,b;
	public void display()
	{
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}
class Sub extends Super
{
	int c;
	int a,b;
	//초기화
	public Sub()
	{
		super.a=100;
		super.b=200;
	}
	public void print()
	{
		super.display();
		System.out.println("a=" + this.a);
		System.out.println("b=" + this.b);
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog dog=new Dog();
//		dog.run();
//		dog.eat();
//		Pig pig = new Pig();
//		pig.run();
//		pig.eat();
		Sub sub=new Sub();
		sub.display();
	}

}
