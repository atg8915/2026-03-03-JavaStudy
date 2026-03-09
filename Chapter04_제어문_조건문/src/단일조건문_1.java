import java.util.Random;
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		// new : 동적메모리 할당 => heap영역에 저장 => 클래스를 저장할때 사용
		// 객체 지향
		int num1 =r.nextInt(100)+1;
		//		 0~99	==> +1 ==> 1~100
		int num2 =r.nextInt(100)+1;
		int num3 =r.nextInt(100)+1;
		
		System.out.println(num1 + "," +num2+"," + num3);
		
		int max = num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		
		System.out.println("최대값: "+ max);
		
		int min = num1;
		if(min > num2)
			min =num2;
		if(min > num3)
			min=num3;
		System.out.println("최소값: " + min);
		
		int mid = num1 + num2 + num3 -max-min;
		
		System.out.println("중간값: " + mid);
	}

}
