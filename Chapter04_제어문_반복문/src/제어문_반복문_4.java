
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0, a5=0, a7=0;
		
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
				a3++;
			if(i%5==0)
				a5++;
			if(i%7==0)
				a7++;
		}
		
		System.out.println("1~100사이의 3의 배수의 갯수: "+a3);
		System.out.println("1~100사이의 5의 배수의 갯수: "+a5);
		System.out.println("1~100사이의 7의 배수의 갯수: "+a7);
		
		int even = 0;
		int odd = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0)
				even++;
			if(i%2 !=0)
				odd++;
		}
		System.out.println("짝수 갯수" + even);
		System.out.println("홀수 갯수" + odd);
	}

}
