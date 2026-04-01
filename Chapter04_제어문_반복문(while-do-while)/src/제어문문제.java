import java.util.Scanner;

public class 제어문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력: ");
		int num = sc.nextInt();
		int a = num/10;
		int b = a*10;
		if(num ==  a+b)
			System.out.println("같다");
		else {
			System.out.println("아님");
		}
		
	}

}
