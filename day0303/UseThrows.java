package day0303;

/**
 * method�ȿ��� �߻��ϴ� ���ܸ� ȣ���ϴ� ������ ó���ϵ��� ����� throws<br>
 * ���ܹ߻� �ڵ�� ����ó�� �ڵ带 �и��Ͽ� �ۼ��� �� �ִ�.<br>
 * @author user
 */
public class UseThrows {
	/**
	 * Class.forName method�� ����Ͽ� ��ü����.<br>
	 * @throws ClassNotFoundException 
	 */
	public void useClass() throws ClassNotFoundException {
		//throws�� �����ϸ� method�ȿ��� try~catch�� ���ܸ� ó������ �ʾƵ��ȴ�. ȣ���ϴ� ������ ó��<br>
		//Class<String> c (Class<String>)Class.forname("java.lang.String") : �ڹٿ��� �����ϴ� Ŭ����
		Class<String> c =(Class<String>)Class.forName("day0302.UseJOptionPane");
		//���ٿ��� ���ܸ� �߻���Ű�� �Ʒ����� �ڵ�� ������� �ʴ´�.
		System.out.println("��ü : " + c);
	}
	
	/**
	 * throws�� ���ǵ� method�� ȣ��.
	 */
	public void callUseClass() {
		try {
		useClass();//throws�� ������ Compile Exception�� �ݵ�� ó���ؾ��Ѵ�.
		}catch(ClassNotFoundException e) {
			System.err.println("Ŭ������ ã�� �� �����ϴ�. Ŭ������ �Ǵ� ��Ű������ Ȯ���ϼ���");
			e.printStackTrace();//�ڼ��� ������ ������ ���.
		}
	}
	
	public static void main(String[] args) {
		UseThrows ut = new UseThrows();
		ut.callUseClass();
	}
}
