package day0217;

/**
 * 생성자가 존재하지 않아(생성자가 private인) 객체 생성을 하지 않고 사용하는 클래스.
 * @author user
 */
public class UseMath {
	
	public UseMath() {
		//Math m = new Math(); // 생성자가 private이므로 객체 생성 불가능.
		int i = 2021;
		double d = -2021.02;
		System.out.println(Math.abs(i));
		System.out.println(Math.abs(d));
		
		//반올림
		d=10.6;
		System.out.println(d + "반올림" + Math.round(d));
		//올림
		d=10.0;
		System.out.println(d + "올림" + Math.ceil(d));
		//내림
		d=10.9;
		System.out.println(d + "내림" + Math.floor(d));
		//절삭, casting으로 처리
		d=10.5;
		System.out.println(d + "절삭" + (int)d);
		
		//난수
		double ran = Math.random();
		
		System.out.println("난수 : " + ran);
		System.out.println("난수 : " + ran*10); // 0~9까지의 10개의 수중 하나 얻기 (실수 발생).
		System.out.println("난수 : " + (int)(ran*10)); // 0~9까지의 10개의 수중 하나 얻기 (정수).
		
		//1에서부터 10까지의 난수
		System.out.println("난수 : " + (int)(ran*10+1));
		
		System.out.println("대문자 : " + (char)((int)(ran*26+65)));
		
		System.out.println("소문자 : " + (char)((int)(ran*26+97)));
		
		System.out.println("숫자(char) : " + (char)((int)(ran*10+48)));
	}

	public static void main(String[] args) {
		new UseMath();
	}

}
