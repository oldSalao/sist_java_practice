package day0303;

/**
 * ���� ���� ����ó�� Ŭ����
 * CompileException
 * @author user
 */
@SuppressWarnings("serial")
public class TobacoException extends Exception{
	
	public TobacoException() {
		super("����� ���� ��! �׷��� �ǿ�ðڽ��ϱ�?");
	}
	public TobacoException(String msg) {
		super(msg);
	}
}
