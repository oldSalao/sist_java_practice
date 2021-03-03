package day0209;

/**
 * 상속 관계에서 부모 클래스를 생성할 때.
 * @author user
 */
public abstract class AbstractSuper {
	int i;

	public AbstractSuper() {
		System.out.println("추상클래스의 기본생성자");
	}
	
	public void instanceMethod() {
		System.out.println("일반 method");
	}
	
	/////////////////////////////////추상 클래스///////////////////////////////////////////
	public abstract void typeA();
	public abstract void typeB(String msg);
	public abstract int typeC();
	public abstract int typeD(String msh);
	
	public static void main(String[] args) {
//		new AbstractSuper();// 추상 클래스는 직접 객체화 할 수 없다.
	}
}
