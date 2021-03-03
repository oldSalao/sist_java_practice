package day0203;

/**
 * 가변배열 : 행마다 열의 갯수가 다르게 생성되는 배열.
 * @author user
 */
public class VariableArray {
	
	public static void testVariableArray() {
		//1. 선언 : 데이터형[][] 배열명 = null
		int[][] arr = null;
		//2. 생성 : 배열명 = new 데이터형[][행의 수](열의 크기를 설정하지 않는다.)
		arr = new int[5][];
		//3. 행마다 열을 생성 : 
		//비어있는 방 생성. 배열명[행의 번호] = new 데이터형[열의갯수];
		//초기값이 있는 방을 생성. 배열명[행의번호]=new 데이터형[]{값,,,,,}
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[] {1,2,3,4};//new를 생략할 수 없다. 열의 크기를 설정하지 않고 값만 적는다.
		arr[3] = new int[] {10,20};
		arr[4] = new int[1];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]행 열의 수 : %d\n",i,arr[i].length);
		}
		
		//4. 값 할당 : 배열명[행의번호][열의번호] = 값;
		arr[0][0] = 10;
		arr[1][0] = 20;
		arr[2][0] = 30;
		
		//5. 값 사용 배열명[행의번호][열의번호]
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
