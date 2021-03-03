package day0127;

/**
 * �ϳ��� �Ű������� �������� ���� �־ ����ϴ� Variable Arguments.<br>
 * 
 * @author user
 */
public class VariableArguments {

	public void year(int... a) {
		for (int num : a) {
			System.out.println(num);
		}
	}

	public void variable(int a, int b, double... value) {// ��ĳ������ ������ ���� �� �� V.A�� ���� ���������� ���� �� �ִ�.
		for (double num : value) {
			System.out.println(num);
		}
	}


	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.year(5, 6, 7, 8, 9);//year(), year(1), year(1,2,45,63,4)ó�� �پ��� ������ �Է°��� ���� �� �ִ�.
		
		System.out.println("\"�ȳ��ϼ���\"");
	}

}
