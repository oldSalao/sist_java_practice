package day0122;

/**
 * �Էµ� ������ �ش��ϴ� �������ϱ�.<br>
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
//		char grade = ' ';// ������ \u0000
//		//�����⸦ ����Ͽ� ������ ���� �� �ִ�.
//		switch(score/10) {
//		case GRADE_A_PLUS :
//		case GRADE_A : grade = 'A'; break;
//		case GRADE_B : grade = 'B'; break;
//		case GRADE_C : grade = 'C'; break;
//		case GRADE_D : grade = 'D'; break;
//		default : grade = 'F';
//		}
//		
//		System.out.println(score + "���� " + grade + "����.");
//	}

		int score = 105;
		char grade = 64;// ������ \u0000
		// �����⸦ ����Ͽ� ������ ���� �� �ִ�.
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

		System.out.println(score + "���� " + grade + "����.");
	}
		else {
			System.out.println("������ �߸��Ǿ����ϴ�.");
		}
	}
}
