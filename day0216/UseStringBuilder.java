package day0216;

/**
 * �� ���ڿ��� �ٷ� �� ����ϴ� Ŭ����.<br>
 * StringBuilder,StringBuffer�� ���<br>
 * @author user
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("�ȳ�.");
		sb.append(2021);
		sb.append("��");
		sb.append('A');
		sb.append(2.16);
		sb.append(true);
		
		sb.insert(10, "��");
		sb.insert(14, "��");
		
		sb.delete(3, 8);
		
		System.out.println(sb);
	}
	
	public void useStringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append("�ȳ�.");
		sb.append(2021);
		sb.append("��");
		sb.append('A');
		sb.append(2.16);
		sb.append(true);
		
		sb.insert(10, "��");
		sb.insert(14, "��");
		
		sb.delete(3, 8);
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("-----------------------------------------");
		usb.useStringBuilder();
		System.out.println("-----------------------------------------");
		
		String file1 = "c:/dev/test.txt.doc";
		String file2 = "c:/work/test/day2016/Test.java";
		
		StringBuilder sb = new StringBuilder(file1);
		
		sb.insert(sb.lastIndexOf("."), ".temp");
		
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder(file2);
		
		sb2.delete(8, 13);
		
		System.out.println(sb2);
		
	}

}
