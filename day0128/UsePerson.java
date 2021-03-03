package day0128;

public class UsePerson {

	public static void main(String[] args) {
		Person p = new Person();

		p.setName("¿Ã«œ¥√");
		p.setEye(2);
		p.setNose(1);
		p.setMouth(1);

		System.out.println(p.getName());
		System.out.println(p.getEye());
		System.out.println(p.getNose());
		System.out.println(p.getMouth());

		System.out.println(p.eat());
		System.out.println(p.eat("±Ëπ‰", 3500));
	}

}
