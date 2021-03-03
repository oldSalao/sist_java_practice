package day0217;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class UseCalendar {

	public UseCalendar() {
		// Calendar c = new Calendar(); //�߻�Ŭ�����̹Ƿ� ��üȭ�� ���� �ʴ´�.

		Calendar cal = new GregorianCalendar();// �ڽ� Ŭ������ Ȱ���� is a ������ ��0üȭ.

		Calendar cal1 = Calendar.getInstance();// getInstance()�� Ȱ���� ��üȭ.

		System.out.println(cal);
		System.out.println(cal1); // �Ѵ� GregorianCalendar�� �̿��� ��ü�̴�.

		// MONTH�� 1�� �����־�� �Ѵ�.
		// ������ �Ͽ���(1)���� 1�� �����Ͽ� ���´�.
		int weekChk = cal1.get(Calendar.DAY_OF_WEEK);
		int am = cal1.get(Calendar.AM_PM);
		String[] amTitle = { "����", "����" };
		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };
//		String week = "";
//		
//		switch (weekChk) {
//		case 1:
//			week = "�Ͽ���";
//			break;
//		case 2:
//			week = "������";
//			break;
//		case 3:
//			week = "ȭ����";
//			break;
//		case 4:
//			week = "������";
//			break;
//		case 5:
//			week = "�����";
//			break;
//		case 6:
//			week = "�ݿ���";
//			break;
//		case 7:
//			week = "�����";
//			break;
//		}

		String output = cal1.get(Calendar.YEAR) + " " + (cal1.get(Calendar.MONTH) + 1) + " "
				+ cal1.get(Calendar.DAY_OF_MONTH) + " " + cal1.get(Calendar.DAY_OF_WEEK) + " " + week[weekChk - 1] + " "
				+ amTitle[am] + " " + cal1.get(Calendar.HOUR) + " " + cal1.get(Calendar.HOUR_OF_DAY) + " "
				+ cal1.get(Calendar.MINUTE) + " " + cal1.get(Calendar.SECOND);

		System.out.println(output);
		
		System.out.println("---------------------------��¥ ���� ����--------------------------------");
		System.out.println(cal);//���糯¥����
		//�� ����
		cal.set(Calendar.YEAR, 2015);
		//�� ���� (�����ϴ� ��-1)
		cal.set(Calendar.MONTH, 11);
		//�� ����
		cal.set(Calendar.DAY_OF_MONTH, 30);
		
		System.out.printf("%d-%d-%d %s",cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH),cal.get(Calendar.DAY_OF_WEEK));
		
		
		
	}

	public static void main(String[] args) {
		new UseCalendar();
	}

}
