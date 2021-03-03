package day0127;

/**
 * Variable Arguments�� ����� ��� method.
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
		System.out.format("%d\n",10);
		System.out.printf("%d\n",4);
		System.out.printf("������� : %d\n",30);
		System.out.printf("������� : %c\n",'A');
		System.out.printf("�Ǽ���� : %f\n",0.123);
		System.out.printf("���ڿ���� : %s\n","������ ������");
		
		//��� �ڸ��� ���� - ����������
		System.out.printf("[%6d][%3d][%4d]\n",2021,1,27);
		System.out.printf("[%6c][%3c][%4c]\n",'A','B','C');
		//.2f :  ��ü �ڸ����� �������� �ʰ� �Ҽ��� ���� ���ڸ��� ���
		System.out.printf("[%10.2f]\n",2021.0127);
		System.out.printf("[%6s][%5s]\n","�ڹ�","HTML");
		
		//��� �ڸ��� ������ ���� - ��������
		System.out.printf("[%-6d][%-3d][%-4d]\n",2021,1,27);
		System.out.printf("[%-6c][%-3c][%-4c]\n",'A','B','C');
		//.2f :  ��ü �ڸ����� �������� �ʰ� �Ҽ��� ���� ���ڸ��� ���
		System.out.printf("[%-10.2f]\n",2021.0127);
		System.out.printf("[%-6s][%-5s]\n","�ڹ�","HTML");
		
		int year = 2021, month=1,day=27;
		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.\n",year,month,day);
		
		System.out.printf("%d %c %4d %s\n",12,'a',46,"�����߿���");
	}
}
