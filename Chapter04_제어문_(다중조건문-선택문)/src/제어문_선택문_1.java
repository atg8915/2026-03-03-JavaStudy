import java.util.Scanner;

public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력");
		int month = sc.nextInt();
//		System.out.print("문자열 입력:");
//		String msg=sc.nextLine();
//		System.out.println(msg);
		
		/*switch(month)
		{
		case 3:
		case 4:
		case 5:
			System.out.println(month+"는 봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"는 여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"는 가을입니다");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month+"는 겨울입니다");
			break;
		}*/
		switch(month)
		{
		case 3,4,5->System.out.println("봄입니다");
		case 6,7,8->System.out.println("여름");
		case 9,10,11 -> System.out.println("가을");
		case 12,1,2-> System.out.println("겨울");
		default->System.out.println("없는달");
		}
	}

}
