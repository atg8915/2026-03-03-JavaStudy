//문자열 비교 => equals = 로그인처리

import java.util.Scanner;

public class 제어판_선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ID 입력");
		String id = sc.next();
		
		System.out.println("비번 입력");
		String pwd = sc.next();
		
		if(id.equals("admin") && pwd.equals("1234"))
		{
			System.out.println("로그인 되었습니다!");	
		}
		else
		{
			System.out.println("Id나 password가 틀립니다");
		}
	}
}
