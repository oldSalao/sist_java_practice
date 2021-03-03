package day0215;

/**
 * 사람의 공통 특징은 상속을 받아 사용하고 날기위한 기능은 인터페이스를 구현하여 사용하는 클래스.<br>
 * (Person을 상속받고 Fly를 구현한 자식 클래스)<br>
 * 눈,코,입,이름,먹는 일은 부모 클래스에서 제공하는 것을 사용하고(코드의 재 사용성),
 * 자신만의 특징을 정의하는 클래스.
 * @author user
 */
public class Clark extends Person implements Fly{
	
	public int power;
	
	/**
	 * 클락 클래스의 기본 생성자.<br>
	 * 객체가 생성될 때 기본적으로 가지고 있어야할 값 설정.<br>
	 * 힘 레벨은 1~100까지 존재하고 클락은 싸움 레벨이 높은 상태인 80을 가지고 태어난다.<br>
	 */
	public Clark() {
		power = 80;
	}
	
	@Override
	public String eat() {
		return (getName() + "이(가) 집에서 빵을 먹었다.");
	}
	
	@Override
	public String eat(String menu, int price) {
		//부모 클래스의 name 변수가 private 접근지정자를 가지고 있어서 자식 클래스에서는 직접 사용할 수 없다.
		//따라서 자식 클래스에서 부모 클래스의 private 자원을 사용하기 위해 getter method를 사용한다.
		return (getName() + "이(가) 식당에서 " + menu + "을(를) " + price + "달러를 내고 사 먹었다.");
	}
	
	/**
	 * 클락은 영어,독일어,외계어를 할 수 있다.
	 */
	@Override
	public String[] language() {
		String[] result = {"영어","독일어","외계어"};
		return result;
	}
	
	/**
	 * 클락의 힘을 설정하는 일. 크립토나이트가 입력되면 힘이 빠진다.
	 * @param stone 돌의 종류
	 * @return 돌을 맞은 결과.
	 */
	public String power(String stone) {
		String result = stone;
		
		if(stone.equals("크립토나이트")) {
			power=0;
			result += " 힘이 빠진다..";
		}
		else if(stone.equals("다이아몬드")) {
			power = 80;
			result += " 감사합니다.";
		}
		else {
			power = 100;
			result += " (ㅡㅡ+)(+ㅡㅡ)";
		}
		
		return result;
	}
	
	////////////////////////Fly의 abstract method Overriding.//////////////////////////

	@Override
	public String upwardForce() {
		return getName()+"의 양력은 6984.73268 Pa";
	}

	@Override
	public String drivingForce() {
		return getName()+"의 추진력은 1000 km/h";
	}

}
