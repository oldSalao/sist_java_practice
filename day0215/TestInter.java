package day0215;

/**
 * 인터페이스 : 다중 상속의 장점을 누리기 위해서 사용.<br>
 * 또는, 약결합의 구현으로 객체간의 유연성을 높이기 위해서 사용.<br>
 * 
 * @author user
 */
public interface TestInter {
//	int i; // 객체의 크기에 영향을 주는 인스턴스 변수를 가질 수 없다. 
	public static final int I = 100; // 상수 작성 가능.

//	public TestInter() {} // 객체가 생성될 때 값을 넣을 수 있는 생성자를 가질 수 없다.

//	public void test() {} // 일을 할 수 있는 일반 메소드를 가질 수 없다.

	// 인터페이스에서 abstract의 유무는 문법상의 차이일뿐 같은 추상메소드이다.

//	abstract이 들어간 abstract method. 
	public abstract void methodA();

//	abstract이 들어가지않은 abstract method.
	public void methodB();
	
	//default method : body가 있는 method.
	
	public default void methodC(int i) {
		System.out.println("default method 호출. i : "+i);
	}
	
}// interface
