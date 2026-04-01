
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 89;
		char op='A';
		switch (no/10) 
		{
		case 10: 	
			
		case 9:
			op='A';
			break;
		case 8:
			op='B';
			break;
		case 7:
			op='C';
			break;
		case 6:
			op='D';
			break;
		
		default:
			op='F';
		}System.out.println(op);
	}

}
