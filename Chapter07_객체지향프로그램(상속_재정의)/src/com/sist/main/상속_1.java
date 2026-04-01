package com.sist.main;

import javax.swing.JFrame;

/*
 * 	1. 상속
 * 		=> 기능을 그냥 사용하는 것이다
 * 			-----------
 * 				=> 마음에 안들 경우 변경할 수 있다(오버라이딩)
 * 	2. 왜 배울까?
 * 		1) 코드 줄이기 => CV
 * 		2) 상속받기 => extends
 * 		3) 상속을 받으면 => 코드를 따라 할 필요가 없다
 * 			=> 내부적으로 메모리에 저장
 * 			=> 코드가 이미 상속받은 클래스에 내장
 * 	3. 오해하는 부분
 * 		상속하면 코드 복사하는것(X)
 * 		상속 내린 클래스와 연결이 되는 부분
 * 		=> 상속 내린 클래스를 변경하는 상속받은 클래스에 영향
 */
public class 상속_1 /*extends JFrame*/ {
//	public 상속_1()
//	{
//		//크기
//		setSize(800, 600);
//		//화면을보여라
//		setVisible(true);
//	}
	JFrame f= new JFrame();
	public 상속_1()
	{
		f.setSize(800,600);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new 상속_1(); //생성자만 호출
		new 상속_1();
		
	}

}
