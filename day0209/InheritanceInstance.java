package day0209;

/**
 *
 * @author user
 */
public class InheritanceInstance {
	
	public void polymorphism(Parent p) {
		//Child1도 받고 싶고 Child2도 받고싶다. => 상속관계의 부모클래스를 받으면 된다.
		p.printName(); // Parent라는 이름의 객체를 다르게 사용할 수 있다.
		p.printAge();
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		//자식클래스로 객체화 : 객체로 부모의 자원, 자식의 자원 사용.
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		//부모의 변수
		System.out.println(c1.name + " / " + c1.age);
		//자식의 변수
		System.out.println(c1.child1);
		//부모의 method
		c1.printAge();
		//자식이 Overriding 한 method
		c1.printName();
		
		System.out.println("-------------------is a 관계의 객체화----------------------");
		//자식클래스로 객체를 생성하고 부모클래스에 저장한다.
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		
		//p1 객체로 사용할 수 있는 자원
		//변수 : name,age는 사용가능. child1 변수는 사용불가.
		System.out.println(p1.name + " / " + p1.age);
		//method
		p1.printAge(); // 부모의 method 호출.
		p1.printName(); // 부모의 method를 호출했지만 Override가 되어있다면, 자식의 method가 최우선적으로 호출된다.
		
		//p2 객체로 사용할 수 있는 자원
		//변수 : name,age는 사용가능. child2 변수는 사용불가.
		System.out.println(p2.name + " / " + p2.age);
		//method
		p2.printAge(); // 부모의 method를 호출했지만 Override가 되어있다면, 자식의 method가 최우선적으로 호출된다.
		p2.printName(); // 부모의 method 호출.
		
		System.out.println("------------------------------다형성--------------------------------");
		
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		InheritanceInstance i = new InheritanceInstance();
		i.polymorphism(ch1);
		i.polymorphism(ch2);
	}
}
