//국어,영어,수학=> 1.총점 , 2.평균 , 3.학점(조건문)
//A B C D E F 
// => A+ A0 A- ...
/*
 * 	int avg = 85
 * 	if(avg>9=0)
 * 		A
 * 	if(avg>=80)
 * 		B
 * 	if(avg>=70)
 * 		C
 * 	if(avg>=60)
 * 		D
 * 	if(avg<60)
 * 		F
 */
import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("국어입력: ");
		int kor = sc.nextInt();
		
		System.out.println("영어입력: ");
		int eng = sc.nextInt();
		
		System.out.println("수학입력: ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		
		double avg = total/3.0;
		
		char score = 'A';
		if(avg >= 90) score='A';
		else if(avg >= 80) score='B';
		else if(avg >= 70) score='C';
		else if(avg >= 60) score='D';
		else score='F';
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		System.out.println("학점: "+score);
		
	}

}
