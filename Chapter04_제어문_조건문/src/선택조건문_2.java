import java.util.Scanner;

public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력:");
		int year = sc.nextInt();
		System.out.println("입력 년도: " + year);
		
		if((year%4==0 && year%100!=0 || (year%400==0)))
		{
			System.out.println("윤년!");
		}
		else
		{
			System.out.println("윤년 아님 ㅋ");
		}
	}

}
