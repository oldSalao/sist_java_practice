package day0203;

public class TestArray {

	public static void main(String[] args) {
		//2���� �迭�� ���� 1���� �迭�� �ּҸ� ������.
		int[][] arr = new int[2][3];
		
		for(int i = 0; i<arr[0].length;i++) {
			arr[0][i]=i+1;
			System.out.println(arr[0][i]);
		}
		
		int[] temp = {10,20,30};
		
		arr[1] = temp;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] temp1 = arr[0];
		for(int i = 0; i<temp1.length;i++) {
			System.out.print(temp1[i] + " ");
		}
		
		//3���� �迭�� ���� 2���� �迭�� �ּҸ� ������.
	}

}
