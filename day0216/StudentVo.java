package day0216;

/**
 * ����� ���� �ڷ���<br>
 * �ڹٿ��� �����ϴ� ���������� �����Ͽ� �������� ������ ������ �������� ����� Ŭ����<br>
 * VO(Value Object)<br>
 * 
 * �л��� ������ �й�,�̸�,����,Ű
 * 
 * @author user
 */
public class StudentVo {

	private int reginum;// �й�
	private String name;// �̸�
	private int age;// ����
	private double height;// Ű

	/**
	 * �л��� ��� ������ ���� ���� �� ����ϴ� constructor.<br>
	 * ���� ������ setter method�� ����Ͽ� �Է��Ѵ�.
	 */
	public StudentVo() {

	}

	/**
	 * �л��� ��� ������ �� �� ����ϴ� constructor.
	 * 
	 * @param reginum
	 * @param name
	 * @param age
	 * @param height
	 */
	public StudentVo(int reginum, String name, int age, double height) {
		this.reginum = reginum;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public int getReginum() {
		return reginum;
	}

	public void setReginum(int reginum) {
		this.reginum = reginum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "StudentVo [reginum=" + reginum + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	

}
