package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

class Temp
{
	public void sum(int...value)
	{
		int s=0;
		for(int i=0;i<value.length;i++)
		{
			s+=value[i];// 값읽기 => 배열
		}
		System.out.println("sum= "+s);
	}
	public String change(int num)
	{
		DecimalFormat d=new DecimalFormat("###,###,###");
		return d.format(num);
	}
	//public String dataChange(Data data)
	{
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		//return sdf.format(data);
	}
}
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t=new Temp();
		t.sum(10);
		t.sum(10,20,30,40,50,60,70);
		int a=100000000;
		String res=t.change(a);
		System.out.println(res+"원");
	//	System.out.println(new Data());
	//	res=t.dataChange(new Data());
		System.out.println();
				
	}

}
