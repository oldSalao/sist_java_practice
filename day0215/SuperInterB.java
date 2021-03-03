package day0215;

/**
 * 인터페이스는 인터페이스끼리 상속된다.(다중 상속 가능.)<br>
 * 
 * @author user
 */
public interface SuperInterB extends SuperInterA{
	// 자식 인터페이스에서 부모 인터페이스의 추상 method를 Override 할 수 있지만 달라지는 것이 없으므로 굳이 하지 않는다.
	// 즉 구현을 미룰 수 있다.
	// @Override
	// public void methodA();
	public void methodB();
}
