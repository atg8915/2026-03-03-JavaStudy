package com.sist.stream;

import java.io.*;
import java.io.FileInputStream;

/*
 * 	IO => Input / Output
 * 				  | 출력
 * 		  |입력
 * 		----------------- System.in / System.out
 * 						  |키보드 입력   | 명령프롬프트에 출력
 * 						  ----------------------------
 * 							| 표준 입출력
 * 	=> 프로그램의 외부소스를 목적지의 데이터 정보 교환
 * 			   ------  -----
 * 					   프로그램에서 => 화면 , 파일에 나가는 데이터 위치
 * 				| 입력 => 키보드 . 파일 , 네트워크에 들어오는 데이터
 * 	출발지	  ---------------		-------------
 * 	1.키보드
 * 	2.파일
 * 	3.프로그램
 */
public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try
		{
			//File file=new File("");
			//fis = new FileInputStream(file);
			fis = new FileInputStream("C:\\Users\\sist-11\\git\\java-study\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
//			//파일 읽기 시작
//			int i=0;
//			while((i=fis.read())!=-1)
//			{
//				System.out.print((char)i);
//				//한글이 깨진다 => 한글파일을 읽는 용도가 아니다..
//				//파일 이동
//			}
			while(true)
			{
				String s=br.readLine();
				if(s==null)
					break;
				System.out.println(s);
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}finally 
		{
			try
			{
				fis.close();
			}catch(Exception ex) {}
		}
	}

}
