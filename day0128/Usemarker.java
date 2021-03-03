package day0128;

/**
 * 마카펜 클래스를 객체로 생성하여 사용하는 클래스
 * @author user
 */
public class Usemarker {
	
	public static void main(String[] args) {
		System.out.println(new Marker());
		
		//1. 객체화 : Marker class를 생성하여 black이라는 객체에 할당. 
		Marker black = new Marker();
		System.out.println(black);
		black.setBody(1);
		black.setCap(1);
		black.setColor("노란색");
		
//		black.color = "검은색";//변수의 접근지정자가 public일때는 클래스 외부에서 자유롭게 값을 변경할 수 있다.
		//값에 대한 입력제한을 설정하기 어렵다. - 이때문에 public을 잘 쓰지 않는다.
		
		System.out.println("마카펜에 설정된 값. 뚜껑 : " + black.getCap() + " 몸체 : " + black.getBody() + " 색상 : " + black.getColor());
		
		//2. 생성된 객체 사용.
		System.out.println(black.write("안녕"));
		
		System.out.println("----------------------------------------------------------------------------");
		
		Marker red = new Marker("빨간색",4,54);
		
		System.out.println(red.getCap() + " / " + red.getBody());
		
		System.out.println(red.write("Hello"));
	}

}
