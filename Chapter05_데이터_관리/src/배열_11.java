import java.util.Scanner;

public class 배열_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력");
		int year = sc.nextInt();
		
		System.out.println("월 입력");
		int month = sc.nextInt();
		
		System.out.println("일 입력");
		int day = sc.nextInt();
		
		System.out.println(year + "년 " + month + "월 ");
		
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		
		int[] lastday= {31,28,31,30,31,30,311,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0; i<month-1;i++)
		{
			total+=lastday[i];
		}
		
		String[] strWeek= {"일","월","화","수","목","금","토"};
		int week=total%7;
		System.out.println("입력된 날의 요일 : "+strWeek[week]);
				 	
	}

}
