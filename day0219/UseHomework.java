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
		System.out.println("��ȣ\t�̸�\t����\t�¾��\t\t�ּ�\t\t�ڹ�����");
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
		System.out.println("��ȣ\t�̸�\t����\t�¾��\t\t�ּ�\t\t�ڹ�����");
		Calendar cal = Calendar.getInstance();
		int[] bornYear = new int[5];

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getGender().equals("��")) {
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

		String[] info = { "���μ�,25,����� ������ ���ﵿ,��,97", "������,27,����� ������ ������,��,81", "�ǿ���,26,����� ���۱� �󵵵�,��,90",
				"�����,30,��⵵ ������ ���뱸,��,82", "������,25,��õ������ ���� ����,��,88" };

		for (int i = 0; i < hs.length; i++) {
			hs[i] = new HomeworkStudent(info[i]);
		}

		System.out.println("----------��ü �л� ���------------");
		printList(createList(hs));
		
		System.out.println("-----------���л��� ���------------");
		printWomenList(createList(hs));

	}

}
