package com.sist.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos=null;
		try
		{
			fis=new FileInputStream("c:\\javaDev\\lombok-1.18.40.jar");
			fos = new FileOutputStream("c:\\java_data\\lombok.jar");
			int i=0;
			byte[] buffer = new byte[1024];//파일 복사 => 다운로드
			while((i=fis.read())!=-1)
			{
				fos.write(buffer,0,i);
			}
			System.out.println("파일 복사 완료");
		}catch(Exception ex)
		{
			
		}
		finally
		{
			try
			{
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
			}catch(Exception ex) {}
		}
	}

}
