package com.sist.exception;

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String n1="10";
			String n2="3";;
			int[] arr = {
					Integer.parseInt(n1),
					Integer.parseInt(n2)
			};
			
			int res = arr[0]/arr[2];
			System.out.println(res);
		}catch (NumberFormatException|ArrayIndexOutOfBoundsException|ArithmeticException e) 
		{
			e.printStackTrace();
		}
//			// ==> else if처럼 한개만 수행
//		}catch (NumberFormatException e) 
//		{
//			e.printStackTrace();
//			// NumberFormatException : 정수변환이 안되는 경우
//		}catch (ArrayIndexOutOfBoundsException e) 
//		{
//			e.printStackTrace();
//			//ArrayIndexOutOfBoundsException 배열범위
//		}catch (ArithmeticException e) 
//		{
//			e.printStackTrace();
//			//ArithmeticException 0으로 나뉘는 경우
//		}catch (Exception e) //else 
//		{
//			e.printStackTrace();
//		}
	}
}
