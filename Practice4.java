
public class Practice4 {
	public static void main(String[]args) {
		int score = 90;
		char grade;		
		grade = (score>=90) ? 'A' : 'B';
		System.out.println(grade);
	/////////////////////////////////////////////////
		int ranking=1;
		char medalColor;
		switch(ranking) {
			case 1 : medalColor = 'G';
			break;
			
			case 2 : medalColor = 'S';
			break;
			
			case 3 : medalColor = 'B';
			break;
			
			default :
					medalColor = 'A';
					
		}
		System.out.println(ranking+"등의 메달 색깔은"+ medalColor + "입니다.");
	
	
	
	
	
	}
}
