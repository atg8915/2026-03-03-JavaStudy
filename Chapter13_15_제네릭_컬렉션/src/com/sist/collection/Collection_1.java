package com.sist.collection;

import java.util.ArrayList;

/*
 * 
 *  ==> 기준점 
 *  	List : 순서가 있다(추가시마다 자동으로 인덱스 번호 부여)
 *  		   데이터 중복을 허용
 *  		   대표적 : ArrayList
 *  		   Set : 순서는 없고 데이터는 중복이 없다
 *  				대표적 : HashSet
 *  				=> Distinct => 영ㅇ화등록 => 장르
 *  		   Map : 목차 => 키값 => 동시에 저장
 *  				대표적 : HashMap
 *  				=> 클래스 관리,SQL
 *  				=> 스프링 / MyBatis
 *  		
 */
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// 추기
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("춘향이");
		list.add("홍길동");
		list.add("이순신");	
		//저장된 데이터 출력
		for(int i=0; i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 저장
		System.out.println("==== 지정된 위치에 저장 ====");
		list.add(2,"김두한");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 삭제 : remove(int index)
		list.remove(3);
		
		for(int i=0; i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//수정 : set/(int index,값)
		list.set(2, "강감찬");
		for(int i=0; i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//인원 몇명 : size
		System.out.println("현재 인원:"+list.size());
		
		//전체 인원 삭제
		list.clear();
		System.out.println("현재 인원"+list.size());
		
		if(list.isEmpty())
		{
			System.out.println("저장된 데이터가 없습니다");
		}
		else
		{
			System.out.println("저장된 데이터가 존재합니다");
		}
	}

}
