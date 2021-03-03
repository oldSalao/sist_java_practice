package day0209;

public class UseController {

	public static void main(String[] args) {
		TvController tc = new TvController();
		AirController ac = new AirController();
		tc.powerBtn();
		tc.powerBtn();
		tc.downBtn();
		tc.upBtn();
		tc.numBtn(9);
		tc.sleepBtn();
		tc.sleepBtn();
		System.out.println("-----------------------------------");
		ac.powerBtn();
		ac.powerBtn();
		ac.downBtn();
		ac.upBtn();
		ac.sleepBtn();
		ac.sleepBtn();
	}

}
