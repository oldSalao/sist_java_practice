package day0223;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 6);
		RectTriangle rectTri = new RectTriangle(6, 2);
		List<Shape> list = new ArrayList<Shape>();

		list.add(rect);
		list.add(rectTri);
		
		for (Shape temp : list) {
			System.out.println("area: " + temp.getArea());
			System.out.println("perimeter: " + temp.getPerimeter());
			if (temp instanceof Rectangle) {
				((Rectangle) temp).resize(0.5);
				System.out.println("new area: " + temp.getArea());
				System.out.println("new perimeter: " + temp.getPerimeter());
			}
		}
	}

}
