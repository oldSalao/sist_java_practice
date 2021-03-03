package day0125;

/**
 * 다중 for(중첩 for)의 사용.<br>
 * 
 * @author user
 */
public class TestFor2 {

	public static void main(String[] args) {
		// 구구단 전단 출력.

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------");
		//////////////////////////////////////////////2////////////////////////////////////
		
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(i + " ");
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//////////////////////////////////////////////////////////////////////////////////////

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}
		
		////////////////////////////////////////////////////////
	}
}
