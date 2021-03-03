package day0209;

/**
 * 추상클래스의 자식클래스 반드시 부모클래스의 추상메소드(abstract method)를 모두 구현해야한다.
 * 
 * @author user
 */
public class AbstractSub extends AbstractSuper {

	public AbstractSub() {
		System.out.println("자식 클래스의 생성자.");
	}

	// abstract method 구현 (Override).
	@Override
	public void typeA() {
		System.out.println("고정 일 : 반환형 없고, 매개변수 없는 형.");
	}

	@Override
	public void typeB(String msg) {
//		instanceMethod();// 부모클래스의 일반 method
//		super.typeA(); // 추상메소드는 직접호출 불가.
		System.out.println("가변 일 : 반환형 없고, 매개변수 있는 형.");
	}

	@Override
	public int typeC() { // 고정 값 : 반환형 있고, 매개변수 없는 형.
		return 0;
	}

	@Override
	public int typeD(String m) { // 가변 값 : 반환형 있고, 매개변수 있는 형.
		return m.length();

	}

	public static void main(String[] args) {
		AbstractSub as = new AbstractSub();
		as.typeB("가변 일");
	}

}