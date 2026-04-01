/*
 * 
 * 1. 난수발생
 * -----------
 * 2.사용자 입력
 * 3.비교
 * 4.힌트
 * 5.정답=>종료  
 * -----------반복문 
 */
import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		for(int i=0; i<3;  i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				//j는 이미 배열에 저장된 값
				//i는 현재 난수값
				if(com[j] == com[i])
				{
					i--;
					break;
				}
			}
		}
		//사용자 입력 받기
		while(true)//횟수지정 안됨
		{
			System.out.println("세자리 정수 입력 >>");
			int input=sc.nextInt();
			//잘못입력시
			if(input<100 || input>999)
			{
				System.out.println("😢 잘못된 입력");
				//처음으로 이동
				continue; //while 조건식, for =>증가식
			}
			//배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//잘못된 입력 => 같은수 X, 0입력 X
			if (user[0]==user[1]||user[0]==user[2]||user[1]==user[2])
			{
				System.out.println("😢 같은 수 사용 불가");
				continue;
			}
			if(user[0]==0 || user[1]==0||user[2]==0)
			{
				System.out.println("😢 0은 사용 불가");
				continue;
			}
			//유효성 검사 => 프로그램에 필요한 값이 입력되었는지 확인
			//비교
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			//힌트
			System.out.printf("Input Number: %d,Result:%dS-%dB\n",
					input,s,b);
			if(s==3)
			{
				System.out.println("Game Over");
				break;	//while 종료
			}
		}
	}

}
