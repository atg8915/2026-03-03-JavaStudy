/*
 * 
 * 	+ : 문자열 결합 / 덧셈
 * 		=> 자동으로 형 변경(큰데이터형)
 * 		(int) 10.5 + 10.5= 20
 * 		(int) (10.5 + 10.5) = 21
 * 		(int)10.5 + (int)10.5 = 20 == 소수점 제거
 * 
 * 	= 비트이동연산자
 * 		<< , >>
 * 			5 << 2 ==> 20 => 0추가	x<<y => x*2^y
 * 
 * 			10100
 * 			  4
 * 			16 + 20
 * 
 * 			5 >> 2 ==> 1	=> 2칸 제거	x>>y => x/2^y
 * 			5/2^2
 * 			1
 * 			
 * 			10 << 3 ==> 80
 * 
 * 			10 >> 3	10/8 = 1
 * 			1010
 * 			 ---> 1
 * 			
 * 			56 << 3
 * 
 */
public class 이항연산자_산술연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(56));
		System.out.println(0b111000);
	}

}
