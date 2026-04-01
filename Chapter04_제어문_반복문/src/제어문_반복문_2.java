import java.util.Random;
import java.util.Scanner;

public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int com = r.nextInt(100)+1;
		
		//무한루프 횟수가 지정이 되지 않은 경우
		for(;;)
		{
			System.out.println("1~100사이 정수 입력: ");
			int user = sc.nextInt();
			if(com>user)
				System.out.println("입력값보다 큰수 입력(UP)");
			else if(com<user)
				System.out.println("입력값보다 작은 수 입력(DOWN)");
			else
			{
				System.out.println("Game Over!!");
				System.exit(0);
			}
		}
	}

}
