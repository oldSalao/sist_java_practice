package day0302;

/**
 * ������ DataVO ��ü�� �����Ͽ� ����ϴ� Ŭ����.<br>
 * @author user
 */
public class UseDataVO {
	public static void main(String[] args){
		DataVO dv = new DataVO("���ϴ�",26);
		DataVO dv2 = dv.cloneDataVO();
		System.out.println("���� ��ü �ּ� : " + dv);
		System.out.println("������ ��ü �ּ� : " + dv2);
	}
}
