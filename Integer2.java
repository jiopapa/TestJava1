package test;

public class Integer2 {

	public static void main(String [] args) {
		/// byte < short < (char)  <  int  < long
		///   1       2       2         4      8
		///ascii = 0 ~ 127
		///unicode = 256 ~ 64000 , 127~256이 들어가는 자리는 원래 부호자리 부호자리 0,1로 유니코드 아스키 구분.
		int i = -100;
		System.out.println((char)i);
		// char 문자는 음수 값을 넣을 수 없음 .
		// 문자형 
		char ch = 66;
		System.out.println(ch); //ascii 또는 unicode에 해당하는 문자 출력.
		ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		ch = '신';
		System.out.println((int)ch);
		//char : unside 부호비트가 없음 그래서 2바이트에서도 32768+32767 최대 값을 유니코드로 사용 가능.
		ch = '김';
		System.out.println((int)ch);
		
		char ch1 = 'i';
		int a = 10;
		// 리터럴 : 자연어 : 한글, 영어, 일본어 등등.
		//                문자 : 'a' , 'b' , '이' 문자로 처리하기 위해서는 따옴표.
		//                문자열 : "a", "b" , "c" 쌍따옴표.
		int 이숭무 = 10;
		System.out.println(이숭무);
		ch=66;
		System.out.println(ch);
		ch = '\u0042';
		System.out.println(ch);
		}
	
}
