package day0125;

/**
 * continue �ݺ����� ������ �ǳ� �� ��.<br>
 * @author user
 */
public class TestContinue {
	public static void main(String[] args) {
		//1�������� 100������ ���߿� ¦���� ���.
		for(int i = 1; i < 100; i++) {
			if(i%2!=0) {
				continue;//���������� ������ġ�� ����.
			}
			System.out.println(i);//Ȧ���϶��� �ǳʶپ���� �ڵ�.
		}
		
		for(int i = 1; i < 101; i++) {
			if(i%3==0) {
			System.out.print("¦ ");
			continue;
			}
			System.out.print(i+" ");
		}
	}
}