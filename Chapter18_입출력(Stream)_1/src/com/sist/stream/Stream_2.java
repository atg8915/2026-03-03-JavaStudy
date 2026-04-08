package com.sist.stream;
//FileOutputStream
import java.io.*;
public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			File dir=new File("c:\\java_data");
			if(!dir.exists())
			{
				dir.mkdir();
			}
			File file=new File("c:\\java_data\\sawon.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			fis=new FileInputStream(file);
//			fos=new FileOutputStream(file,true);
//			/*fos.write('H');
//			fos.write('E');
//			fos.write('L');
//			fos.write('L');
//			fos.write('O');*/
//			String info="홍길동|남자|개발부|서울|대리|4000\n";
//			fos.write(info.getBytes());
//			// getBytes()
//			//		   ----- byte
//			// 클라이언트 ------- 서버
//			System.out.println("파일저장완료");
			int i=0;
			while((i=fis.read())!=-1)
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
				fis.close();
				fos.close();
			}catch(Exception ex) {}
		}
	}

}
