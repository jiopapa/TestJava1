package loopexample;

public class ForExample2 {

	public static void main(String[] args) {
		/// 1~ 10까지 더한 값을 구하시오.
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		
		System.out.println("sum = " + sum);
		
		sum = 0;
		for( int num = 1; num <= 10 ; num++){
			sum = sum + num ;
			
		}
		System.out.println();
	}

}
