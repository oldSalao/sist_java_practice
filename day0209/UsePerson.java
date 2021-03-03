package day0209;

/**
 * Person class를 상속받아 사용하는 자식클래스.
 * 
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		// 자식클래스를 객체화 하면, 부모 클래스부터 객체화 된다.
		System.out.println("------------------------------------홍길동------------------------------------");
		HongGilDong hgd = new HongGilDong();
		// 자식클래스에 존재하지 않는 자원을 자식클래스의 객체명으로 사용할 수 있다. - 코드의 재사용.
		System.out.println(hgd.getEye() + " / " + hgd.getNose() + " / " + hgd.getMouth() + " / " + hgd.getName());
		hgd.setName("홍길동");
		System.out.println(hgd.getEye() + " / " + hgd.getNose() + " / " + hgd.getMouth() + " / " + hgd.getName());

		System.out.println(hgd.eat()); // 코드의 재사용
		System.out.println(hgd.eat("뜨끈한 국밥", 3)); // override
		// 자식이 가진 자신만의 특징 ( 클락에는 없고 홍길동만 가진 특징 )
		System.out.println(hgd.fight(5));//이기는 경우 6 -> 7
		System.out.println(hgd.fight(6));//이기는 경우 7 -> 8
		System.out.println(hgd.fight(9));//지는 경우 8 -> 7
		System.out.println(hgd.fight(7));//비기는 경우 7로 유지
		
		//홍길동의 현재 레벨 출력 private 이므로 getter 사용.
		System.out.println("현재 레벨 : " + hgd.getLevel());

		System.out.println("-------------------------------------클락-----------------------------------");

		Clark clk = new Clark();
		clk.setName("클락 켄트");
		System.out.println(clk.getEye() + " / " + clk.getNose() + " / " + clk.getMouth() + " / " + clk.getName());

		System.out.println(clk.eat());
		System.out.println(clk.eat("스테이크", 20));
		
		System.out.println(clk.power("크립토나이트") +" "+ clk.power);
		System.out.println(clk.power("다이아몬드") +" "+ clk.power);
		System.out.println(clk.power("짱돌") +" "+ clk.power);
		// instance variable의 접근 지정자가 public이기 때문에 getter method를 사용하지 않고 직접 접근 가능.
		System.out.println(clk.getName() + "의 현재 힘은 " + clk.power + "입니다.");
		
		System.out.println("-------------------------------------숙제-----------------------------------");
		
		Homework hw = new Homework("이하늘");
		System.out.println(hw.eat());
		System.out.println(hw.eat("떡볶이", 6000));
		System.out.println(hw.basketBall());
		System.out.println(hw.basketBall());
		System.out.println(hw.basketBall());
		System.out.println(hw.point());
		
		System.out.println("-------------------------------------언어-----------------------------------");
		
		String[] hongLang = hgd.language();
		String[] clkLang = clk.language();
		String[] myLang = hw.language();
		
		System.out.print(hgd.getName() + "이 구사할 수 있는 언어는 ");
		for(String lang : hongLang) {
			System.out.print(lang + " ");
		}
		System.out.println();
		System.out.print(clk.getName() + "이 구사할 수 있는 언어는 ");
		for(String lang : clkLang) {
			System.out.print(lang + " ");
		}
		System.out.println();
		System.out.print(hw.getName() + "이 구사할 수 있는 언어는 ");
		for(String lang : myLang) {
			System.out.print(lang + " ");
		}
		
	}
}