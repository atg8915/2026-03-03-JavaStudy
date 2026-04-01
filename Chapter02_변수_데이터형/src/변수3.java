/*
 * 	byte / long => 정수
 * 	| -128 ~ 127
 */
public class 변수3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=Byte.MIN_VALUE;
		byte b2=Byte.MAX_VALUE;
		
		System.out.println("byte는 범위:" +b1+"~"+b2);
		
		long l1=Long.MIN_VALUE;
		long l2=Long.MAX_VALUE;
		
		System.out.println("long은 범위:" +l1+"~"+l2);
		
		short s1 = Short.MIN_VALUE;
		short s2 = Short.MAX_VALUE;
		
		System.out.println("short는 범위:"+s1+"~"+s2);
		
		int i1=Integer.MIN_VALUE;
		int i2=Integer.MAX_VALUE;
		
		System.out.println("int는 범위:"+i1+ "~" +i2);
	}

}
