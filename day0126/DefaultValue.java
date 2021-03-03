package day0126;

/**
 * instance variable�� �⺻��(default value).
 * @author user
 */
public class DefaultValue {

	//instance variable : Ŭ�������� instance ���������� �׳� ����� �� �ִ� ����.
	
	// primitive type.
	int a;// ������ 0���� �ڵ� �ʱ�ȭ.
	char b;// ������ \u0000 ���� �ڵ� �ʱ�ȭ(Unicode�� �ڵ�â���� ���� ����� ���� ����.
	float c;// �Ǽ��� 0.0f �� �ڵ� �ʱ�ȭ.
	boolean d;// �Ҹ��� false�� �ڵ� �ʱ�ȭ.

	// reference type
	DefaultValue dv; // class : null�� �ڵ��ʱ�ȭ.
	String s; // String : null�� �ڵ��ʱ�ȭ.
	int[] arr; // array : null�� �ڵ��ʱ�ȭ.
	
	/**
	 * instance method
	 */
	public void methodA() { //instance ���������� instance variable�� ��ü�� ���� ����� �� �ִ�.
		System.out.println(a);
	}
	
	/**
	 * static method
	 */
	public static void methodB() {//static method �ȿ����� ��üȭ�� �Ͽ��� instance variable�� ����� �� �ִ�.
		DefaultValue dv = new DefaultValue();
		System.out.println(dv.a);
	}

	public static void main(String[] args) {
		// java DefaultValue�� Ŭ������ �����ϸ� main method�� ���� ó�� ����ȴ�.
		// class field�� �������� �ʴ´�. - �ν��Ͻ� ������ �޸𸮿� �ö��� �ʴ´�. - ���Ұ�)
		// System.out.println(dfv.dv);
		//��üȭ : Ŭ������ ��ü�� = new Ŭ������(); - �ν��Ͻ� ������ �޸𸮿� �ε�ȴ�. - ��밡��)
		DefaultValue dv = new DefaultValue();
		System.out.println("������ : " + dv.a);
		System.out.println("������ : " + dv.b);// ������ ��Ÿ���µ� �̰��� \u0000��.
		System.out.println("�Ǽ��� : " + dv.c);
		System.out.println("�Ҹ��� : " + dv.d);
		
		System.out.println("Class : " + dv.dv);
		System.out.println("String : " + dv.s);
		System.out.println("Array : " + dv.arr);
		System.out.println("==================================================================");
		//instance ������ ��ü���� �����ǰ� ���Ǵ� ����.
		
		DefaultValue dv1 = new DefaultValue();
		DefaultValue dv2 = new DefaultValue();
		
		dv1.a = 10;
		
		System.out.println("dv1.a : " + dv1.a);
		System.out.println("dv2.a : " + dv2.a);
	}

}
