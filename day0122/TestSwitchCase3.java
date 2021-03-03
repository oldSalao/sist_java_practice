package day0122;

/**
 * 입력된 점수에 해당하는 학점구하기.<br>
 * 90~100 : A <br>
 * 80~89 : B <br>
 * 70~79 : C <br>
 * 60~69 : D <br>
 * 0~59 : F <br>
 * 
 * @author user
 */
public class TestSwitchCase3 {
	public static final int GRADE_A_PLUS = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;

	public static void main(String[] args) {
//		int score = 75;
//		char grade = ' ';// 공백은 \u0000
//		//나누기를 사용하여 범위를 만들 수 있다.
//		switch(score/10) {
//		case GRADE_A_PLUS :
//		case GRADE_A : grade = 'A'; break;
//		case GRADE_B : grade = 'B'; break;
//		case GRADE_C : grade = 'C'; break;
//		case GRADE_D : grade = 'D'; break;
//		default : grade = 'F';
//		}
//		
//		System.out.println(score + "점은 " + grade + "학점.");
//	}

		int score = 105;
		char grade = 64;// 공백은 \u0000
		// 나누기를 사용하여 범위를 만들 수 있다.
		if(score>-1&&score<101) {
		switch (score / 10) {
		case GRADE_D:
			grade++;
		case GRADE_C:
			grade++;
		case GRADE_B:
			grade++;
		case GRADE_A:
		case GRADE_A_PLUS:
			grade++;
			break;
		default:
			grade += 6;
		}

		System.out.println(score + "점은 " + grade + "학점.");
	}
		else {
			System.out.println("점수가 잘못되었습니다.");
		}
	}
}
