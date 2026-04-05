package com.sist.collection;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
/*
 * 		retainAll() : 교집합
 * 		addAll() : 전체 집합
 * 		removeAll() : 차집합
 * 		------------------
 * 		지니뮤직 / 멜론
 * 		   |      |
 * 		   --------
 * 		   | 50곡 => 같은 곡
 * 		   | => 크롤링
 * 
 * 		=> Set / Map / => 응용
 */
import java.util.*;
public class Collection_3 {
	public List<String> genieData()
	{
		List<String> list = new ArrayList<String>();
		try
		{
			Document doc = 
					Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//곡명
			Elements title = doc.select("td.info a.title");
			for(int i=0; i<title.size(); i++)
			{
				list.add(title.get(i).text());
			}
		}catch(Exception ex) {}
		return list;
	}
	public List<String> melonData()
	{
		List<String> list = new ArrayList<String>();
		try
		{
			Document doc = 
					Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0; i<title.size(); i++)
			{
				list.add(title.get(i).text());
			}
		}catch(Exception ex) {}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection_3 co= new Collection_3();
		List<String> genie = co.genieData();
		System.out.println("======= 지니 뮤직 =======");
		for(int i=0; i<genie.size();i++)
		{
			System.out.println((i+1)+"."+genie.get(i));
		}
		
		List<String> melon = co.melonData();
		System.out.println("======= 멜론 뮤직 =======");
		for(int i=0; i<melon.size();i++)
		{
			System.out.println((i+1)+"."+melon.get(i));
		}
		//지니뮤직에만 있는 노래
		/*System.out.println("======= 지니 뮤직에 있는 곡명 =======");
		genie.removeAll(melon);
		for(int i=0;i<genie.size();i++)
		{
			System.out.println((i+1)+"."+genie.get(i));
		}
		System.out.println("======= 멜론 뮤직에 있는 곡명 =======");
		melon.removeAll(genie);
		for(int i=0;i<melon.size();i++)
		{
			System.out.println((i+1)+"."+melon.get(i));
		}
		//공통으로 가지고 있는 곡명
		System.out.println("======= 공통으로 가지고 있는 곡명 =======");
		genie.retainAll(melon);//genie에 저장된 데이터가 변경
		for(int i=0;i<genie.size();i++)
		{
			System.out.println((i+1)+"."+genie.get(i));
		}*/
		//지니뮤직 + 멜론
		System.out.println("=======지니 + 멜론 합=======");
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		for(int i=0; i<list.size();i++)
		{
			System.out.println((i+1)+"."+ list.get(i));
		}
		
		System.out.println("======= 멜론+지니 중복제거=======");
		Set<String> set = new HashSet<String>();
		set.addAll(genie);
		set.addAll(melon);
		int k=1;
		for(String s:set)
		{
			System.out.println(k+"."+s);
			k++;
		}
	}

}
