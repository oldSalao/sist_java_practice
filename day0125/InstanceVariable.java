package day0125;

/**
 * ��üȭ �� ����� �� �ִ� instance variable�� ���. <br>
 * ��üȭ : Ŭ������ ��ü�� = new Ŭ������(); <br>
 * ��� : ��ü��.������ <br>
 * @author user
 */
public class InstanceVariable {
	int i;//Ŭ������ ���� �Ǿ��ٰ� �޸𸮿� �ε��Ǵ� ���� �ƴϴ�.
	int j;//instance ������ �ڵ��ʱ�ȭ �ȴ�. (������ = 0, �Ǽ����� 0.0 �������� \u0000 �������� null)
	public static void main(String[] args) {
		//�ν��Ͻ� ������ static �������� ���� ���Ұ�.(static ������ Ŭ������ �����ϸ� ���� ���� �ε��Ǳ� ������
		//�޸𸮿� �ε� ���� ���� ������ �� �� ���� �ν��Ͻ� ������ ����� �� ����.)
		
		//��üȭ : instance ������ ����ϱ����� ù��°�� �ؾ� �� �۾��̴�.
		InstanceVariable me = new InstanceVariable(); //instance �������� heap �޸𸮿� load �ȴ�.
		
		//��� : ��ü��.������
		me.i = 5;
		me.j = 10;
		
		System.out.println(me.i+me.j);
	}

}
