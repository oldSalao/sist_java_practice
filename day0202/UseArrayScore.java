package day0202;

/**
 * 1���� �迭�� �л��� ������ ó���ϴ� ���α׷�
 * 
 * @author user
 */
public class UseArrayScore {

	public void score() {
		// 1.6���� �л������� ������ �迭�� ����
		int[] studentScore = { 84, 72, 99, 95, 60, 63 };
		int sum = 0;
		double avr = 0;
		System.out.println("��ȣ\t����");
		System.out.println("--------------");
		for (int i = 0; i < studentScore.length; i++) {
			System.out.printf("%d\t%d\n", i + 1, studentScore[i]);
			sum += studentScore[i];
		}
		avr = sum / (double) studentScore.length;
		System.out.println("--------------");
		System.out.printf("�����ο� [%d]��\n", studentScore.length);
		System.out.printf("���� [%d]��\n", sum);
		System.out.printf("��� [%.2f]��\n", avr);
	}

	public void familyName() {
		String[] name = { "���μ�", "������", "�����", "������", "�����", "�̻�ö", "�̿���", "���ϴ�", "������", "���й�" };
		for (int i = 0; i < name.length; i++) {
			if (name[i].startsWith("��")) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		UseArrayScore uas = new UseArrayScore();
		uas.score();
		uas.familyName();
	}

}
