import java.util.Scanner;

public class 제어판_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 정수 입력:");
		int num1 = sc.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/)");
		String op = sc.next();
		System.out.println("두번째 정수 입력: ");
		int num2 =sc.nextInt();
		
		
//		switch(op)
//		{
//		case "+":
//			System.out.printf("%d+%d%=%d\n", num1, num2, num1, num2);
//			break;
//		case "-":
//		System.out.printf("%d-%d%=%d\n", num1, num2, num1-num2);
//		break;
//	
//		case "*":
//		System.out.printf("%d-%d%=%d\n", num1, num2, num1* num2);
//		break;
//
//		case "/":
//		System.out.printf("%d-%d%=%d\n", num1, num2, num1/ num2);
//		break;
//		default: System.out.println("업슨ㄴ 산자");
//		}
		switch(op)
		{
		case "+"->
			System.out.printf("%d+%d=%d\n", num1, num2, num1+ num2);
			
		case "-"->
		System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		
	
		case "*"->
		System.out.printf("%d-%d=%d\n", num1, num2, num1* num2);
		

		case "/"->
		System.out.printf("%d-%d=%d\n", num1, num2, num1/ num2);
	
		default ->
			System.out.println("업는 ㅇㅕㄴ 산자");
		}
	}
	

}
