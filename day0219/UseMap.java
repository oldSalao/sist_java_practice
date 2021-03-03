package day0219;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map : Ű�� ���� ������ �̷���� �����͸� ����� ��.<br>
 * Hashtable�� HashMap�� Map�� ������ Ŭ�����̴�.<br>
 * 
 * @author user
 */
public class UseMap {
	
	public void useHashtable() {
		//1.����
		Map<String,String> map = new Hashtable<String,String>();//11���� �� ����.
		//2.�� �Ҵ�) ���� ������� �Էµ��� �ʴ´�.
		//Ű�� �����ϸ�, ���� �ߺ��� �� �ִ�.
		//���� Ű�� �ԷµǸ� ������ Ű�� ���� ���������.
		
		map.put("�ڹ�","�Ϻ��� ��ü������.");
		map.put("����Ŭ","��뷮 ������ ���̽�.");
		map.put("JDBC","�ڹٿ��� DBMS�� �����ϱ� ���� ���.");
		map.put("HTML","������������ ������ ���.");
		map.put("���̽�","�Ϻ��� ��ü������.");// ���� �ߺ�����.
		map.put("HTML","Tim Berners LEE�� ���� ���.");// ���� Ű�� �ԷµǸ� ������ Ű�� ���� ����.
		
		System.out.println(map + " / " + map.size());
		
		//3.�� ��� : Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�. Ű�� �������� ������ null ��ȯ.
		String value = map.get("����Ŭ");
		System.out.println(value);
		
		//4.Ű�� �����ϴ���?
		boolean flag = map.containsKey("�ڹ�");
		System.out.println(flag);
		
		//5.�� ����
		
		//Ű�� �̿��� �� ����
		map.remove("�ڹ�");
		System.out.println(map + " / " + map.size());
		
		//��� ��Ʈ�� ����
		//map.clear();
		
		//��� Ű �ޱ�.
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		System.out.println();
	}

	public void useHashMap() {
		//1.����
				Map<String,String> map = new HashMap<String,String>();//11���� �� ����.
				//2.�� �Ҵ�) ���� ������� �Էµ��� �ʴ´�.
				//Ű�� �����ϸ�, ���� �ߺ��� �� �ִ�.
				//���� Ű�� �ԷµǸ� ������ Ű�� ���� ���������.
				
				map.put("�ڹ�","�Ϻ��� ��ü������.");
				map.put("����Ŭ","��뷮 ������ ���̽�.");
				map.put("JDBC","�ڹٿ��� DBMS�� �����ϱ� ���� ���.");
				map.put("HTML","������������ ������ ���.");
				map.put("���̽�","�Ϻ��� ��ü������.");// ���� �ߺ�����.
				map.put("HTML","Tim Berners LEE�� ���� ���.");// ���� Ű�� �ԷµǸ� ������ Ű�� ���� ����.
				
				System.out.println(map + " / " + map.size());
				
				//3.�� ��� : Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�. Ű�� �������� ������ null ��ȯ.
				String value = map.get("����Ŭ");
				System.out.println(value);
				
				//4.Ű�� �����ϴ���?
				boolean flag = map.containsKey("�ڹ�");
				System.out.println(flag);
				
				//5.�� ����
				
				//Ű�� �̿��� �� ����
				map.remove("�ڹ�");
				System.out.println(map + " / " + map.size());
				
				//��� ��Ʈ�� ����
				//map.clear();
				
				//��� Ű �ޱ�.
				Set<String> keys = map.keySet();
				Iterator<String> iter = keys.iterator();
				
				while(iter.hasNext()) {
					System.out.print(iter.next() + " ");
				}
				
				System.out.println();
	}
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashtable();
		um.useHashMap();
	}

}
