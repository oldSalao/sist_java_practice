package day0208;

/**
 * ����� �߻�ȭ(��ü�𵨸�)�Ͽ� ���� Ư¡�� �����ؼ� ������ Ŭ������ ���� ��üȭ �ϴ°ͺ���.<br>
 * �ڽ�Ŭ������ ����� ����� ���ִ� �������� ����� Ŭ����<br>
 * ����� : ��, ��, ��, �̸�<br>
 * ������ : �Դ´�.-Overloading<br>
 * 
 * @author user
 */
public class Person {

	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	/**
	 * �� 2��, �� 1��, �� 1���� ��� ��ü�� ������ �� ����ϴ� ������.
	 */
	public Person() {
		eye=2;
		nose=1;
		mouth=1;
	}

	/**
	 * ��,��,���� ������ �����Ͽ� ��� ��ü�� �����ϴ� ������.
	 * @param eye ���ǰ���
	 * @param nose ���ǰ���
	 * @param mouth ���ǰ���
	 * @param name �̸�
	 */
	public Person(int eye, int nose, int mouth, String name) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
		this.name = name;
	}
	
	// ���� �����ϴ� setter method

	public void setEye(int eye) {
		this.eye = eye;
	}

	public void setNose(int nose) {
		this.nose = nose;
	}

	public void setMouth(int mouth) {
		this.mouth = mouth;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ���� ��� getter method

	public int getEye() {
		return eye;
	}

	public int getNose() {
		return nose;
	}

	public int getMouth() {
		return mouth;
	}

	public String getName() {
		return name;
	}

	/**
	 * ������ ��� ��ü�� ������ ���� �Դ��� ����.
	 * 
	 * @return ��Դ� ��.
	 */
	public String eat() {
		return (name + "��(��) ������ ���� �Ծ���.");
	}

	/**
	 * method Overload(Overloading)
	 * ������ ��� ��ü�� �Ĵ翡�� ���� ��Դ� �� ����.
	 * @param menu ������ ����
	 * @param price ������ ����
	 * @return ���� ��Դ� ��.
	 */
	public String eat(String menu, int price) {
		return (name + "��(��) �Ĵ翡�� " + menu + "��(��) " + price + "�� ���� �� �Ծ���.");
	}
}
