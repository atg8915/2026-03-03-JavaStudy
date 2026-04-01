/*
 * 
 * 	산술 연산자
 * 		---------------
 * 		산술규칙
 * 		1) int 이하 데이터형(byte,short, char)
 * 			=> 연산하면 int로 변경
 * 				byte+ byte = int
 * 				char, short, 마찬가지
 * 				byte + char = int
 * 		2) 큰데이터형으로 결과값
 * 			=> int + long = long
 * 				---
 * 				long
 * 				long + double = double
 * 				---
 * 				double
 * 	------------------------
 * 	+ . - , * , / , %
 * 	------------------------
 * 		+ : 덧셈 / 문자열 결합
 * 			6+7 = 13
 * 			'6' + 7 => "67"
 * 		/ : 0으로 나눌시 에러
 * 		10/3=3
 * 
 * 		% : 나머지값 출력
 * 			5 % 2 = 1 ==> 배수
 * 			*** 결과값이 왼쪽 부호 따라감
 * 			
 * 			5 % 2 = 1
 * 			-5 % 2 = -1
 * 			-5 % -2 = -1
 * 			5 % -2 = 1
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5%2);
		System.out.println(-5%2);
		System.out.println(5%-2);
		System.out.println(-5%-2);
	}

}
