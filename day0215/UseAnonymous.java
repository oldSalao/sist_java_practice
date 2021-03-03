package day0215;

/**
 * 익명클래스의 사용.
 * @author user
 */

public class UseAnonymous {

	public void useSuperInterA(SuperInterA sia) {
		sia.methodA();
//		sia.test(); //sia는 인터페이스 이므로 Override가 아닌 구현 내용은 사용할 수 없다.
		//따라서 구현부의 Override된 methodA를 통해서 호출한다.
	}

	public void useSuperInterB(SuperInterB sib) {
		sib.methodA();
		sib.methodB();
	}
	
	public static void main(String[] args) {
		UseAnonymous ua = new UseAnonymous();
		ua.useSuperInterA(new SuperInterA() {
			@Override
			public void methodA() {
				System.out.println("익명 클래스로 Override하여 구현한 method");
				test();
			}

			// 클래스가 이름이 없으므로 생성자를 정의할 수 없다.

			// 정의된 method는 anonymous inner class 안에서만 호출될 수 있다.
			public void test() {
				System.out.println("익명 클래스에서 정의한 method");
			}
		});
		ua.useSuperInterB(new SuperInterB() {
			@Override
			public void methodA() {
				System.out.println("익명 클래스로 Override하여 구현한 method");
			}
			
			@Override
			public void methodB() {
				System.out.println("익명 클래스로 Override하여 구현한 method");
			}
		});
	}

}
