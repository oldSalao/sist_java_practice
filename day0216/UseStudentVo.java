package day0216;

/**
 * ��������� ������������ ���� Ŭ������ ���.
 * 
 * @author user
 */
public class UseStudentVo {

	public static void main(String[] args) {
		// ��ȣ : 1, �̸� : ���ϴ�, ���� : 20, Ű : 185.8 => �Ű����� �ִ� ������.
		StudentVo sv = new StudentVo(1,"���ϴ�",20,185.8);

		// ��ȣ : 2, �̸� : �ڱ��(��� �����͸� ���� ���ϴ� ��Ȳ) => �⺻������.
		StudentVo sv2 = new StudentVo();
		sv2.setReginum(2);
		sv2.setName("�ڱ��");
		
		System.out.println(sv.toString());
		System.out.println(sv2.toString());
		
		//�����л��� ������ �����ϰ� ó���Ϸ��� ��������� ������������ �迭�� �����ϸ� �ȴ�.
		
		//1,���ϴ�,20,185.8
		//2,�ڱ��,25,170.3
		//3,���μ�,26,178
		
		StudentVo[] svArr = new StudentVo[3];
		
		svArr[0] = sv;
		svArr[1] = sv2;
		svArr[1].setAge(25);
		svArr[1].setHeight(170.3);
		//�Ʒ��� ���� �ص� ���� x.
//		sv2.setAge(25);
//		sv2.setHeight(170.3);
		svArr[2] = new StudentVo(3,"���μ�",26,178);
		
		for(StudentVo element : svArr) {
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, Ű : %.1f \n",element.getReginum(),element.getName(),element.getAge(),element.getHeight());
		}
	}

}
