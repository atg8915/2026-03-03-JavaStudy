package com.sist.lang;

import java.io.*;
public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String foodData="";
			FileReader fr = new FileReader("c:\\javaDev\\food.txt");
			/*
			 * 	FileReader : 문자 스트림
			 * 	FileInputStream : 바이트 스트림
			 */
			//StringBuffer sb = new StringBuffer();
			StringBuilder sb = new StringBuilder();
			
			int i=0; //한글자씩 읽어 온다 => 정수형으로 읽어 온다
			long start=System.currentTimeMillis();
			while((i=fr.read())!=-1)
			{
				//foodData+=(char)i;
				sb.append((char)i);
			}
			fr.close();
			long end = System.currentTimeMillis();
			
			//System.out.println(foodData);
			System.out.println(sb.toString());
			System.out.println("걸린 시간 :" + (end-start)+"MS");
		}catch(Exception ex) {}
	}

}
