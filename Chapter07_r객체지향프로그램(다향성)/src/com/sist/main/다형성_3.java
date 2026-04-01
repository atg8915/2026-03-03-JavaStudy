package com.sist.main;
import java.util.*;
class AA
{
	public void dispaly() {
		System.out.println("AA : display Call...");
	}
}

class BB extends AA
{
	public void dispaly() {
		System.out.println("BB : display Call...");
	}
}
class CC extends AA
{
	public void dispaly() {
		System.out.println("CC : display Call...");
	}
}
class DD extends AA
{
	public void dispaly() {
		System.out.println("DD : display Call...");
	}
}
class Container
{
	Map map=new HashMap();
	public Container()
	{
		map.put(1, new AA());
		map.put(2, new BB());
		map.put(3, new CC());
		map.put(4, new DD());
	}
	public AA getBean(int key)
	{
		return (AA)map.get(key);
	}
}
public class 다형성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 입력(1,2,3,4):");
		int menu = sc.nextInt();
		Container c = new Container();
		AA aa=c.getBean(menu);
		aa.dispaly();
		/*if(menu==1)
		{
			AA aa=new AA();
			aa.dispaly();
		}
		else if(menu==2)
		{
			BB bb=new BB();
			bb.dispaly();
		}
		else if(menu==3)
		{
			CC cc=new CC();
			cc.dispaly();
		}
		else if(menu==4)
		{
			DD dd=new DD();
			dd.dispaly();
		}*/
	}

}
