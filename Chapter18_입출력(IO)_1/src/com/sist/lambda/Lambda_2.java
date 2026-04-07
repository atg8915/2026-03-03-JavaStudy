package com.sist.lambda;
import java.util.*;
import javax.swing.*;
public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("이름 입력: ");
		//System.out.println(input);
//		String result=Optional.ofNullable(input)
//					.filter(s->s.length()>3)
//					.map(s->s.toUpperCase())
//					.orElse("입력값 없음");
//		System.out.println(result);
		if(input!=null) //null값 비교시 ==
		{
			if(input.length()>3)
			{
				input=input.toUpperCase();
				System.out.println(input);
			}
			else
			{
				System.out.println(input);
			}
		}
		else
		{
			System.out.println("입력값 없음");
		}
	}

}
