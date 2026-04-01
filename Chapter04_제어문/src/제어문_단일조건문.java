import java.util.Scanner;

public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		if(a!=10)
		System.out.println("a="+a);
		
		int com=(int)(Math.random()*3);
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2):");
		int user = sc.nextInt();
		String[] str= {"가위", "바위", "보"};
		System.out.print("컴퓨터:" + str[com]);
		/*if(com==0)
			System.out.print("가위");
		if(com==1)
			System.out.print("바위");
		if(com==2)
			System.out.print("보");*/
		System.out.println();
		
		System.out.print("사용자:");
		/*if(user==0)
			System.out.print("가위");
		if(user==1)
			System.out.print("바위");
		if(user==2)
			System.out.print("보");*/
		System.out.println();
		
		System.out.println("프로그램 종료");
		System.out.println("======결과======");
		/*//컴주먹
		if(com==1 && user ==0)
			System.out.print("컴 승");
		if(com==1 && user ==1)
			System.out.print("비김");
		if(com==1 && user ==2)
			System.out.print("사승");
		//컴가위
		if(com==0 && user ==0)
			System.out.print("비김");
		if(com==0 && user ==1)
			System.out.print("컴 승");
		if(com==0 && user ==2)
			System.out.print("사승");
		
		//보
		if(com==2 && user ==0)
			System.out.print("사 승");
		if(com==2 && user ==1)
			System.out.print("컴 승");
		if(com==2 && user ==2)
			System.out.print("비김");
		System.out.println();*/
		
		
		int res = com-user;
		if(res==-1 || res==2)
			System.out.println("사용자 승");
		if(res==1 || res==-2)
			System.out.println("컴 승");
		if(res==0)
			System.out.println("비김");
		
	}

}
