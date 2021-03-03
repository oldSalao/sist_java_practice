package day0125;

/**
 * JDK 1.5 이상부터 지원되는 향상된 for loop<br>
 * 배열,list,set의 모든 방(element 또는 요소)의 값을 출력할 때 사용.<br>
 * 인덱스가 존재하지 않는다.
 * 
 * @author user
 */
public class improvementFor {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 300, 4000, 50000 };
		for (int value : arr) {
			System.out.println(value);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
