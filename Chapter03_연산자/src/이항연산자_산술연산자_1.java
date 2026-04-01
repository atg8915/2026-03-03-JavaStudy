import java.util.Scanner;
public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 입력:");
		int kor=sc.nextInt();
		
		System.out.println("영어 입력:");
		int eng=sc.nextInt();
		
		System.out.println("수학 입력:");
		int math=sc.nextInt();
		
		int total = kor + eng + math;
		
		double avg = total/0.0;
		
		System.out.println("국어 점수:" + kor);
		System.out.println("영어 입력:" + eng);
		System.out.println("수학 입력:" + math);
		
		System.out.println("==========최종결과==========");
		System.out.println("총점:" + total);
		System.out.printf("평균:%.2f\n", avg);
		System.out.println(5%0.0);
	}

}
