package day0209;

/**
 *
 * @author user
 */
public class InheritanceInstance {
	
	public void polymorphism(Parent p) {
		//Child1�� �ް� �Ͱ� Child2�� �ް�ʹ�. => ��Ӱ����� �θ�Ŭ������ ������ �ȴ�.
		p.printName(); // Parent��� �̸��� ��ü�� �ٸ��� ����� �� �ִ�.
		p.printAge();
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		//�ڽ�Ŭ������ ��üȭ : ��ü�� �θ��� �ڿ�, �ڽ��� �ڿ� ���.
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		//�θ��� ����
		System.out.println(c1.name + " / " + c1.age);
		//�ڽ��� ����
		System.out.println(c1.child1);
		//�θ��� method
		c1.printAge();
		//�ڽ��� Overriding �� method
		c1.printName();
		
		System.out.println("-------------------is a ������ ��üȭ----------------------");
		//�ڽ�Ŭ������ ��ü�� �����ϰ� �θ�Ŭ������ �����Ѵ�.
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		
		//p1 ��ü�� ����� �� �ִ� �ڿ�
		//���� : name,age�� ��밡��. child1 ������ ���Ұ�.
		System.out.println(p1.name + " / " + p1.age);
		//method
		p1.printAge(); // �θ��� method ȣ��.
		p1.printName(); // �θ��� method�� ȣ�������� Override�� �Ǿ��ִٸ�, �ڽ��� method�� �ֿ켱������ ȣ��ȴ�.
		
		//p2 ��ü�� ����� �� �ִ� �ڿ�
		//���� : name,age�� ��밡��. child2 ������ ���Ұ�.
		System.out.println(p2.name + " / " + p2.age);
		//method
		p2.printAge(); // �θ��� method�� ȣ�������� Override�� �Ǿ��ִٸ�, �ڽ��� method�� �ֿ켱������ ȣ��ȴ�.
		p2.printName(); // �θ��� method ȣ��.
		
		System.out.println("------------------------------������--------------------------------");
		
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		InheritanceInstance i = new InheritanceInstance();
		i.polymorphism(ch1);
		i.polymorphism(ch2);
	}
}
