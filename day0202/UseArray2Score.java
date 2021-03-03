package day0202;

/**
 * 이차원 배열의 기본형 형식 사용.
 * 
 * @author user
 */
public class UseArray2Score {
	public static final int JAVA = 0;
	public static final int ORACLE = 1;
	public static final int JSP = 2;

	public void processScore() {
		String[] names = { "현병호", "송준희", "강인섭", "이학민", "박기범" };
		int[][] score = { { 89, 91, 73 }, { 61, 70, 72 }, { 96, 99, 98 }, { 79, 77, 80 }, { 100, 98, 99 } };// 5행 3열
		int[] sum = new int[names.length];
		double avr = 0;
		int javaTotal = 0;
		int oracleTotal = 0;
		int jspTotal = 0;
		double javaAvr = 0;
		double oracleAvr = 0;
		double jspAvr = 0;

		System.out.println(score.length + "행 " + score[0].length + "열");

		System.out.println("번호\t이름\t자바\t오라클\tJSP\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번\t%s\t", (i + 1), names[i]);
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
				sum[i] += score[i][j];
			}
			javaTotal += score[i][JAVA];
			oracleTotal += score[i][ORACLE];
			jspTotal += score[i][JSP];
			avr = sum[i] / (double) score[i].length;
			System.out.printf("%d\t%.2f", sum[i], avr);
			System.out.println();
		}

		javaAvr = (double) javaTotal / names.length;
		oracleAvr = (double) oracleTotal / names.length;
		jspAvr = (double) jspTotal / names.length;

		System.out.println("-----------------------------------------------------");
		System.out.printf("총점[자바 : %d, 오라클 : %d, JSP : %d]\n", javaTotal, oracleTotal, jspTotal);
		System.out.printf("평균[자바 : %.2f, 오라클 : %.2f, JSP : %.2f]\n", javaAvr, oracleAvr, jspAvr);
		System.out.println(bestStud(sum, names));// 1등학생 번호와 이름 출력.
		System.out.println(bestJavaScore(score));// 자바 최고점수 출력.
		System.out.printf("총 응시인원 [%d]" + "명, 시험 과목수 [%d] \n", names.length, score[1].length);
		System.out.println(sort(score[0]));// 1번 학생의 점수를 오름차순으로 정렬하여 출력 메소드로!
	}

	public String bestStud(int[] totalScore, String[] names) {
		int max = 0;
		int studNum = 0;
		String answer = "";
		for (int i = 0; i < totalScore.length; i++) {
			if (max < totalScore[i]) {
				max = totalScore[i];
				studNum = i;
			}
		}
		answer = "1등학생 [" + (studNum + 1) + "]번 이름 : " + names[studNum];
		return answer;
	}

	public String bestJavaScore(int[][] score) {
		int max = 0;
		String answer = "";
		for (int i = 0; i < score.length; i++) {
			if (max < score[i][0]) {
				max = score[i][0];
			}
		}
		answer ="자바 최고점수 [" + max + "]점";
		return answer;
	}

	public String sort(int[] studScore) {
		int temp = 0;
		//주소가 입력되면 원래의 주소에 가서 데이터를 사용하기 때문에 값이 변경됨!! 배열 복사로 해결.
		int[] score = new int[studScore.length];
		for(int i = 0;i<score.length;i++) {
			score[i] = studScore[i];
		}
		
		String result = "";
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) {
				if (score[j] < score[i]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			result += score[i] + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		new UseArray2Score().processScore();
	}
}
