package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * 	에러가 나는 경우
 * 		=> 1. 사용자 입력
 * 		   2. 개발자 실수
 * 		   3. 생각하지 못한 에러
 * 	예외처리
 * 		=> 소스상에서 수정이 가능한 에러
 * 	예외처리 범위 (상속도)
 * 	위로 갈수록 범위가 커진다
 * 			
 * 			Object
 * 				|
 * 			Throwable : 예외처리의 최상위
 * 				|
 * 		-----------------
 * 		|				|
 * 		Error			Exception
 * 						|
 * 				-----------------------------
 * 				|							|
 * 			IOException	:
 * 				입출력=메모리,네트워크,파일
 * 						| 표준
 * 							System.out
 * 								   ---
 */
class MyException
{
	
	public void aaa()
	{
		System.out.println("MyException:aaa() Call");
	}
	public void bbb()
	{
		System.out.println("MyException:bbb() Call");
	}
	public void ccc()
	{
		System.out.println("MyException:ccc() Call");
	}
}

public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try
//		{
//			Scanner sc = new Scanner(System.in);
//			System.out.print("입력:aaa,bbb,ccc>>");
//			String m=sc.next();
//			Class className=
//					Class.forName("com.sist.exception.MyException");
//			Object obj =
//					className.getDeclaredConstructor().newInstance();
//			Method[] methods = className.getDeclaredMethods();
//			for(Method mm:methods)
//			{
//				if(mm.getName().endsWith(m))
//				{
//					mm.invoke(obj, null);
//				}
//			}
//		}catch(Exception ex) {}
		try
		{
			Integer.parseInt("10 ");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}

}
