package com.sist.stream;
import java.io.*;
public class Reader_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
		try
		{
			in=new FileReader("c:\\java_data\\sawon.txt");
			//read() => 1글자 (2byte)
			//닫기 => close() => finally
			int i=0;
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}catch(Exception ex) {}
		}
	}

}
