package day0121;

/**
 *	if-else
 *	�� �� �ϳ��� �ڵ带 �����ؾ��� �� ���.
 *	����)
 *	if(���ǽ�){
 *	���ǿ� ���� �� ������ �����
 *	}
 *	else{
 *	���ǿ� ���� ���� �� ������ �����.
 * @author user
 */
public class TestIfElse {
	public static void main(String[] args) {
		// ���� �Է¹޾� ���� ����� �� ���� Ȧ����� "Ȧ��"�� ����ϰ� �׷����ʴٸ� "¦��"�� ����϶�.
		int num = Integer.parseInt(args[0]);

		System.out.println(num);

		if (num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		//���� "���"���� "���������� ���"
		
		if (num>=0) {
			System.out.println("���");
		}
		else {
			System.out.println("����");
		}
		
		//args[1]�� ���� �޾Ƽ� int���� score������ �����ϰ� ������ 0~100���̶�� "��ȿ����"�� ����ϰ�
		//�׷��� �ʴٸ� "��ȿ����"�� ����ϼ���.
		
		int score = Integer.parseInt(args[1]);//��谪 �׽�Ʈ�� �ؾ���. -1,0,�߰���,100,101
		
		if((score>-1)&&(score<101)) { 
			System.out.println("��ȿ����");
		}
		else {
			System.out.println("��ȿ����");
		}
		
		
		//
	}//main
}//class
