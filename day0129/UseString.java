package day0129;

/**
 * ���ڿ�(String)�� �ּҸ� �����ϰ� ����� �� �ִ� java.lang.String Ŭ������ ���.<br>
 * ���ڿ� ����ҿ� ���� ���ڿ��� �ϳ��� �����ǰ� �� �ּҸ� �����.
 * @author user
 *
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ����. (new�� ������� �ʰ� java.lang.String Ŭ������ ���.)
		String str = "AbcdEf";
		System.out.println(str);
		System.out.println("�⺻�� ���� == �� "+(str == "AbcdEf"));
		System.out.println("�⺻�� ���� equals �� "+(str.equals("AbcdEf")));
		
		//������ ���� (new�� ����Ͽ� java.lang.String Ŭ������ ���.)
		String str1 = new String("AbcdEf");
		System.out.println(str1);
		System.out.println("������ ���� == �� " + (str1 == "AbcdEf"));
		System.out.println("������ ���� equals �� " + (str1.equals("AbcdEf")));
	}
}