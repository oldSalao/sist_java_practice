package day0215;

/**
 * ����� ���� Ư¡�� ����� �޾� ����ϰ� �������� ����� �������̽��� �����Ͽ� ����ϴ� Ŭ����.<br>
 * (Person�� ��ӹް� Fly�� ������ �ڽ� Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ� Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� �� ��뼺),
 * �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * @author user
 */
public class Clark extends Person implements Fly{
	
	public int power;
	
	/**
	 * Ŭ�� Ŭ������ �⺻ ������.<br>
	 * ��ü�� ������ �� �⺻������ ������ �־���� �� ����.<br>
	 * �� ������ 1~100���� �����ϰ� Ŭ���� �ο� ������ ���� ������ 80�� ������ �¾��.<br>
	 */
	public Clark() {
		power = 80;
	}
	
	@Override
	public String eat() {
		return (getName() + "��(��) ������ ���� �Ծ���.");
	}
	
	@Override
	public String eat(String menu, int price) {
		//�θ� Ŭ������ name ������ private ���������ڸ� ������ �־ �ڽ� Ŭ���������� ���� ����� �� ����.
		//���� �ڽ� Ŭ�������� �θ� Ŭ������ private �ڿ��� ����ϱ� ���� getter method�� ����Ѵ�.
		return (getName() + "��(��) �Ĵ翡�� " + menu + "��(��) " + price + "�޷��� ���� �� �Ծ���.");
	}
	
	/**
	 * Ŭ���� ����,���Ͼ�,�ܰ� �� �� �ִ�.
	 */
	@Override
	public String[] language() {
		String[] result = {"����","���Ͼ�","�ܰ��"};
		return result;
	}
	
	/**
	 * Ŭ���� ���� �����ϴ� ��. ũ���䳪��Ʈ�� �ԷµǸ� ���� ������.
	 * @param stone ���� ����
	 * @return ���� ���� ���.
	 */
	public String power(String stone) {
		String result = stone;
		
		if(stone.equals("ũ���䳪��Ʈ")) {
			power=0;
			result += " ���� ������..";
		}
		else if(stone.equals("���̾Ƹ��")) {
			power = 80;
			result += " �����մϴ�.";
		}
		else {
			power = 100;
			result += " (�Ѥ�+)(+�Ѥ�)";
		}
		
		return result;
	}
	
	////////////////////////Fly�� abstract method Overriding.//////////////////////////

	@Override
	public String upwardForce() {
		return getName()+"�� ����� 6984.73268 Pa";
	}

	@Override
	public String drivingForce() {
		return getName()+"�� �������� 1000 km/h";
	}

}
