package day0121;

public class Homework {

	public static final int BUS = 1200;
	public static final int TRAIN = 1300;
	public static final int TAXI = 3800;

	public static void main(String[] args) {
		///////////////////////// 1///////////////////////
		int birthYear = Integer.parseInt(args[0]);

		if (birthYear % 12 == 0) {
			System.out.println(birthYear + "��� ������ ��");
		} else if (birthYear % 12 == 1) {
			System.out.println(birthYear + "��� �� ��");
		} else if (birthYear % 12 == 2) {
			System.out.println(birthYear + "��� �� ��");
		} else if (birthYear % 12 == 3) {
			System.out.println(birthYear + "��� ���� ��");
		} else if (birthYear % 12 == 4) {
			System.out.println(birthYear + "��� �� ��");
		} else if (birthYear % 12 == 5) {
			System.out.println(birthYear + "��� �� ��");
		} else if (birthYear % 12 == 6) {
			System.out.println(birthYear + "��� ȣ���� ��");
		} else if (birthYear % 12 == 7) {
			System.out.println(birthYear + "��� �䳢 ��");
		} else if (birthYear % 12 == 8) {
			System.out.println(birthYear + "��� �� ��");
		} else if (birthYear % 12 == 9) {
			System.out.println(birthYear + "��� �� ��");
		} else if (birthYear % 12 == 10) {
			System.out.println(birthYear + "��� �� ��");
		} else {
			System.out.println(birthYear + "��� �� ��");
		}

		////////////////////////////// 2///////////////////////

		int fare = 0;

		if (args[1].equals("����") || args[1].equals("����ö") || args[1].equals("�ý�")) {

			if (args[1].equals("����")) {
				fare = BUS;
			} else if (args[1].equals("����ö")) {
				fare = TRAIN;
			} else {
				fare = TAXI;
			}

			System.out.println("�Է±������ " + args[1] + "�̰�, ����� " + fare + "�� �Դϴ�.");
			System.out.println("�պ���� " + (fare * 2) + "�� �̰�, �Ѵ� 20�� ������� �ϸ� " + (fare * 40) + "�� �Դϴ�.");
			
		} else {
			System.out.println("�Է��Ͻ� ��������� ���߱����� �ƴմϴ�.");
		}
	}
}
