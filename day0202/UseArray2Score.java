package day0202;

/**
 * ������ �迭�� �⺻�� ���� ���.
 * 
 * @author user
 */
public class UseArray2Score {
	public static final int JAVA = 0;
	public static final int ORACLE = 1;
	public static final int JSP = 2;

	public void processScore() {
		String[] names = { "����ȣ", "������", "���μ�", "���й�", "�ڱ��" };
		int[][] score = { { 89, 91, 73 }, { 61, 70, 72 }, { 96, 99, 98 }, { 79, 77, 80 }, { 100, 98, 99 } };// 5�� 3��
		int[] sum = new int[names.length];
		double avr = 0;
		int javaTotal = 0;
		int oracleTotal = 0;
		int jspTotal = 0;
		double javaAvr = 0;
		double oracleAvr = 0;
		double jspAvr = 0;

		System.out.println(score.length + "�� " + score[0].length + "��");

		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tJSP\t����\t���");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d��\t%s\t", (i + 1), names[i]);
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
		System.out.printf("����[�ڹ� : %d, ����Ŭ : %d, JSP : %d]\n", javaTotal, oracleTotal, jspTotal);
		System.out.printf("���[�ڹ� : %.2f, ����Ŭ : %.2f, JSP : %.2f]\n", javaAvr, oracleAvr, jspAvr);
		System.out.println(bestStud(sum, names));// 1���л� ��ȣ�� �̸� ���.
		System.out.println(bestJavaScore(score));// �ڹ� �ְ����� ���.
		System.out.printf("�� �����ο� [%d]" + "��, ���� ����� [%d] \n", names.length, score[1].length);
		System.out.println(sort(score[0]));// 1�� �л��� ������ ������������ �����Ͽ� ��� �޼ҵ��!
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
		answer = "1���л� [" + (studNum + 1) + "]�� �̸� : " + names[studNum];
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
		answer ="�ڹ� �ְ����� [" + max + "]��";
		return answer;
	}

	public String sort(int[] studScore) {
		int temp = 0;
		//�ּҰ� �ԷµǸ� ������ �ּҿ� ���� �����͸� ����ϱ� ������ ���� �����!! �迭 ����� �ذ�.
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
