//숫자 2개 입력 => 최대값 / 최소값

import java.util.Scanner;

public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=sc.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2=sc.nextInt();
		
		int num3=num1>num2?num1:num2;
		if(num3==num1)
			System.out.println("최대값: " +num3);
		if(num3==num2)
			System.out.println("최대값: " +num3);
		
		
	}

}
