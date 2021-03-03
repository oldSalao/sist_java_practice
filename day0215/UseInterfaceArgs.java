package day0215;

public class UseInterfaceArgs {

	public void useFly(Fly fly) { // interface�� �Ű������� ����.
		System.out.println(fly.drivingForce());
		System.out.println(fly.upwardForce());
	}

	public static void main(String[] args) {
		
		// useFly method�� ȣ��. (interface�� ��ü�� ���� => ����Ŭ������ �԰���.)

		// 1.�������̽��� ������ Ŭ������ �����Ѵ�.
		Fly fly = new FlyImple();

		// 2.�ν��Ͻ� method�� ȣ���ϱ� ���� ��ü ����.
		UseInterfaceArgs uia = new UseInterfaceArgs();

		// 3.method�� ȣ���ϰ� Fly�� ������ ��ü�� arguments�� �Ҵ�.
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
