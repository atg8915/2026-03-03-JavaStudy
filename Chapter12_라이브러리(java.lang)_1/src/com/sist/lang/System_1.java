package com.sist.lang;
/*
 * 	System
 * 		1) 프로그램 종료
 * 			System.exit(0) => 0:정상종료 , 비정상 종료
 * 			-------------- 윈도우 종료 (웹에서는 사용하지 않는다)
 * 		2) 입출력
 * 			System.in
 * 			System.out
 * 			---------- 자바 표준 입출력
 * 			System.in.read() => 키보드 입력값을 받을 경우
 * 			-------------- 반드시 예외 처리
 * 			-------------- 리턴형 int
 * 			System.out.println() => 화면출력
 * 		3) 메모리 회수
 * 		4) 시간 측정
 */
public class System_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=1; i<=10; i++)
		{
			if(i==a)
			{
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			System.out.println("i=" + i);
		}
		System.out.println("시작");
		System.out.println("GO");
	}

}
