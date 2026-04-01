import java.util.*;
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int com=r.nextInt(100) + 1;
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("1~100사이의 정수 입력:");
			int user = sc.nextInt();
			// 사용자가 잘못입력한경우 => if
			if(user < 1 || user >100)
			{
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			
			//결과 비교
			if(com>user)
				System.out.println("입력값보다 큰 값 입력");
			else if(com < user)
				System.out.println("입력값보다 작은 값 입력");
			else
			{
				System.out.println("Game Over!!");
				break;
				//break,continue => 코딩 금지
				
			}
			
		}while(true);
	}

}
