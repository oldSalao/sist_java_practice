package day0222;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * �л������� �����ϴ� Ŭ������ ����Ͽ�, �л������� ó���ϴ� ���� ������ Ŭ����.<br>
 * 
 * @author user
 */
public class ProcessStudent {

	/**
	 * �л��� ������ ����Ʈ�� ��Ƽ� ��ȯ.
	 * 
	 * @return
	 */
	public List<StudentVO> setStudentInfo() {

		List<StudentVO> list = new ArrayList<StudentVO>();

		// ����Ʈ�� �����͸� �߰�.
		list.add(new StudentVO("���μ�,25,����� ������ ���ﵿ,��,97"));
		list.add(new StudentVO("������,27,����� ������ ������,��,81"));
		list.add(new StudentVO("�ǿ���,26,����� ���۱� �󵵵�,��,90"));
		list.add(new StudentVO("�����,30,��⵵ ������ ���뱸,��,82"));
		list.add(new StudentVO("������,25,��õ������ ���� ����,��,88"));

		return list;
	}

	/**
	 * �л��� ������ ����Ͽ� ����ϴ� ��. (�ܼ���ȣ,�¾�ظ� ���.)
	 * 
	 * @param list
	 */
	public void printStudentInfo(List<StudentVO> list) {
		System.out.println("��ȣ\t�̸�\t����\t�¾��\t\t�ּ�\t\t�ڹ�����");
		System.out.println("----------------------------------------------------------------------");

		Calendar cal = Calendar.getInstance();// �߻�Ŭ�����̹Ƿ� new �� ��üȭ���� �ʴ´�.
		int nowYear = cal.get(Calendar.YEAR);

		StudentVO sVO = null;// ����Ʈ�� Element ���� �����ϱ� ���� ��ü.

		if (list.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		for (int i = 0; i < list.size(); i++) {
			sVO = list.get(i);// index�� �ش��ϴ� �л����� �ϳ� ���.
			System.out.printf("%d\t%s\t%d\t%d\t%13s\t%d \n", i + 1, sVO.getName(), sVO.getAge(),
					nowYear - sVO.getAge() + 1, sVO.getAddress(), sVO.getScore());
		}
	}

	/**
	 * �л��� ������ ����Ͽ� ������ ���� ���� ����� �ϴ� ��.
	 * 
	 * @param list   �л��� ������ ���� ����Ʈ.
	 * @param gender ����� ����.
	 */
	public void printStudentGenderType(List<StudentVO> list, String gender) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("�̸�\t����\t\t�ּ�\t\t����\t����");
		System.out.println("-------------------------------------------------------------");
		//�Էµ� ������ �� �Ǵ� ���� �ƴ϶�� �⺻������ ���� �־��ش�.
		if(!(gender.equals("��")||gender.equals("��"))) {
			gender="��";
		}
		
		for(StudentVO sVO : list) {
			if(sVO.getGender().equals(gender)) {
				System.out.printf("%s\t%d\t%13s\t%s\t%d\n", sVO.getName(), sVO.getAge(),
						sVO.getAddress(), sVO.getGender(),sVO.getScore());
			}
		}
		if(list.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
	}

	public static void main(String[] args) {
		ProcessStudent ps = new ProcessStudent();
		List <StudentVO> list = ps.setStudentInfo();
		ps.printStudentInfo(list);
		ps.printStudentGenderType(list, "��");
	}

}
