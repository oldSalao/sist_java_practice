package day0215;

/**
 * ����� ���� Ư¡�� ����ϴ� Ŭ����. (Person�� ��ӹ޴� �ڽ� Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ� Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� �� ��뼺), �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * 
 * @author user
 */
public class HongGilDong extends Person {

	private int level;
	/**
	 * ȫ�浿 Ŭ������ �⺻ ������.<br>
	 * ��ü�� ������ �� �⺻������ ������ �־���� �� ����.<br>
	 * �ο� ������ 1~10���� �����ϰ� ȫ�浿�� �ο� ������ ���� ������ 6�� ������ �¾��.<br>
	 */
	public HongGilDong() {
		level = 6;
	}
	public int getLevel() {
		System.out.println("method�� ȣ���ϴ� ��ü�� heap �ּ� : " + this);
//		System.out.println("method�� ȣ���ϴ� ��ü�� heap �ּ� : " + super);//super�� ����� �� ����.
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String eat() {
		return (getName() + "��(��) ������ ���� �Ծ���.");
	}

	/**
	 * �θ� Ŭ������ �����ϴ� ����� �ڽ�Ŭ�������� ���� ���� ��, �ڽ�Ŭ������ ��Ȳ�� �µ��� method�� ������.
	 */
	@Override
	public String eat(String menu, int price) {
		// �θ� Ŭ������ name ������ private ���������ڸ� ������ �־ �ڽ� Ŭ���������� ���� ����� �� ����.
		// ���� �ڽ� Ŭ�������� �θ� Ŭ������ private �ڿ��� ����ϱ� ���� getter method�� ����Ѵ�.
		return (getName() + "��(��) �Ĵ翡�� " + menu + "��(��) " + price + "�� ���� �� �Ծ���.");
	}
	
	/**
	 * ȫ�浿�� �ѱ���� ���־ ������ �� �ִ�.
	 * @return �������
	 */
	@Override
	public String[] language() {
		String[] result = new String[2];
		result[0]="�ѱ���";
		result[1]="���־�";
		return result;
	} 

	/**
	 * �ڽ� Ŭ������ �ڽŸ��� Ư¡, �ο�� ��.
	 * 
	 * @param yourLevle �ο� ����
	 * @return
	 */
	public String fight(int yourLevel) {
		String result = "";

		if (level < yourLevel) { // ������ ������ ���� ��� : ���� ���
			result = yourLevel + "���� ����.";
			level--; // ���� ����
			if (level < 1) {
				level = 1;
			}
		} else if (level > yourLevel) { // ������ ������ ���� ��� : �̱�� ���
			result = yourLevel + "���� �̰��.";
			level++; // ���� ����.
			if (level > 10) {
				level = 10;
			}
		} else { // ���°��
			result = yourLevel + "�� ����.";
			//������ȭ x.
		}
		return result;
	}
}
