import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 제어문_반복문_while4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("👍👍👍👍👍지니뮤직👍👍👍👍👍");
		while(true)
		{
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 가요");
			System.out.println("2. 트롯");
			System.out.println("3. OST");
			System.out.println("4. POP");
			System.out.println("5. ZAZZ");
			System.out.println("6. CLASSIC");
			System.out.println("7. 종료");
			System.out.println("=================");
			System.out.println("메뉴 선택: ");
			int menu=sc.nextInt();
			
			if(menu<1 || menu>7)
			{
				System.out.println("없는 메뉴 ! 다시입력");
				continue;
			}
			if(menu == 7)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu == 1)
			{
				System.out.println("==== 가요 ====");
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0200").get();
			Elements title=doc.select(".title");
			for(int i=0; i<title.size(); i++)
			{
				String s = title.get(i).text();
				System.out.println((i+1) +"."+s);
			}
			}
			else if(menu == 2)
			{
				System.out.println("==== 트롯 ====");
			}
			else if(menu == 3)
			{
				System.out.println("==== OST ====");
			}
			else if(menu == 4)
			{
				System.out.println("==== POP ====");
			}
			else if(menu == 5)
			{
				System.out.println("==== ZAZZ ====");
			}
			else if(menu == 6)
			{
				System.out.println("==== CLASSIC ====");
			}
			
		}
		
	}

}
