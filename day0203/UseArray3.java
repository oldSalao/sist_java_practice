package day0203;

/**
 * ������ �迭 ���.(��, ��, ���� ������ �迭.)
 * 
 * @author user
 */
public class UseArray3 {
	public UseArray3() {
		// 1. ���� : ��������[][][] �迭�� = null;
		int[][][] arr = null;
		// 2. ���� : �迭�� = new ��������[�� ����][�� ����][�� ����]
		arr = new int[3][2][4];

		System.out.println("���� �� : " + arr.length);
		System.out.println("���� �� : " + arr[0].length);
		System.out.println("���� �� : " + arr[0][0].length);

		// 3. �� �Ҵ� : �迭��[��][��][��] = ��;

		arr[0][0][0] = 100;
		arr[2][1][3] = 100;

		// 4. �� ��� : �迭��[��][��][��]
		System.out.println(arr[0][0][0] + " / " + arr[0][0][1]);

		// ������ �� ���.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "�� ����");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(j + "�� ����");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("arr[%d][%d][%d] = %d\t", i, j, k, arr[i][j][k]);
				}
				System.out.println("\n" + j + "�� ��");
			}
			System.out.println(i + "�� ��");
		}
	}

	public void useArray3() {
		// �⺻�� ������ ���.
		int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };
		System.out.println(arr.length + " / " + arr[0].length + " / " + arr[0][0].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new UseArray3().useArray3();
	}

}
