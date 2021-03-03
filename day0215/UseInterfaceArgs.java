package day0215;

public class UseInterfaceArgs {

	public void useFly(Fly fly) { // interface를 매개변수로 정의.
		System.out.println(fly.drivingForce());
		System.out.println(fly.upwardForce());
	}

	public static void main(String[] args) {
		
		// useFly method를 호출. (interface를 객체로 생성 => 구현클래스로 쌉가능.)

		// 1.인터페이스를 구현한 클래스를 생성한다.
		Fly fly = new FlyImple();

		// 2.인스턴스 method를 호출하기 위해 객체 생성.
		UseInterfaceArgs uia = new UseInterfaceArgs();

		// 3.method를 호출하고 Fly를 구현한 객체를 arguments로 할당.
		uia.useFly(fly);

//		uia.useFly(new Fly() {
//			@Override
//			public String drivingForce() {
//				return "driving";
//			}
//			@Override
//			public String upwardForce() {
//				return "upward";
//			}
//		});

	}

}
