package day0204;

import java.awt.Frame;

/**
 *
 * @author user
 */
public class Child extends Parent{

	private int j;
	
	public Child() {
		System.out.println("자식클래스의 기본 생성자");
	}
	
	public void useJ() {
		System.out.println("자식의 method : " + j);
	}
	
	public static void main(String[] args) {
		//자식 클래스를 객체화
		Child c = new Child();
		//자식클래스의 객체를 통해 부모 클래스의 자원 사용 가능.
		//코드의 재사용성 : 부모클래스의 자원(변수,method)
		c.useJ();
		c.useI();
		//object 메소드 호출 : toString() -> 객체의 주소를 문자열로 반환하는 일.
		System.out.println(c.toString());
		//java.lang.Object 클래스에서 제공하는 모든 method는 모든 클래스에서 사용 가능하다.
		//코드의 재사용성.
		//Integer,String,Frame 객체의 toString은 override 되어 주소가 아닌 값이 나온다.
		Integer i = new Integer(10);
		System.out.println(i.toString());
		String s = new String("Hello");
		System.out.println(s.toString());
		Frame f = new Frame();
		System.out.println(f.toString());
	}
}
