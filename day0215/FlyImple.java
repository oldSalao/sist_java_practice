package day0215;

/**
 * Fly interface�� ������ Ŭ���� �ۼ�. FlyImple�� Fly�̴�. (is a ����, ��ü ������.)
 * @author user
 */
public class FlyImple implements Fly{

	@Override
	public String upwardForce() {
		return "���";
	}

	@Override
	public String drivingForce() {
		return "������";
	}

}
