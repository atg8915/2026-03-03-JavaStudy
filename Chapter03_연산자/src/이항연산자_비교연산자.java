/*	
 * 	결과값은 boolean => true/ false
 *
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = 6==7;
		System.out.println("b1="+b1);
		b1 = 6!=7;
		System.out.println("b1="+b1);
		
		b1 = 6<7;
		System.out.println("b1="+b1);
		
		b1 = 6>7;
		System.out.println("b1="+b1);
		
		b1 = 6<=7;
		System.out.println("b1="+b1);
		
		b1 = 6>=7;
		System.out.println("b1="+b1);
		System.out.println("====================");
		
		b1 = 'A' == 'C';
		System.out.println("b1="+b1);
		
		b1 = 'A' != 'C';
		System.out.println("b1="+b1);
		
		b1 = 'A' < 'C';
		System.out.println("b1="+b1);
		
		
		b1 = 'A' > 'C';
		System.out.println("b1="+b1);
		
		
		b1 = 'A' <= 'C';
		System.out.println("b1="+b1);
		
		b1 = 'A' >= 'C';
		System.out.println("b1="+b1);
		
		boolean r1=false;
		boolean r2=true;
		
		b1 = r1 == r2;
		System.out.println("b1="+b1);
		b1 = r1!=r2;
		System.out.println("b1="+b1);
		

	}

}
