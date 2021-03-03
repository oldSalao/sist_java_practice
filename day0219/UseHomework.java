package day0219;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UseHomework {

	public static List<HomeworkStudent> createList(HomeworkStudent[] hs) {
		List<HomeworkStudent> list = new ArrayList<HomeworkStudent>();

		for (HomeworkStudent temp : hs) {
			list.add(temp);
		}

		return list;
	}

	public static void printList(List<HomeworkStudent> list) {
		System.out.println("번호\t이름\t나이\t태어난해\t\t주소\t\t자바점수");
		Calendar cal = Calendar.getInstance();
		int[] bornYear = new int[5];

		for (int i = 0; i < list.size(); i++) {
			cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) - list.get(i).getAge() + 1);
			bornYear[i] = cal.get(Calendar.YEAR);
			
			System.out.printf("%d\t%s\t%d\t%d\t%13s\t%d\n", (i + 1), list.get(i).getName(), list.get(i).getAge(),
					bornYear[i], list.get(i).getAddress(), list.get(i).getScore());
			
			cal.set(Calendar.YEAR, 2021);
		}
	}

	public static void printWomenList(List<HomeworkStudent> list) {
		System.out.println("번호\t이름\t나이\t태어난해\t\t주소\t\t자바점수");
		Calendar cal = Calendar.getInstance();
		int[] bornYear = new int[5];

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getGender().equals("여")) {
				cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) - list.get(i).getAge() + 1);
				bornYear[i] = cal.get(Calendar.YEAR);
				
				System.out.printf("%d\t%s\t%d\t%d\t%13s\t%d\n", (i + 1), list.get(i).getName(), list.get(i).getAge(),
						bornYear[i], list.get(i).getAddress(), list.get(i).getScore());
				
				cal.set(Calendar.YEAR, 2021);
			}
		}
	}

	public static void main(String[] args) {
		HomeworkStudent[] hs = new HomeworkStudent[5];

		String[] info = { "강인섭,25,서울시 강남구 역삼동,남,97", "곽범수,27,서울시 강남구 논현동,남,81", "권예원,26,서울시 동작구 상도동,여,90",
				"김덕영,30,경기도 수원시 영통구,남,82", "석지원,25,인천광역시 부평구 부평동,여,88" };

		for (int i = 0; i < hs.length; i++) {
			hs[i] = new HomeworkStudent(info[i]);
		}

		System.out.println("----------전체 학생 출력------------");
		printList(createList(hs));
		
		System.out.println("-----------여학생만 출력------------");
		printWomenList(createList(hs));

	}

}
