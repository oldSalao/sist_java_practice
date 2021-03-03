package day0223;

public abstract class Shape {

	private int countSides;

	public Shape() {

	}

	public Shape(int countSides) {
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

}
