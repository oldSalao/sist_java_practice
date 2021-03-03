package day0303;

/**
 * method안에서 발생하는 예외를 호출하는 곳에서 처리하도록 만드는 throws<br>
 * 예외발생 코드와 예외처리 코드를 분리하여 작성할 수 있다.<br>
 * @author user
 */
public class UseThrows {
	/**
	 * Class.forName method를 사용하여 객체생성.<br>
	 * @throws ClassNotFoundException 
	 */
	public void useClass() throws ClassNotFoundException {
		//throws를 정의하면 method안에서 try~catch로 예외를 처리하지 않아도된다. 호출하는 곳에서 처리<br>
		//Class<String> c (Class<String>)Class.forname("java.lang.String") : 자바에서 동작하는 클래스
		Class<String> c =(Class<String>)Class.forName("day0302.UseJOptionPane");
		//윗줄에서 예외를 발생시키면 아랫줄의 코드는 실행되지 않는다.
		System.out.println("객체 : " + c);
	}
	
	/**
	 * throws가 정의된 method를 호출.
	 */
	public void callUseClass() {
		try {
		useClass();//throws된 예외중 Compile Exception은 반드시 처리해야한다.
		}catch(ClassNotFoundException e) {
			System.err.println("클래스를 찾을 수 없습니다. 클래스명 또는 패키지명을 확인하세요");
			e.printStackTrace();//자세한 예외의 이유를 출력.
		}
	}
	
	public static void main(String[] args) {
		UseThrows ut = new UseThrows();
		ut.callUseClass();
	}
}
