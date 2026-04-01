//논리연산자 : 조건문 (유효성 검사, 범위, 기간 확인) , 반복문
//조건 => 부정 / 논리 / 비교 => 사용이 가능
// => boolean
/*
 * 	1. 조건문 / 반복문
 * 	2.제어문 : 연산자 => 형식 , 결과값
 * 
 * 	---------------------------- 메소드(핵심)
 * 								----------여러개 모아서 저장 => 재사용
 * &&, || 
 * 
 */
import java.util.Scanner;
public class 이항연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력(0~100):");
		// && 정상처리
		// || 비정상처리
		int score = sc.nextInt();
		
		String res=score>=0 && score<=100?"정상입력":"비정상입력";
		System.out.println("res:"+res);
	}

}
