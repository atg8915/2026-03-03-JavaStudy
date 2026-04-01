import java.util.Arrays;
import java.util.Scanner;

public class 배열_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char [] arr=new char[10];
		for(int i=0;i<arr.length; i++)
		{
			arr[i]=(char)(i+65);
		}
		for(char c:arr)
			System.out.print(c);
	}
}
