package day0121;

public class Homework {

	public static final int BUS = 1200;
	public static final int TRAIN = 1300;
	public static final int TAXI = 3800;

	public static void main(String[] args) {
		///////////////////////// 1///////////////////////
		int birthYear = Integer.parseInt(args[0]);

		if (birthYear % 12 == 0) {
			System.out.println(birthYear + "년생 원숭이 띠");
		} else if (birthYear % 12 == 1) {
			System.out.println(birthYear + "년생 닭 띠");
		} else if (birthYear % 12 == 2) {
			System.out.println(birthYear + "년생 개 띠");
		} else if (birthYear % 12 == 3) {
			System.out.println(birthYear + "년생 돼지 띠");
		} else if (birthYear % 12 == 4) {
			System.out.println(birthYear + "년생 쥐 띠");
		} else if (birthYear % 12 == 5) {
			System.out.println(birthYear + "년생 소 띠");
		} else if (birthYear % 12 == 6) {
			System.out.println(birthYear + "년생 호랑이 띠");
		} else if (birthYear % 12 == 7) {
			System.out.println(birthYear + "년생 토끼 띠");
		} else if (birthYear % 12 == 8) {
			System.out.println(birthYear + "년생 용 띠");
		} else if (birthYear % 12 == 9) {
			System.out.println(birthYear + "년생 뱀 띠");
		} else if (birthYear % 12 == 10) {
			System.out.println(birthYear + "년생 말 띠");
		} else {
			System.out.println(birthYear + "년생 양 띠");
		}

		////////////////////////////// 2///////////////////////

		int fare = 0;

		if (args[1].equals("버스") || args[1].equals("지하철") || args[1].equals("택시")) {

			if (args[1].equals("버스")) {
				fare = BUS;
			} else if (args[1].equals("지하철")) {
				fare = TRAIN;
			} else {
				fare = TAXI;
			}

			System.out.println("입력교통수단 " + args[1] + "이고, 편도요금 " + fare + "원 입니다.");
			System.out.println("왕복요금 " + (fare * 2) + "원 이고, 한달 20일 출퇴근을 하면 " + (fare * 40) + "원 입니다.");
			
		} else {
			System.out.println("입력하신 교통수단은 대중교통이 아닙니다.");
		}
	}
}
