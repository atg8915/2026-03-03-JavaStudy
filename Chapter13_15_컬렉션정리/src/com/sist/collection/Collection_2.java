package com.sist.collection;

import java.util.ArrayList;

/*
 * 	  제네릭(13장)
 * 	   => 코드 재사용 / 타입 안정성을 위한 도구
 * 	   => 클래스<클래스타입>
 * 	   1. 제네릭을 사용하는 이유
 * 		  ArrayList list = new ArrayList();
 * 		  --------- 모든 데이터가 저장 가능 => Object
 * 		  list.add("java");
 * 		  list.add(10);
 * 		  
 * 		  => String str = list.get(0); => 오류발생
 * 						  Object get(int index)
 * 						  =(String)list.get(0);
 * 		  => int a=list.get(1);
 * 				   ------------
 * 				   (Integer)list.get(1)
 * 		  => 어떤 데이터타입이 첨부되었는지 알 수 없다
 * 		  => 데이터 읽기마다 형변환 필요
 * 		  => 잘못하면 ClassCastExeption
 * 		2.프로그램에서는 데이터타입(형)을 반드시 고정
 * 		  => 프로그램언어는 가능 => 자바스크립트는 고정
 * 			 -------- 코틀린 제외
 * 					  var / val
 * 		3. 불필요한 형변환은 가급적이면 안하는 곳이 좋다
 * 		---------------------- 제네릭
 * 		= 데이터형이 고정 => 데이터를 한가지만 설정이 가능
 * 		  가독성
 * 		= 컴파일 오류 방지	
 * 		= 형변환 없이 사용 => 소스 간결해진다
 * 		
 *		
 */
import java.util.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
public class Collection_2 extends JFrame{
	public static void print(List<?> list)
	{
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
	public static double sum(List<? extends Number> list)
	{
		double total=0;
		for(Number n:list)
		{
			total+=n.doubleValue();
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(List.of("A","B","C"));
		print(List.of(1,2,3));
		//어떤 데이터형이든 관계없고
		//읽기만 가능 => 출력용
		System.out.println(sum(List.of(10,20,30)));
		System.out.println(sum(List.of(10.5,20.5,30.5)));
		
		/*
		 * 
		 */
	}

}
