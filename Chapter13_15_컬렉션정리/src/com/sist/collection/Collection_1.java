package com.sist.collection;

import java.util.ArrayList;
import java.util.*;
class A
{
	public void display()
	{
		System.out.println("A:display() Call...");
	}
}
class B
{
	public void display()
	{
		System.out.println("B:display() Call...");
	}
}
class C
{
	public void display()
	{
		System.out.println("C:display() Call...");
	}
}
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n= {"홍길동","심청이","박문수","이순신","강감찬"};
		List<String> names = new Vector<String>();
		names=Arrays.asList(n);
		/*names.add("홍길동");
		names.add("심청이");
		names.add("박문수");
		names.add("이순신");
		names.add("강감찬");*/
		//출력 => for-each
		for(String name:names)
		{
			System.out.println(name);
		}
		System.out.println("인원:"+names.size());
		System.out.println("인원 존재 여부 확인");
		names.clear();
		if(names.isEmpty())
		{
			System.out.println("인원이 없습니다");
		}
		else
		{
			System.out.println("인원이 "+names.size()+"명 있습니다");
		}
//		names.add(new A());
//		names.add(new A());
//		names.add(new B());
//		names.add(new C());
//		names.add(new A());
//		names.add(new A());
//		names.add(new B());
//		names.add(new A());
//		names.add(new C());
//		
//		A a=null;
//		B b=null;
//		C c=null;
//		for(Object o:names)
//		{
//			if(o instanceof A)
//			{
//				a=(A)o;  
//				a.display();
//			}
//			if(o instanceof B)
//			{
//				b=(B)o;  
//				b.display();
//			}
//			if(o instanceof C)
//			{
//				c=(C)o;  
//				c.display();
//			}
//			
//		}
		
	}

}
