import java.util.Scanner;

public class 변수2 {

	public static void main(String[] args) {
		/*
		 * 사과 5개
		 * => 사과를 2개 먹었더
		 * => 현재 남아있는 사과의 갯수
		 */
		
		//int 사과 = 5;
		//사과 -=2;
		//사과 = 사과 -2;
		//System.out.println("남은 사과:" + 사과);
		/*
		 * 국어 80
		 * 수학 90
		 * 영어 70
		 * --------- 평균 구하기
		 */
		
		/*int 국어 = 80;
		int 영어 = 90;
		int 수학 = 70;
		
		System.out.println((국어 + 영어 수학)/3);*/
		Scanner sc = new Scanner(System.in);
		System.out.print("국,영,수 점수 입력 : ");
		int 국어 = sc.nextInt();
		int 영어 = sc.nextInt();
		int 수학 = sc.nextInt();
		System.out.println("총점 :" + (국어+영어+수학));
		System.out.printf("평균:%.2f", (국어 + 수학 + 영어)/3.0);
	}

}
