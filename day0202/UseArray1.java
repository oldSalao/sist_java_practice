package day0202;

/**
 * �������迭�� �⺻������ ���� ���.
 * 
 * @author user
 */
public class UseArray1 {
	public static void main(String[] args) {
		// 1. �⺻�� �������� ����. ��������[] �迭�� = { ��1,��2,...};
		int[] arr = { 10, 20, 30, 40, 5 };
		int[] arr1 = new int[] { 10, 20, 30, 40 };
		//�ԷµǴ� ���� ������ �迭�� ũ�Ⱑ �����ǹǷ� �迭�� ũ�⸦ ������ �� ����.
		System.out.println("arr �迭�� ũ��" + arr.length);
		System.out.println("arr1 �迭�� ũ��" + arr1.length);
		
		//2.�� ����
		arr[4]=50;
		
		//3.�� ���
		System.out.println(arr[4]);
		
		//�ϰ�ó�� : ������ �ε������� ó�� �ε�������.
		//������ for�� ����� �ε����� �̿��� Ư�� ����� ���� ����� �� �ִ�.
		for(int i = arr1.length-1;i>-1;i--) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------");
		//������ for�� ����ϸ� ��� ����� ���� ����� �� �ִ�.
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		//char �迭
		char[] chArr = new char[6];
		
		chArr[0] = 'H';
		chArr[1] = 'e';
		chArr[2] = 'l';
		chArr[3] = 'l';
		chArr[4] = 'o';
		chArr[5] = '!';
		//�ּҰ� �ƴ� ��ҷ� �̷���� ���ڿ��� ��µȴ�.
		System.out.println(chArr);
	}
}
