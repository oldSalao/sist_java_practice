package day0122;

/**
 * switch - case 에 break사용<br/>
 * break를 만나면 switch 블럭을 빠져나간다.
 * 
 * @author user
 */
public class TestSwitchCase2 {

	public static void main(String[] args) {
		int i = 0;

		switch (i) {
		case 0: System.out.println("영"); break;
		case 1: System.out.println("일"); 
		case 2: System.out.println("이"); break;
		case 3: System.out.println("삼"); break;
		default : System.out.println("없음"); break;
		}
	}

}
