package day0201;

/**
 * ������ �迭�� ���.
 * @author user
 */
public class UseArray1 {

	public static void main(String[] args) {
		//1.�迭 ����. ��������[] �迭�� = null;
		int[] arr = null;
		System.out.println(arr);
		
		//2.����. �迭�� = new ��������[��Ұ���];
		arr = new int[15]; // �����Ҷ� �迭�� ũ��� ���α׷� ���൵�� ������� �ʴ´�.(����������)
		System.out.println(arr);//�迭���� ����ϸ� �迭�� �����ּҰ� ���.
		System.out.println(arr[0] + " " + arr[4]);
		
		//3.�� �Ҵ�. �迭��[�ε���] = ��;
		
		arr[0] = 2021;
		arr[1] = 2;
		arr[2] = 1;
		arr[3] = 16;
		arr[4] = 27;
		
		//4. �����. �迭��[�ε���]
		
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
		
		System.out.println("�迭�� ���� ���� : " + arr.length);
		
//		�ϰ�ó�� : �迭�� ���� 0������ �����ϰ�, �迭��.length ��° ���� 1�� �����ϸ鼭 �����ϰ� �ȴ�.
		for(int i = 0; i < 5; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}
