package com.sist.main;
class Human
{
	String name;
	String sex;
	public Human() // 상속에서 예외
	{
		name = "심청이";
		sex="여자";
		System.out.println("Human() Call...");
	}
}
//class Student extends Human
//{
//	// name , sex
//	public Student(String name, String sex)
//	{
//		this.name = name;
//		this.sex =sex;
//	}
//	public void display()
//	{
//		System.out.println("이름 : "+ name);
//		System.out.println("성별 : " + sex);
//	}
//}
// 상속 내린 클래스 => 메모리 할당 (생성자)
// 상속 받은 클래스 => 메모리 할당
/*
 * 		sawon s =new Sawon()
 */
class Sawon extends Human
{
	String name , sex; // 변수의 오버라이딩
	public Sawon()
	{
		super();
		
		System.out.println("Sawon() Call...");
		this.name="박문수";
		this.sex = "남자";
	}
	public void display()
	{
		System.out.println("이름 : "+ super.name);
		System.out.println("성별 : " + super.sex);
		System.out.println("이름 : "+ this.name);
		System.out.println("성별 : " + this.sex);
	}
}
public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student std = new Student("홍길동", "성별");
//		std.display();
		Sawon s=new Sawon();
		s.display();
	}

}
