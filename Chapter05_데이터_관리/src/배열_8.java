import java.util.Scanner;

public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,same=0;
		String[] res={"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=10; i++)
		{
			int com=(int)(Math.random()*3);
			System.out.print("가위(0), 바위(1), 보(2):");
			int user=sc.nextInt();
			if(user<0 || user>2)
			{
				System.out.println("잘못된 입력");
				i--;  
				continue;
			}
			System.out.println("컴퓨터: "+ res[com]);
			System.out.println("사용자: "+ res[user]);
			
			int r=com-user;
			if(r==-1 || r==2) 
			{
				System.out.println("승");
				win ++;
			}
			else if(r==1 || r==2)
			{	
				System.out.println("패");
				lose++;
			}
			else
			{	
				System.out.println("무");
				same++;
			}
		}
		System.out.printf("경과 : %d승-%d무-%d패\n",win,same,lose);
//		int com=(int)(Math.random()*3);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("가위(0), 바위(1), 보(2):");
//		int user = sc.nextInt();
//		System.out.println("컴퓨터: "+res[com]);
//		System.out.println("사용자: "+res[user]);
//		/*if(com == 0)
//			System.out.println("가위");
//		else if(com==1)
//			System.out.println("바위");
//		else if(com==2)
//			System.out.println("보");*/
//		System.out.println("===== 결과값 =====");
//		int r=com-user;
//		if(r==-1 || r==2)
//			System.out.println("User Win");
//		else if(r==1 || r==-2)
//			System.out.println("컴 승리");
//		else
//			System.out.println("비겼다");
	}

}
