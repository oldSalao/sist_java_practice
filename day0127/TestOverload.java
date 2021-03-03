package day0127;

/**
 * 클래스에서 같은 이름의 method를 여러개 만들 수 있는 Overload의 사용. 규칙)접근지정자, 반환형은 달라도 되고,
 * method명은 같아야하고 매개변수는 반드시 달라야 한다.
 * 
 * @author user
 */
public class TestOverload {

	/**
	 * 별 한개를 출력하는 method.
	 */
	public void printStar() {
		System.out.println("★");
	}

	/**
	 * 입력받은 수대로 별을 출력하는 method
	 * @param count 출력할 별의 개수.
	 */
	
//	public void printStar(int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.print("☆");
//		}
//		System.out.println();
//	}

	public void printStar(int c) {
		for (int i = 0; i < c; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.printStar();
		to.printStar(4);
	}
}
