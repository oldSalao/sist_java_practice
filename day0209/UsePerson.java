package day0209;

/**
 * Person class�� ��ӹ޾� ����ϴ� �ڽ�Ŭ����.
 * 
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		// �ڽ�Ŭ������ ��üȭ �ϸ�, �θ� Ŭ�������� ��üȭ �ȴ�.
		System.out.println("------------------------------------ȫ�浿------------------------------------");
		HongGilDong hgd = new HongGilDong();
		// �ڽ�Ŭ������ �������� �ʴ� �ڿ��� �ڽ�Ŭ������ ��ü������ ����� �� �ִ�. - �ڵ��� ����.
		System.out.println(hgd.getEye() + " / " + hgd.getNose() + " / " + hgd.getMouth() + " / " + hgd.getName());
		hgd.setName("ȫ�浿");
		System.out.println(hgd.getEye() + " / " + hgd.getNose() + " / " + hgd.getMouth() + " / " + hgd.getName());

		System.out.println(hgd.eat()); // �ڵ��� ����
		System.out.println(hgd.eat("�߲��� ����", 3)); // override
		// �ڽ��� ���� �ڽŸ��� Ư¡ ( Ŭ������ ���� ȫ�浿�� ���� Ư¡ )
		System.out.println(hgd.fight(5));//�̱�� ��� 6 -> 7
		System.out.println(hgd.fight(6));//�̱�� ��� 7 -> 8
		System.out.println(hgd.fight(9));//���� ��� 8 -> 7
		System.out.println(hgd.fight(7));//���� ��� 7�� ����
		
		//ȫ�浿�� ���� ���� ��� private �̹Ƿ� getter ���.
		System.out.println("���� ���� : " + hgd.getLevel());

		System.out.println("-------------------------------------Ŭ��-----------------------------------");

		Clark clk = new Clark();
		clk.setName("Ŭ�� ��Ʈ");
		System.out.println(clk.getEye() + " / " + clk.getNose() + " / " + clk.getMouth() + " / " + clk.getName());

		System.out.println(clk.eat());
		System.out.println(clk.eat("������ũ", 20));
		
		System.out.println(clk.power("ũ���䳪��Ʈ") +" "+ clk.power);
		System.out.println(clk.power("���̾Ƹ��") +" "+ clk.power);
		System.out.println(clk.power("¯��") +" "+ clk.power);
		// instance variable�� ���� �����ڰ� public�̱� ������ getter method�� ������� �ʰ� ���� ���� ����.
		System.out.println(clk.getName() + "�� ���� ���� " + clk.power + "�Դϴ�.");
		
		System.out.println("-------------------------------------����-----------------------------------");
		
		Homework hw = new Homework("���ϴ�");
		System.out.println(hw.eat());
		System.out.println(hw.eat("������", 6000));
		System.out.println(hw.basketBall());
		System.out.println(hw.basketBall());
		System.out.println(hw.basketBall());
		System.out.println(hw.point());
		
		System.out.println("-------------------------------------���-----------------------------------");
		
		String[] hongLang = hgd.language();
		String[] clkLang = clk.language();
		String[] myLang = hw.language();
		
		System.out.print(hgd.getName() + "�� ������ �� �ִ� ���� ");
		for(String lang : hongLang) {
			System.out.print(lang + " ");
		}
		System.out.println();
		System.out.print(clk.getName() + "�� ������ �� �ִ� ���� ");
		for(String lang : clkLang) {
			System.out.print(lang + " ");
		}
		System.out.println();
		System.out.print(hw.getName() + "�� ������ �� �ִ� ���� ");
		for(String lang : myLang) {
			System.out.print(lang + " ");
		}
		
	}
}