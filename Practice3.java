
public class Practice3 {

	public static void main(String[] args) {
		// 100~90점은 A, 89~80점 B 79 ~ 70점 C 69 ~ 60점 D 나머지 F
		// int 형 변수 score , char 형 변수 grade를 사용하여 출력

		int score;
		char grade;
		score = 8;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >=70) {
			grade = 'C';
		} else if (score >=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade + "학점입니다.");

	}

}
