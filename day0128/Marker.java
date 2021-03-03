package day0128;

/**
 * ��ī���� ������� �ۼ��� Ŭ����<br>
 * ������� Ư¡ : ��, ��ü, �Ѳ�<br>
 * �������� Ư¡ : ����.<br>
 * �� Ư¡�� �߻�ȭ�Ͽ� �ۼ��� Ŭ����<br>
 * ����)<br>
 * 1.��üȭ<br>
 * Marker ��ü�� = new Marker();<br>
 * 2.���<br>
 * ��ü��.white("ȭ��Ʈ���忡 �ۼ��� �޼���");<br>
 * 
 * @author user
 */
public class Marker {

	private String color;
	private int cap;
	private int body;
	
	/**
	 * ��ī�� Ŭ������ �⺻������.<br>
	 * �Ѳ� 1��, ��ü 1��, �������� ��ī���� ������ �� ���.
	 */
	public Marker() {
		this("������",1,1);
//		color = "������";
//		cap = 1;
//		body = 1;
	}

	/**
	 * �Է��ϴ� ������ ��ī�� ��ü�� �����ϴ� Overload�� ������.
	 * @param color
	 * @param cap
	 * @param body
	 */
	public Marker(String color, int cap, int body) {
		if (color.equals("������") || color.equals("������") || color.equals("�Ķ���")) {
			this.color = color;
		} else {
			this.color = "������";
		}
		if(cap>10) {
			this.cap=1;
		}
		else {
			this.cap = cap;	
		}
		if(body>10) {
			this.body=1;
		}
		else {
			this.body = body;	
		}
		
		
	}
	/**
	 * ������ ��ī���� ����Ͽ� ĥ�ǿ� �Էµ� �޼����� ���� ��.
	 * 
	 * @param msg : ĥ�ǿ� �� �޼���
	 * @return : ĥ�ǿ� �޼����� �� ���
	 */
	public String write(String msg) {
		return ("ĥ�ǿ� " + this.getColor() + "�� ��ī������ \"" + msg + "\"�� ����.");
	}

	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��.<br>
	 * ���������� �� ��� : ������,������,�Ķ��� 3������ ���� ����.<br>
	 * �ٸ� ���� �ԷµǸ� ���������� ����.
	 * 
	 * @param color : ������ ��.
	 */
	public void setColor(String color) {
		if (color.equals("������") || color.equals("������") || color.equals("�Ķ���")) {
			this.color = color;
		} else {
			this.color = "������";
		}

	}

	/**
	 * ������ ��ī�� ��ü�� ���� ��� ��.
	 * 
	 * @return : ������ ��
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * ������ ��ī�� ��ü�� �Ѳ��� ������ �����ϴ� ��.
	 * 
	 * @param cap : �Ѳ��� ����
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}

	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ��� ������ ��� ��.
	 * 
	 * @return : ������ �Ѳ��� ����
	 */
	public int getCap() {
		return this.cap;
	}

	/**
	 * ������ ��ī�� ��ü�� ��ü ������ �����ϴ� ��.
	 * 
	 * @param body : ������ ��ü�� ����.
	 */
	public void setBody(int body) {
		this.body = body;
	}

	/**
	 * ������ ��ī�� ��ü�� ������ ��ü ������ ��� ��.
	 * 
	 * @return : ������ ��ü�� ����
	 */
	public int getBody() {
		return this.body;
	}

}
