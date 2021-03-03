package day0203;

/**
 * �����迭 : �ึ�� ���� ������ �ٸ��� �����Ǵ� �迭.
 * @author user
 */
public class VariableArray {
	
	public static void testVariableArray() {
		//1. ���� : ��������[][] �迭�� = null
		int[][] arr = null;
		//2. ���� : �迭�� = new ��������[][���� ��](���� ũ�⸦ �������� �ʴ´�.)
		arr = new int[5][];
		//3. �ึ�� ���� ���� : 
		//����ִ� �� ����. �迭��[���� ��ȣ] = new ��������[���ǰ���];
		//�ʱⰪ�� �ִ� ���� ����. �迭��[���ǹ�ȣ]=new ��������[]{��,,,,,}
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[] {1,2,3,4};//new�� ������ �� ����. ���� ũ�⸦ �������� �ʰ� ���� ���´�.
		arr[3] = new int[] {10,20};
		arr[4] = new int[1];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]�� ���� �� : %d\n",i,arr[i].length);
		}
		
		//4. �� �Ҵ� : �迭��[���ǹ�ȣ][���ǹ�ȣ] = ��;
		arr[0][0] = 10;
		arr[1][0] = 20;
		arr[2][0] = 30;
		
		//5. �� ��� �迭��[���ǹ�ȣ][���ǹ�ȣ]
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%-5d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		VariableArray.testVariableArray();
	}

}
