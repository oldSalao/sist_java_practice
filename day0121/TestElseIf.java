package day0121;

/**
 *	else if, ���� if
 *	������ ���� ������ ���� �� ���
 *	����)
 *	if(���ǽ�){
 *		���ǿ� ���� �� ������ �����.
 *	}	
 *	else if(���ǽ�){
 * 		���ǿ� ���� �� ������ �����.
 * 	}
 * 	else{
 * 	��� ���ǿ� ���� ���� �� ������ �����.
 * 	}
 * @author user
 */
public class TestElseIf {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		
		System.out.println("�Է����� [" + score + "]�� �Դϴ�.");
		
		if(score < 0) {
			System.out.println("0������ �۾Ƽ� ����");
		}
		else if(score > 100){
			System.out.println("100������ Ŀ�� ����");
		}
		else {
			System.out.println("�Է¼���.");
		}
		
		//������ �Է¹޾� ��������. 
		//0~39������ ����
		//40~59������ �ٸ����� Ȯ��
		//60~100������ �հ�
		if(score>-1&&score<40) {
			System.out.println("����");
		}
		else if(score<60) {
			System.out.println("�ٸ����� Ȯ��");
		}
		else if(score<101) {
			System.out.println("�հ�");
		}
		
		//args[1]���� �̸��� �����µ� �ԷµǴ� �̸��� ����ȣ,���й�,������,�ڱ��,�ǿ���,������ �� �ϳ��� �Էµ� �� �ִ�.
		//�Է� �̸��� ����ȣ�� ���й� �̶�� "A�������л�", �������� �ڱ���̶�� "B�������л�"
		//�ǿ���, �����ƶ�� "C�������л�" �׷��� �ʴٸ� "D�������л�"�� ���.
		if(args[1].equals("����ȣ")||args[1].equals("���й�")) {
			System.out.println("A�������л�.");
		}
		else if(args[1].equals("������")||args[1].equals("�ڱ��")) {
			System.out.println("B�������л�.");
		}
		else if(args[1].equals("�ǿ���")||args[1].equals("������")) {
			System.out.println("C�������л�.");
		}
		else {
			System.out.println("D�������л�.");
		}
		
		
	}

}
