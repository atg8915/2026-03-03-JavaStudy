import java.util.Scanner;

public class 제어판_다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력");
		int month = sc.nextInt();
		
		if(month==3|| month==4 ||month==5)
		{
			System.out.println(month+"는(은 봄)");
		}
		else if(month==6|| month==7 ||month==8)
		{
			System.out.println(month+"는(은 여름)");
		}
		else if(month==9|| month==10 ||month==11)
		{
			System.out.println(month+"는(은 가을)");
		}
		else if(month==12|| month==1 ||month==2)
		{
			System.out.println(month+"는(은 겨울)");
		}
		else
		{
			System.out.println("없는계절");
		}
	}

}
