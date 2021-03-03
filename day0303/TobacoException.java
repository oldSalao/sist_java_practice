package day0303;

/**
 * 흡연에 대한 예외처리 클래스
 * CompileException
 * @author user
 */
@SuppressWarnings("serial")
public class TobacoException extends Exception{
	
	public TobacoException() {
		super("폐암의 원인 흡연! 그래도 피우시겠습니까?");
	}
	public TobacoException(String msg) {
		super(msg);
	}
}
