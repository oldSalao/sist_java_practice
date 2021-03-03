package day0202;

/**
 * ��� ���� �����Ǵ� 2���� �迭�� ���
 * @author user
 */
public class UseArray2 {

	public UseArray2() {
		// 1. ���� : ��������[][] �迭�� = null;
		int[][] arr = null;
		// 2. ���� : �迭�� = new ��������[���� ��][���� ��];
		// ������� ���� ������ ����. ������ ���� �ʱ�ȭ �ȴ�.
		arr = new int[3][4];
		// 3.�� �Ҵ� : �迭��[���ǹ�ȣ][���Ǻ�ȣ] = ��;
		System.out.println(arr[0]);
		System.out.println("���� �� : " + arr.length + ", ���Ǽ� : " + arr[0].length);
		// ���� ��ȣ�� �ּҸ� ������ �ֱ⶧���� ���� ���� �� ����.
		arr[0][0] = 10;
		arr[1][1] = 20;
		arr[2][2] = 30;
		arr[1][3] = 40;

		// 4. �� ��� : �迭��[���ǹ�ȣ][���ǹ�ȣ]
		System.out.println(arr[0][0] + " / " + arr[0][1]);

		// �ϰ�ó��
		for (int i = 0; i < arr.length; i++) { // ���� �ݺ��ϴ� for
			System.out.println(i + "�� ����.");
			for (int j = 0; j < arr[i].length; j++) {// ���� �ݺ��ϴ� for
				System.out.printf("arr[%d][%d]=%-5d ",i,j,arr[i][j]);
			}
			System.out.println("\n" + i + "�� ��.");
		}
		//String ������ ������ �迭�� �����, ������ ����(2~9)�� �Է��� �� ���.
		String[][] arr1 = new String[8][9];
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				int firstNum = i+2;
				int lastNum = j+1;
				arr1[i][j] = (firstNum + " * " + lastNum + " = " + (firstNum*lastNum));
				System.out.println(arr1[i][j]);
			}
		}
		
		int[][] temp = new int[6][10];
		
		for(int i = 0; i<temp.length;i++) {
			for(int j = 0; j<temp[i].length;j++) {
				if((i==0)||(i==(temp.length-1))||(j==0)||(j==(temp[i].length-1))){
					temp[i][j]=1;
				}
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new UseArray2();
	}
}
