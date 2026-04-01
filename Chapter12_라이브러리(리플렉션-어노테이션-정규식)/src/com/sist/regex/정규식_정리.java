package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 	정규식은 문자의 형태 (패턴)으 만드는 과정
 * 	=> replaceAll / split
 * 	=> 기호
 * 		[] => 한개의 문자
 * 		   => [a] / [abc] => a|b|c
 * 		   => 범위 => [a-z] / [A-Z] / [0-9] / [가-힣]
 * 		   => [a-zA-Z] => contains
 * 		   => ^[a-zA-Z] => startsWith
 * 		   => [a-zA-Z]$ => endsWith
 * 		^, $ => 시작과 끝
 * 		+: 1개이상 abc+ 
 */
public class 정규식_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg = "내 전화번호는 010-1234-5678이고"
//				+"회사전화는 02-333-4566입니다";
//		//전화 번호만 추출
//		String regex = "\\d{2,3}-\\d{3,4}-\\d{4}";
//		Pattern p= Pattern.compile(regex);
//		Matcher m= p.matcher(msg);
//		
//		while(m.find())
//		{
//			System.out.println("전화번호:"+m.group());
//			System.err.println(m.start()+" "+m.end());
//		}
		/*
		 * 	Matcher
		 * 		matchers() : 전체 문자열에서 패턴과 일치 여부
		 * 		find()	: 부분 일치 (패턴 형식)
		 * 		group() : 찾는 문자열
		 * 		start() : 시작 인덱스
		 * 		end() : 끝 인덱스
		 * 		replaceAll() : 변환
		 */
//		String msg = "비밀번호 : 1234, 또 다른 비밀번호: 567";
//		String regex="\\d+";
//		Pattern p=Pattern.compile(regex);
//		Matcher m=p.matcher(msg);
//		while(m.find())
//		{
//			System.out.println("비밀번호:" + m.group());
//		}
//		String email = "test@emple.com";
//		String regex = "^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}$";
//		boolean result = Pattern.matches(regex, email);
//		if(result)
//		{
//			System.out.println("이메일 형식입니다");
//		}
//		else
//		{
//			System.out.println("이메일 형식이 아닙니다");
//		}
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		System.out.println(today);
		
		//String regex = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		String regex = "(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(today);
		if(m.find())
		{
			System.out.println("오늘 날짜:" + m.group());
			System.out.println("년도: "+ m.group(1));
			System.out.println("월 : "+m.group(2));
			System.out.println("일 : "+ m.group(3));
		}
		
		/*
		 * 	패턴
		 * 	Pattern.matchers => equals => 전체문장
		 * 	Matcher.find() => contains
		 *  => 찾은 문자열 : group
		 *  => replaceAll()
		 *  => () => 그룹
		 *  ------------------------------------
		 *  --> 데이터셋 => 데이터사전
		 */
		
	}

}
