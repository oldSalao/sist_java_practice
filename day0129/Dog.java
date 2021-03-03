package day0129;

/**
 * ���� Ŭ������ �ۼ�.
 * @author user
 */
public class Dog {
	private String name;
	private String color;
	private String size;
	private int age;
	private double weight;

	/**
	 * ������ Overload.
	 * @param name
	 * @param color
	 * @param size
	 * @param age
	 * @param weight
	 */
	public Dog(String name, String color, String size, int age, double weight) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.age = age;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String bark() {
		return (name + "�� ¢�´�.");
	}
	
	public String eat() {
		return (name + "�� ���� �԰��ִ�.");
	}

	public String info() {
		return (name + "�� ����\nũ�� : " + size + "\n�� : " + color + "\n���� : " + weight + " kg\n���� : " + age + "��");
	}
}
