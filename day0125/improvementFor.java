package day0125;

/**
 * JDK 1.5 �̻���� �����Ǵ� ���� for loop<br>
 * �迭,list,set�� ��� ��(element �Ǵ� ���)�� ���� ����� �� ���.<br>
 * �ε����� �������� �ʴ´�.
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
