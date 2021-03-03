package day0302;

/**
 * 생성된 DataVO 객체를 복제하여 사용하는 클래스.<br>
 * @author user
 */
public class UseDataVO {
	public static void main(String[] args){
		DataVO dv = new DataVO("이하늘",26);
		DataVO dv2 = dv.cloneDataVO();
		System.out.println("원본 객체 주소 : " + dv);
		System.out.println("복제한 객체 주소 : " + dv2);
	}
}
