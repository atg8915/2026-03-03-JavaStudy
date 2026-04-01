/*
 * 흐름제어
 * 	건너뛴다 / 반복수행/ 반복제어
 * 
 * 	조건문
 * 		=단일, 선택,다중
 * 	선택문
 * 		=선택문
 * 	반복문
 * 		=do~while
 * 		=while
 * 		=for
 * 	반복제어문
 * 		=break
 * 		=continue
 */
import java.util.Scanner;
public class 제어문_종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		//멘터 => 메모리에 저장


		int num = sc.nextInt();
		
		if(num%2==0) 
		{
			System.out.println(num+"(는)은 짝수입니다");
		}
		if(num%2==1)//홀수 ㅜㅕㅡ2%1=0
		{
			System.out.println(num+"(는)은 홀수입니다");
		}
	}

}
