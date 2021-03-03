package day0215;

/**
 * 인터페이스를 사용하기 위한 클래스.<br>
 * 인터페이스는 클래스가 구현(implements)하여 사용할 수 있다.<br>
 * @author user
 */
public class UseInterface implements TestInter{

	public UseInterface(){
		System.out.println("인터페이스를 구현한 클래스의 객체 생성.");
	}
	
//	구현 인터페이스의 추상 method를 반드시 Override 해야한다.
	@Override
	public void methodA() {
		System.out.println("method A");
	}

	@Override
	public void methodB() {
		System.out.println("오버라이딩하는 method의 접근지정자는 광의의 접근지정자로 달라져도 되고, 반환형, method명, 매개변수는 같게 만든다.");
	}
	
	@Override
	public void methodC(int i) {
		System.out.println("Default method의 Override. i : " + i);
	}
	
	public static void main(String[] args) {
		//인터페이스는 직접 객체화를 할 수 없다.
//		TestInter ti = new TestInter;
		//구현클래스의 주소를 저장할 수 있다.(객체 다형성)
		TestInter ui = new UseInterface();
		ui.methodA();// 구현 클래스의 method가 호출된다. (Overriding 했기 때문이다.)
		ui.methodB();// 구현 클래스의 method가 호출된다. (Overriding 했기 때문이다.)
		ui.methodC(5);// Override 된 default method 호출.
	}
}
