import java.util.Scanner;
//알파벳을 입력 받아 대문자 / 소문자
public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 입력");
		// => 문자 입력은 불가능 ==> 문자열 => 문자형으로 변환
		String ch = sc.next();
		char c=ch.charAt(0);
		System.out.println("알파벳:" +c);
		
		if(c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자입니다");
		if(c>='a'&& c<='z')
			System.out.println(c+"는(은) 소문자입니다");
		if(c>='0' && c<='9')
			System.out.println(c+"는(은) 숫자입니다");
	}

}
