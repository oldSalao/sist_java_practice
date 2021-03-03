package day0223;

public class Rectangle extends Shape implements Resizeable {
	private double width, height;

	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}
}
