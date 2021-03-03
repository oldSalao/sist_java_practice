package day0215;

/**
 * Fly interface를 구현한 클래스 작성. FlyImple은 Fly이다. (is a 관계, 객체 다형성.)
 * @author user
 */
public class FlyImple implements Fly{

	@Override
	public String upwardForce() {
		return "양력";
	}

	@Override
	public String drivingForce() {
		return "추진력";
	}

}
