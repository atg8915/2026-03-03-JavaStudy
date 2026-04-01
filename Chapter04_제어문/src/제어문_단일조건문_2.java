//if ==>15 ==> 3배수, 5배수, 7배수
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		if(num %3 == 0)
		{
			System.out.println(num + "는(은 3의배수입니다)");
		}
		if(num %5 == 0)
		{
			System.out.println(num + "는(은 5의배수입니다)");
		}
		if(num %7 == 0)
		{
			System.out.println(num + "는(은 7의배수입니다)");
		}
	}

}
