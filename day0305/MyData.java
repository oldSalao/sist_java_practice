package day0305;

import java.io.Serializable;

/**
 * JVM�ܺη� ����ȭ�Ǿ� ������ Ŭ����.
 * 
 * @author user
 */
public class MyData implements Serializable {
	/**
	 * ID�� 2021-03-06�� ���� �˴ϴ�. 
	 */
	private static final long serialVersionUID = -8392732757810387322L;
	private transient String name;
	private double height;
	private double weight;

	public MyData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "MyData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
}
