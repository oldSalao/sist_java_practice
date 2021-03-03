package day0128;

/**
 * 마카펜을 대상으로 작성된 클래스<br>
 * 명사적인 특징 : 색, 몸체, 뚜껑<br>
 * 동사적인 특징 : 쓴다.<br>
 * 위 특징을 추상화하여 작성한 클래스<br>
 * 사용법)<br>
 * 1.객체화<br>
 * Marker 객체명 = new Marker();<br>
 * 2.사용<br>
 * 객체명.white("화이트보드에 작성할 메세지");<br>
 * 
 * @author user
 */
public class Marker {

	private String color;
	private int cap;
	private int body;
	
	/**
	 * 마카펜 클래스의 기본생성자.<br>
	 * 뚜껑 1개, 몸체 1개, 검은색인 마카펜을 생성할 때 사용.
	 */
	public Marker() {
		this("검은색",1,1);
//		color = "검은색";
//		cap = 1;
//		body = 1;
	}

	/**
	 * 입력하는 값으로 마카펜 객체를 생성하는 Overload된 생성자.
	 * @param color
	 * @param cap
	 * @param body
	 */
	public Marker(String color, int cap, int body) {
		if (color.equals("검은색") || color.equals("빨간색") || color.equals("파란색")) {
			this.color = color;
		} else {
			this.color = "검은색";
		}
		if(cap>10) {
			this.cap=1;
		}
		else {
			this.cap = cap;	
		}
		if(body>10) {
			this.body=1;
		}
		else {
			this.body = body;	
		}
		
		
	}
	/**
	 * 생성된 마카펜을 사용하여 칠판에 입력된 메세지를 쓰는 일.
	 * 
	 * @param msg : 칠판에 쓸 메세지
	 * @return : 칠판에 메세지를 쓴 결과
	 */
	public String write(String msg) {
		return ("칠판에 " + this.getColor() + "인 마카펜으로 \"" + msg + "\"를 쓴다.");
	}

	/**
	 * 생성된 마카펜 객체의 색을 설정하는 일.<br>
	 * 설정가능한 색 목록 : 검은색,빨간색,파란색 3종류만 설정 가능.<br>
	 * 다른 색이 입력되면 검은색으로 설정.
	 * 
	 * @param color : 설정할 색.
	 */
	public void setColor(String color) {
		if (color.equals("검은색") || color.equals("빨간색") || color.equals("파란색")) {
			this.color = color;
		} else {
			this.color = "검은색";
		}

	}

	/**
	 * 생성된 마카펜 객체의 색을 얻는 일.
	 * 
	 * @return : 설정된 색
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * 생성된 마카펜 객체에 뚜껑의 갯수를 설정하는 일.
	 * 
	 * @param cap : 뚜껑의 갯수
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}

	/**
	 * 생성된 마카펜 객체에 설정된 뚜껑의 갯수를 얻는 일.
	 * 
	 * @return : 설정된 뚜껑의 갯수
	 */
	public int getCap() {
		return this.cap;
	}

	/**
	 * 생성된 마카펜 객체의 몸체 갯수를 설정하는 일.
	 * 
	 * @param body : 설정할 몸체의 갯수.
	 */
	public void setBody(int body) {
		this.body = body;
	}

	/**
	 * 생성된 마카펜 객체에 설정된 몸체 갯수를 얻는 일.
	 * 
	 * @return : 설정된 몸체의 갯수
	 */
	public int getBody() {
		return this.body;
	}

}
