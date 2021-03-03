package day0128;

public class Person {
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	public int getEye() {
		return eye;
	}
	public void setEye(int eye) {
		this.eye = eye;
	}
	public int getNose() {
		return nose;
	}
	public void setNose(int nose) {
		this.nose = nose;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String eat() {
		return (name + "는(은) 집에서 밥을 먹었다.");
	}
	
	public String eat(String menu, int pay) {
		return (name + "는(은) " + menu + "를(을) " + pay + "원 내고 사먹었다.");
	}
	
}
