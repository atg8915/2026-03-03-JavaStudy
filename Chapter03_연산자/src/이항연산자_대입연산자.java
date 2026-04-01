/*
 * 	1. 형변환
 * 		int a='A' ==> a= 65
 * 		double d=10 ==> d=10.0
 * 		------
 * 		왼쪽>=오른쪽
 * 		---------
 * 		int a=10L ==> 오류
 * 		 => long l=10L
 * 		 => int a=(int)10L
 * 		byte b=10
 * 		---------
 * 		char c='A' ==> char c=65
 * 		---------	   ---------- 정상코드
 * 	2. 초기값	/ 계산결과값 저장
 * 		int a=10;
 * 		int b=20;
 * 		int c=a+b;
 * 	3. 기본 (초기값)
 * 	   ----------
 * 		int a=0;
 * 		double d=0.0
 * 		char c=' '; ''=null
 * 		float f=0.0F;
 * 		long l=0L;
 * 		-----------------
 * 		=> 게산 결과값 대입
 *	------------------------------
 *		복합 대입연산자
 *		==========
 *		+=	:	++ (1증가)
 *		--- 여러개를 한번에 증가
 *		int a=10;
 *		a+=10;	==> a=20
 *		------ a= a+10
 *		=> 반복문 / 값 누적 / 문자열 누적
 *			------------
 *		-= : --(1감소)
 *		--- 여러개 동시감소
 *		int a=10;
 *		a-=5; 		a=a-5 => 5
 *		---------------------------
 *		*=
 *		int a=10;
 *		a*=5 ====> a=a*5	==>50
 *
 *		/=
 *		int a=10;
 *		a/=3 ==> a=a/3 ==> 3
 *
 *		%=
 *		int a=10;
 *		a=a%3 ==> 1
 *		
 *		--------------------------
 *
 *		int a=10;
 *
 *	
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c=65;
//		char d=(char)((int)(Math.random()*26)+65);
//		//연산처리 결과 => 대입
//		System.out.println(d);
		int sum=0;
		int even=0, odd=0;
		for(int i=1;i<100;i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			sum+=i;//1~100정수를 누적
		}
		System.out.println("짝수합:"+even);
		System.out.println("홀수합:"+odd);
		System.out.println("총합:"+sum);
		
		String alpha="";
		for(char c='A';c<='Z';c++)
		{
			alpha+=c;
		}
		System.out.println(alpha);
		
	}

}
