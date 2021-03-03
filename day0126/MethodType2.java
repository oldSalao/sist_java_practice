package day0126;

/**
 *
 * @author user
 */

public class MethodType2 {
	
	public void sayHello(){
		System.out.println("안녕하세요 최홍만입니다.");
	}
	
	public int nowYear() {
		return 2021;
	}
	
	public void unicode(char c) {
		System.out.println(c + "의 unicode 값 : " + (int)c);
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
