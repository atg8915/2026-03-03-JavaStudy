import java.util.Scanner;
/*
 * 	nextInt = 정수
 * 	nextDouble = 실수
 * 	next = 문자열 공백미적용
 * 	nextLine = 문자열 공백같이
 */
public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("원하는 단입력?");
		int dan = sc.nextInt();
		
		int i=1;
		
		while(i<9) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
			i++;
		}
		
		
	}

}
