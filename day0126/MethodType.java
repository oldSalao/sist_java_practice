package day0126;

/**
 * method의 4가지 형태.
 * 
 * @author user
 */
public class MethodType {

	/**
	 * 고정적인 일. 반환형x,매개변수x
	 */
	public void typeA() {
		System.out.println("고정적인 일.");
	}

	
	/**
	 * 가변적인 일. 반환형 없고, 매개변수 있는 형.
	 * 
	 * @param num
	 */
	public void typeB(int num) {
		System.out.println("가변적인 일. i = " + num);
	}

	
	/**
	 * 고정값. 반환형 있고, 매개변수x
	 * @return
	 */
	public int typeC() {
		return 2021;
	}
	
	/**
	 * 가변값. 반환형 있고, 매개변수 있음.
	 * @param num
	 * @return
	 */
	public int typeD(int num) {
		long l = num * 2L;
		
		if(l>Integer.MAX_VALUE) {
			l = Integer.MAX_VALUE;
		}
		
		return ((int)l);
	}

	
	public static void main(String[] args) {
		int temp = 0;
		// 객체화
		MethodType mt = new MethodType();
		// method 호출.
		for (int i = 0; i < 10; i++) {
			mt.typeA(); // 고정적인 일. 어떻게 호출하든 같은 결과가 나온다.
			mt.typeB(i); // 가변적인 일. 입력 결과에 따라서 다른 결과가 나온다.
			temp = mt.typeC()*3;
			System.out.println("고정값 : " + mt.typeC() + ",  연산 후 : " + temp); // 고정값. 항상 동일한 결과를 반환한다.
		}
		temp = mt.typeD((2147483647/2)+2);//가변값. 입력값에 따라 다른결과가 반환된다.
		System.out.println(temp);
	}
}
