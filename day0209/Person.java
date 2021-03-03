package day0209;

/**
 * 사람을 추상화(객체모델링)하여 공통 특징을 추출해서 구현한 클래스로 직접 객체화 하는것보다.<br>
 * 자식클래스를 만들어 상속을 해주는 목적으로 설계된 클래스.(abstract class)<br>
 * 명사적 : 눈, 코, 입, 이름<br>
 * 동사적 : 먹는다.-Overloading<br>
 * 
 * @author user
 */
public abstract class Person {

	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	/**
	 * 눈 2개, 코 1개, 입 1개인 사람 객체를 생성할 때 사용하는 생성자.
	 */
	public Person() {
		eye=2;
		nose=1;
		mouth=1;
	}

	/**
	 * 눈,코,입의 갯수를 설정하여 사람 객체를 생성하는 생성자.
	 * @param eye 눈의갯수
	 * @param nose 코의갯수
	 * @param mouth 입의갯수
	 * @param name 이름
	 */
	public Person(int eye, int nose, int mouth, String name) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
		this.name = name;
	}
	
	// 값을 설정하는 setter method

	public void setEye(int eye) {
		this.eye = eye;
	}

	public void setNose(int nose) {
		this.nose = nose;
	}

	public void setMouth(int mouth) {
		this.mouth = mouth;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 값을 얻는 getter method

	public int getEye() {
		return eye;
	}

	public int getNose() {
		return nose;
	}

	public int getMouth() {
		return mouth;
	}

	public String getName() {
		return name;
	}

	/**
	 * 생성된 사람 객체가 집에서 밥을 먹는 일을 구현하도록 강제성을 부여.
	 * 
	 * @return 밥먹는 일.
	 */
	public abstract String eat();

	/**
	 * method Overload(Overloading)
	 * 생성된 사람 객체가 식당에서 밥을 사먹는 일을 구현하도록 강제성을 부여.
	 * @param menu 음식의 종류
	 * @param price 음식의 가격
	 * @return 밥을 사먹는 일.
	 */
	public abstract String eat(String menu, int price);
	
	/**
	 * 생성된 사람객체가 구사하는 언어를 구현하도록 강제성을 부여하는 method.
	 * @return 구사할 수 있는 언어들.
	 */
	public abstract String[] language();
}
