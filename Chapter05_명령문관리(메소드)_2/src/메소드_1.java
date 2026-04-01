
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		//int length() ==> 비밀번호 / MMS문자
		System.out.println("s1가지고 있는 문자 갯수: " + s1.length());
		System.out.println("Hello 문자 갯수: " + "Hello".length());
		//문자열은 자체가 주소로 읽힌다
		
		String msg = "Hello Java";
		//			  0123456789
		//			  3번째 문자를 가지고 온다 ==> 문자 1개 추출 : char charAt(int index)
		System.out.println("3번째 문자 읽기: "+msg.charAt(2));
		System.out.println("7번째 문자 읽기: "+msg.charAt(6));
	}

}
