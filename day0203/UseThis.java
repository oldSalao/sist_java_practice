package day0203;

/**
 * this Ű���带 method �������� ���.<br>
 * this(��,,)<br>
 * �������� ù��° �ٿ����� ���.<br>
 * Ŭ�������� �ٸ� ������ ȣ���.
 * @author user
 */
public class UseThis {
	private int i;
	public UseThis() {
//		this(2021);
		System.out.println("�⺻������.");
	}
	
	public UseThis(int i) {
		this();
		System.out.println("Overload�� ������.");
	}

	public static void main(String[] args) {
		new UseThis(250);
	}

}
