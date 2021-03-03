package day0215;

/**
 * method 안에 클래스를 정의하는 지역클래스.
 * 
 * @author user
 */
public class TestLocal {
	int outI;

	public TestLocal() {
		System.out.println("바깥클래스의 생성자.");
	}// TestLocal

	// parameter에 final을 붙이면 method 내부에서는 값변경을 막고, 입력한 그대로만 사용하게된다.
	public void methodA(int paramA, final int paramB) {
		int locA = 0;
		final int locB = 0;// public, static등의 접근지정자 사용불가능. 하지만 final은 가능.
		// 매개변수와 지역변수는 원래 모두 final을 붙여야 하지만 현재 JDK 버전에서는 안붙여도 됨. 대신 값변경 불가.

		////////////////////////// 지역클래스 시작///////////////////////////
		class Local {
			int i;

			public Local() {
				System.out.println("지역클래스의 생성자.");
			}// Local

			public void locMethod() {
				System.out.println("지역클래스의 method. 지역클래스의 instance 변수 : " + i);
				// paramA = 100;// final이 아닌데도 값변경 불가.
				// locA = 100;// final이 아닌데도 값변경 불가.
				System.out.println("method의 매개변수 : " + paramA + ", " + paramB);
				System.out.println("method의 지역변수 : " + locA + ", final : " + locB);
			}// locMethod
		}
		////////////////////////// 지역클래스 끝///////////////////////////

		// 지역클래스의 객체화
		Local loc = new Local();
		loc.locMethod();// 지역클래스의 method 호출.
	}// methodA

	public void methodB() {
		//외부 method 안에서는 지역 클래스를 사용할 수 없다.
		//클래스가 존재하는 method를 호출하는것은 가능.
	}
	public static void main(String[] args) {
		TestLocal tl = new TestLocal();
		tl.methodA(2021, 2);
	}
}