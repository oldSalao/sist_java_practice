package day0126;

/**
 *
 * @author user
 */

public class MethodType2 {
	
	public void sayHello(){
		System.out.println("�ȳ��ϼ��� ��ȫ���Դϴ�.");
	}
	
	public int nowYear() {
		return 2021;
	}
	
	public void unicode(char c) {
		System.out.println(c + "�� unicode �� : " + (int)c);
	}
	
	public int castNum(double d) {
		return (int)d;
	}

	public static void main(String[] args) {
		MethodType2 mt = new MethodType2();
		mt.sayHello();
		int year = mt.nowYear();
		System.out.println(year);
		mt.unicode('A');
		int value = mt.castNum(43.95);
		System.out.println(value);
		
	}

}
