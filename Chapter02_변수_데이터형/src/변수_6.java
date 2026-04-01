
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		int temp = a;
		a=b; // a=20
		b=a; // b=10
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
