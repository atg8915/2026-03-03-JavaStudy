/*
 * *
 * **
 * ***
 * ****
 * 
 * 
 * 
 * ****
 * ***
 * **
 * *
 */
public class 제어문_5중첩반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=4; i++)
//		{
//			//for(int j=1;j<=i;j++)
//			for(int j=4;j<=5-i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=4;i++)
		{
			// 공백
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			// 별표
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
