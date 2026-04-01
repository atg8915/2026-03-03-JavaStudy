package com.sist.music;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//사용자 요청 => 기능 => 메소드
public class GenieMusicSystem {
	// 공개 => 공유
	public static Music[] music = new Music[50];
	
	static	//자동으로 호출 => 상속 예외
	{
		try 
		{
			Document doc = Jsoup.connect
					("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			Elements singer=doc.select("table.list-wrap a.artist");
			Elements album=doc.select("table.list-wrap a.albumtitle");
			//System.out.println(title);
			Elements etc = doc.select("table.list-wrap span.rank");
			
			for(int i=0; i<title.size(); i++)
			{
				Music m = new Music();
				m.setNo(i+1);
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				System.out.println(i+1);
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				//System.out.println(etc.get(i).text());
				String temp = etc.get(i).text();
				String state="";
				String id="";
				if(temp.equals("유지"))
				{
					state="유지";
					id ="0";
				}
				else
				{
					state=temp.replaceAll("[^가-힣]","");
					id=temp.replaceAll("[^0-9]", "");
				}
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id));
				music[i] = m;
				System.out.println("상태: "+state);
				System.out.println("등폭: "+id);
				System.out.println("=============================");
			}
		}catch (Exception ex) {}
	}
	
	//기능 메소드
	//0. 메뉴
	public int menu()
	{
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 뮤직 목록");
		System.out.println("2. 상세 보기");
		System.out.println("3. 곡명 찾기");
		System.out.println("4. 가수 찾기");
		System.out.println("5. 종료");
		System.out.println("===============");
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		int m = sc.nextInt();
		return m;
	}
	//1. 목록 출력
	public void mussicList()
	{
		for(Music m:music)
		{
			System.out.println(m.getNo()+"."+m.getTitle());
		}
	}
	//2. 상세보기
	public void musicDetail(int no) 
	{
		for(Music m:music)
		{
			if(m.getNo()==no)
			{
				System.out.println("순위:"+m.getNo());
				System.out.println("곡명:"+m.getTitle());
				System.out.println("가수"+m.getSinger());
				System.out.println("가수명:"+m.getAlbum());
				System.out.println("상태:"+m.getState());
				String s=m.getState();
				if(s.equals("유지"))
				{
					System.out.println("등폭:=-");
				}
				else if(s.equals("상승"))
				{
					System.out.println("등폭:▲");
				}
				else if(s.equals("하강"))
				{
					System.out.println("등폭:▼");
				}
				break;
			}
		}
	}
	
	//3. 검색 => 가수,곡명
	public void titleFind(String fd)
	{
		for(Music m:music)
		{
			if(m.getTitle().contains(fd))
			{
				System.out.println(m.getNo()+"."+m.getTitle());
			}
		}
	}
	public void singerFind(String sf)
	{
		for(Music m:music)
		{
			if(m.getSinger().contains(sf))
			{
				System.out.println(m.getNo()+"."+m.getSinger());
			}
		}
	}
	//4. 동영상 
}
