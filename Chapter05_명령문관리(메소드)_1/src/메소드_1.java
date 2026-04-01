import java.util.*;
public class 메소드_1 {
	static int rand()
	{
		int com = (int)(Math.random()*100)+1;
		return com;
	}
	
	static int input()
	{
		Scanner sc = new Scanner(System.in);
		int user = 0;
		while(true)
		{
			System.out.print("1~100 사이의 정수 입력");
			user = sc.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된입력");
				continue;
			}
			break;
		}
		return user;	
	}
	
	static void compare(int com, int user)
	{
		Scanner sc = new Scanner(System.in);
		if(com>user)
		{
			System.err.println("입력값보다 높은수");
		}
		else if(com<user)
		{
			System.err.println("입력값보다 작은수");
		}
		else
		{
			System.out.println("GAME OVER");
			System.out.print("게임을 다시 할까요?(y/n)");
			char c = sc.next().charAt(0);
			if(c=='y'||c=='Y')
			{
				System.out.println("새 게임 시작");
				process();
			}
			else
			{
				System.out.println("GAME OVER");
				System.exit(0);
			}
			System.exit(0);
		}
	}
	static void process()
	{
		int com = rand();
		while(true)
		{
			int user=input();
			compare(com, user);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
//		Scanner sc = new Scanner(System.in);
//		int com = (int)(Math.random()*100)+1;
//		
//		while(true)
//		{
//			System.out.print("1~100 사이의 정수 입력");
//			int user = sc.nextInt();
//			if(user<1 || user>100)
//			{
//				System.out.println("잘못된입력");
//				continue;
//			}
//			
//			if(com>user)
//			{
//				System.err.println("입력값보다 높은수");
//			}
//			else if(com<user)
//			{
//				System.err.println("입력값보다 작은수");
//			}
//			else
//			{
//				System.out.println("GAME OVER");
//				break;
//			}
//		}
	}

}
