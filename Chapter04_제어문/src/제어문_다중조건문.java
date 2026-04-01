import java.util.Scanner;

public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("첫 정수 입력");
		int num1 = sc.nextInt();
		
		System.out.println("연산자 입력(+, -, *, /):");
		String op=sc.next();
		
		System.out.println("두번쨰 정수 입력");
		int num2 = sc.nextInt();
		
		char c=op.charAt(0); // 첫번째 입력된 문자 읽기
		// 문자열은 인덱스 번호 => 0번부터 시작
		// == 정수/실수/논리/문자
		if(c=='+')
		{
			System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
		}
		else if(c=='-')
		{
			System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
		}
		else if(c=='*')
		{
			System.out.printf("%d*%d=%d\n", num1,num2,num1*num2);
		}
		else if(c=='/')
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없다");
			}
			else
			{
				System.out.printf("%d/%d=%d\n", num1,num2,num1/num2);
			}
		}
		else 
		{
			System.out.println("잘못된연산");
		}
	}

}
