
public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, even=0, odd=0;
		
		int i=1;
		while(i<=100)
		{
			sum += i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			i++;
		}
		
		System.out.println("1~100 총합:" + sum);
		System.out.println("1~100 짝수합:" + even);
		System.out.println("1~100 홀합:" + odd);
	}

}
