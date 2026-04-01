import java.util.Scanner;

public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력: ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++)
		{
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
		
		System.out.println();// 다음줄 출력
		
		for(int i=9; i>=1; i--)
		{
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
		
		System.out.println();
		String str = "Hello Java";
		
		for(int i=0; i<str.length();i++)  
		{
			System.out.println(str.charAt(i));
		}
		
		System.out.println();
		for(int i=str.length()-1 ; i>=0; i--)
		{
			System.out.println(str.charAt(i));
		}
		
		//변수
		//1 대문자 갯수 저장
		//2 소문자 갯수 저장
		int a = 0;
		int b = 0;
		
		for(int i=0; i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='A' && c<='Z')
				a++;
			if(c>='a' && c<= 'z')
				b++;
		}
		
		System.out.println("대문자 : " + a);
		System.out.println("소문자 : " + b);
		
	}

}
