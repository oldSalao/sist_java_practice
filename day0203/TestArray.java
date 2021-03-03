package day0203;

public class TestArray {

	public static void main(String[] args) {
		//2차원 배열의 행은 1차원 배열의 주소를 가진다.
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
		
		//3차원 배열의 면은 2차원 배열의 주소를 가진다.
	}

}
