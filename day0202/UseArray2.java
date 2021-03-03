package day0202;

/**
 * 행과 열로 구성되는 2차원 배열의 사용
 * @author user
 */
public class UseArray2 {

	public UseArray2() {
		// 1. 선언 : 데이터형[][] 배열명 = null;
		int[][] arr = null;
		// 2. 생성 : 배열명 = new 데이터형[행의 수][열의 수];
		// 모든행의 열의 갯수는 같다. 모든방의 값은 초기화 된다.
		arr = new int[3][4];
		// 3.값 할당 : 배열명[행의번호][열의변호] = 값;
		System.out.println(arr[0]);
		System.out.println("행의 수 : " + arr.length + ", 열의수 : " + arr[0].length);
		// 행의 번호는 주소를 가지고 있기때문에 값을 넣을 수 없다.
		arr[0][0] = 10;
		arr[1][1] = 20;
		arr[2][2] = 30;
		arr[1][3] = 40;

		// 4. 값 사용 : 배열명[행의번호][열의번호]
		System.out.println(arr[0][0] + " / " + arr[0][1]);

		// 일괄처리
		for (int i = 0; i < arr.length; i++) { // 행을 반복하는 for
			System.out.println(i + "행 시작.");
			for (int j = 0; j < arr[i].length; j++) {// 열을 반복하는 for
				System.out.printf("arr[%d][%d]=%-5d ",i,j,arr[i][j]);
			}
			System.out.println("\n" + i + "행 끝.");
		}
		//String 형으로 이차원 배열을 만들고, 구구단 전단(2~9)을 입력한 후 출력.
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
