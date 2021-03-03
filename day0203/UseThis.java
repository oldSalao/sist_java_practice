package day0203;

/**
 * this 키워드를 method 형식으로 사용.<br>
 * this(값,,)<br>
 * 생성자의 첫번째 줄에서만 사용.<br>
 * 클래스안의 다른 생성자 호출용.
 * @author user
 */
public class UseThis {
	private int i;
	public UseThis() {
//		this(2021);
		System.out.println("기본생성자.");
	}
	
	public UseThis(int i) {
		this();
		System.out.println("Overload된 생성자.");
	}

	public static void main(String[] args) {
		new UseThis(250);
	}

}
