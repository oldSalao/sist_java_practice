package day0129;

public class UseDog {

	public static void main(String[] args) {
		Dog chiwawa = new Dog("치와와","갈색","소형",5,1.5);
		
		System.out.println(chiwawa.info());
		
		System.out.println(chiwawa.eat());
		System.out.println(chiwawa.bark());
	}

}
