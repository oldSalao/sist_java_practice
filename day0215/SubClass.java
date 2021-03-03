package day0215;

/**
 * 구현하는 인터페이스가 상속 관계를 가지고 있을 때, <br>
 * 구현 클래스에서는 모든 abstract method를 Override 해야 한다.<br>
 * @author user
 */
public class SubClass implements SuperInterC{

	@Override
	public void methodA() { // SuperInterA의 abstract method.
		
	}
	
	@Override
	public void methodB() { // SuperInterB의 abstract method.
		
	}

	@Override
	public void methodB1() { // SuperInterB1의 abstract method.
		
	}

	@Override
	public void methodC() { // SuperInterC의 abstract method.
		
	}
}
