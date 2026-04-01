import java.util.Scanner;

public class 제어문_다중조건문 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 정수 입력:");
		int num1 = sc.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/)");
		String op = sc.next();
		System.out.println("두번째 정수 입력: ");
		int num2 =sc.nextInt();
		
		if(op.equals("+"))
		{
			System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
		}
		else if(op.equals("-"))
		{
			System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
		}
		else if(op.equals("*"))
		{
			System.out.printf("%d*%d=%d\n", num1,num2,num1*num2);
		}
		else if(op.equals("/"))
		{
			if(num2==0)
				System.out.println("0나누기 못함");
			else
			System.out.printf("%d/%d=%d\n", num1,num2,num1/num2);
		}
		else
		{
			System.out.println("잘못된 연산자 입력");
		}
	}

}
