package day0215;

/**
 * 사람의 공통 특징을 사용하는 클래스. (Person을 상속받는 자식 클래스)<br>
 * 눈,코,입,이름,먹는 일은 부모 클래스에서 제공하는 것을 사용하고(코드의 재 사용성), 자신만의 특징을 정의하는 클래스.
 * 
 * @author user
 */
public class HongGilDong extends Person {

	private int level;
	/**
	 * 홍길동 클래스의 기본 생성자.<br>
	 * 객체가 생성될 때 기본적으로 가지고 있어야할 값 설정.<br>
	 * 싸움 레벨은 1~10까지 존재하고 홍길동은 싸움 레벨이 높은 상태인 6을 가지고 태어난다.<br>
	 */
	public HongGilDong() {
		level = 6;
	}
	public int getLevel() {
		System.out.println("method를 호출하는 객체의 heap 주소 : " + this);
//		System.out.println("method를 호출하는 객체의 heap 주소 : " + super);//super는 출력할 수 없다.
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String eat() {
		return (getName() + "이(가) 집에서 밥을 먹었다.");
	}

	/**
	 * 부모 클래스가 제공하는 기능이 자식클래스에서 맞지 않을 때, 자식클래스의 상황과 맞도록 method를 재정의.
	 */
	@Override
	public String eat(String menu, int price) {
		// 부모 클래스의 name 변수가 private 접근지정자를 가지고 있어서 자식 클래스에서는 직접 사용할 수 없다.
		// 따라서 자식 클래스에서 부모 클래스의 private 자원을 사용하기 위해 getter method를 사용한다.
		return (getName() + "이(가) 식당에서 " + menu + "을(를) " + price + "냥 내고 사 먹었다.");
	}
	
	/**
	 * 홍길동은 한국어와 만주어를 구사할 수 있다.
	 * @return 구현언어
	 */
	@Override
	public String[] language() {
		String[] result = new String[2];
		result[0]="한국어";
		result[1]="만주어";
		return result;
	} 

	/**
	 * 자식 클래스의 자신만의 특징, 싸우는 일.
	 * 
	 * @param yourLevle 싸움 레벨
	 * @return
	 */
	public String fight(int yourLevel) {
		String result = "";

		if (level < yourLevel) { // 상대방의 레벨이 높은 경우 : 지는 경우
			result = yourLevel + "에게 졌다.";
			level--; // 레벨 감소
			if (level < 1) {
				level = 1;
			}
		} else if (level > yourLevel) { // 상대방의 레벨이 낮은 경우 : 이기는 경우
			result = yourLevel + "에게 이겼다.";
			level++; // 레벨 증가.
			if (level > 10) {
				level = 10;
			}
		} else { // 비기는경우
			result = yourLevel + "과 비겼다.";
			//레벨변화 x.
		}
		return result;
	}
}
