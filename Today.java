
public class Today {

	public static void main(String[] args) {
		//단일 if 문 하나씩. 
		//if else if 문 조건이 여러개인 경우
		//if else문 중첩 if문 
		char ch1 = 'A';
		System.out.println((int)ch1);
		int ch2 = 67;
		System.out.println((char)ch2);
		
		int num = 10;
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		num=-num;
		System.out.println(num);
		
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		int avgScore = totalScore / 2;
		System.out.println(avgScore);
		
		/////////////////////////////////
		int gameScore=150;
		
		int lastScore1 = gameScore++;
		System.out.println(lastScore1);
		
		System.out.println(gameScore);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		
		System.out.println(gameScore);
		
		num = 5;
		int i = 10;
		boolean value = ((num = num*10) > 45) || ((i = i-5) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		//단락 회로평가 논리 곱연산에서 앞이 거짓이면 뒤는 참이든 거짓이든 거짓이기 때문에 
		//실행할 필요가 없어 뒤의 값이 변하지 않음.
		//논리 합연산에서 앞이 참이면 뒤는 참이든 거짓이든 참이기 때문에 
		//실행할 필요가 없어 뒤의 식이 실행되지 않아 값이 변하지 않음.
		
		int num1= (5>3) ? 10 : 20; // (5>3)이 참이면 10 거짓이면 20
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch3;
		ch3 = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch3);
		
		
		int num5 = 10;
		boolean isEven;
		isEven = (num5%2==0) ? true : false;
		System.out.println(isEven);
		
		
		int myAge = 23;
		int teacherAge = 38;
		boolean value5 = (myAge>25);
		System.out.println(value5);
		
		System.out.println(myAge<=25);
		System.out.println(myAge == teacherAge);
		
		char ch6;
		ch6 = (myAge > teacherAge) ? 'T' : 'F';
		System.out.println(ch6);
		
		
	}

}
