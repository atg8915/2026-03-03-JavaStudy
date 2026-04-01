import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 메소드_분리2 {
	static String[] getTitle() throws Exception
	{
		String[] title = new String[200];
		int index=0;
		for(int i=1; i<=4; i++)
		{
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg=2"+i).get();
			Elements t = doc.select("table.list-wrap a.title");
			for(int j=0;j<t.size();j++)
			{
				String s=t.get(j).text();
				title[index]=s;
				index++;
			}
		}
		return title;
	}

	
	static void menu() {
		System.out.println("======= 메뉴 ========");
		System.out.println("1. 뮤직 노래명");
		System.out.println("2. 뮤직 가수명");
		System.out.println("3. 뮤직 앨범");
		System.out.println("4. 뮤직 상세보기");
		System.out.println("5. 종료");
		System.out.println("====================");
	}
	static void process() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			menu();
			System.out.println("메뉴 선택: ");
			int m = sc.nextInt();
			
			if(m==5)
			{
				System.out.println("프로그램 종료!!!");
				break;
			}
			else if(m==1)
			{
				String[] title = GenieMusic.getTitle();
				for(int i=0; i<title.length; i++)
				{
					System.out.println((i+1)+"."+title[i]);
				}
			}
			else if(m==2)
			{
				String[] title = GenieMusic.getSinger();
				for(int i=0; i<title.length; i++)
				{
					System.out.println((i+1)+"."+title[i]);
				}
			}
			else if(m==3)
			{
				String[] title = GenieMusic.getAlbum();
				for(int i=0; i<title.length; i++)
				{
					System.out.println((i+1)+"."+title[i]);
				}
			}
			else if(m==4)
			{
				System.out.println("검색어: ");
				String fd = sc.next();
				String[] title=GenieMusic.getFind(fd);
				System.out.println("검색 결과 "+title.length+"건");
				for(int i=0; i<title.length; i++)
				{
					System.out.println((i+1)+"."+title[i]);
					//동영상 => youtube 
				}
			}
		}
	}
	//클래스
	/*
	 * 
	 */
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		process();
	}

}
