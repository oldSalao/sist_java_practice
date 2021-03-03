package day0208;

/**
 * ����� ���� Ư¡�� ����ϴ� Ŭ����. (Person�� ��ӹ޴� �ڽ� Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ� Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� �� ��뼺),
 * �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * @author user
 */
public class Clark extends Person{
	
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
}
