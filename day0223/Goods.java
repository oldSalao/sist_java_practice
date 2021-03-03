package day0223;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Goods {
	private String name, price, cnt;
	public static int NAME = 0, PRICE = 1, COUNT = 2;

	public String getCnt() {
		return cnt;
	}

	public Goods() {

	}

	public Goods(String info) {
		StringTokenizer st = new StringTokenizer(info, " ");
		int len = st.countTokens();
		String[] infoArr = new String[3];
		for (int i = 0; i < len; i++) {
			infoArr[i] = st.nextToken();
		}
		this.name = infoArr[NAME];
		this.price = infoArr[PRICE];
		this.cnt = infoArr[COUNT];
	}

	public String printList() {
		String result = name + "(가격:" + price + "원)이 " + cnt + " 개 입고 되었습니다.";
		return result;
	}

	public static void main(String[] args) {
		List<Goods> goodsList = new ArrayList<Goods>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int cntAll = 0;

		for (int i = 0; i < 3; i++) {
			goodsList.add(new Goods(sc.nextLine()));
		}

		for (Goods temp : goodsList) {
			System.out.println(temp.printList());
			cntAll += Integer.parseInt(temp.getCnt());
		}

		System.out.println("모든 상품의 갯수는 " + cntAll + "개 입니다.");

	}

}
