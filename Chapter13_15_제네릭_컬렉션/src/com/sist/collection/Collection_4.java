package com.sist.collection;
class Box<T>
{
	T t;
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT() 
	{
		return t;
	}
}
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		Box<String> box1=new Box<String>();
		/*
		 * 	T : Type (클래스형)
		 * 	E : Element
		 * 	-----------------
		 *  K : Key
		 *  V : Value
		 *  ----------------- Map Map<String,String>
		 *  
		 *  Object => 프로그램에 필요한 데이터형으로 변환
		 */
	}

}
