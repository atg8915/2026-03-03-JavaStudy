package com.sist.exception;

import java.io.FileReader;

public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader in = null;
//		try
//		{
//			in =new FileReader("C:\\javaDev\\javaStudy\\Chapter11_예외처리(간접처리)\\src\\com\\sist\\exception\\예외처리_1.java");
//			int i=0;
//			while((i=in.read())!=-1)
//			{
//				System.out.print((char)i);
//			}
//		}catch(Exception ex) 
//		{
//			ex.printStackTrace();
//		}
//		finally
//		{
//			try {
//				in.close();
//			} catch (Exception ex) {}
//		}
		//try-with-
		try (FileReader in = new FileReader
				("C:\\javaDev\\javaStudy\\Chapter11_예외처리(간접처리)\\src\\com\\sist\\exception\\예외처리_1.java"))
		{
			int i=0;
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
