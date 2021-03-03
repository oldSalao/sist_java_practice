package day0126;

/**
 * ���뺯���� ���.
 * 
 * @author user
 */
public class UseStaticVariable {

	static int a; //static variable (class variable)
	static double b;
	
	/**
	 * instance method
	 */
	public void methodA() {
		System.out.println(a);
	}
	
	/**
	 * static method
	 */
	public static void methodB() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		//static ������ Ŭ������ ����Ǵ� ������ �޸𸮿� �ö󰡱� ������ Ŭ������ ��𿡼��� ����� �� �ִ�.
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------------------------------------------------------------");
		//static ������ Ư����ü�� �����ִ� ������ �ƴϹǷ� ��ü��.���������� ������� �ʴ´�.
		UseStaticVariable usv = new UseStaticVariable();
		UseStaticVariable usv1 = new UseStaticVariable();
		
		usv.a = 100; //usv��ü�� a������ �����ϸ� usv1 ��ü�� a�� ���� ����ȴ�.
		
		System.out.println("usv.a : " + usv.a);
		System.out.println("usv.b : " +usv.b);
		
		System.out.println("usv1.a : " +usv1.a);
		System.out.println("usv1.b : " +usv1.b);
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println(UseStaticVariable.a);//static ������ � ��ü���� �������� ���� ���뺯�� �̹Ƿ�
		//��ü�� �����Ͽ� ��ü��.���������� ����ϴ� ���̾ƴ� Ŭ������.���������� ����Ѵ�.
	}

}
