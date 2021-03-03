package day0222;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BloodType {

	private Map<String,String> map = new HashMap<String, String>(); 
	
	public BloodType() {
		map.put("A","A�� : �������Դϴ�. �׵��� ��� ���������� ��������\n���� ������ ����� ���ɽ����� ������ ���� �ֽ��ϴ�.\n��ü�� ������ ������Դϴ�.");
		map.put("AB","AB�� : �ո����Դϴ�. �׷��� ��ȸ�� �Ǹ��� ���� �׸���\n��Ÿ ���� � ���� ������ ����\n�ո����� �ݵ����� ��ȣ�ϰ� �˴ϴ�.");
		map.put("O", "O�� : ������ �ΰ��� �ڽ��� ��ǥ�� �ϰ��ִ� �Ͽ� ���Ͽ�\n�Ѱᰰ�� ��°� ���������� �������� ��ǥ��\n�޼��ϴ� �������� �ִ�.");
		map.put("B", "B�� : ��ü������ �ڱ��߽����Դϴ�.\n�����̳� ��Ģ, �ӹ��� ���� �Ⱦ���.\n������ �����ϰ� ����� �߻� �پ�ϴ�.");
	}
	
	public String typeInfo(String type) {
		String answer = "";
		type = type.toUpperCase();
		answer = map.get(type);
		return answer;
	}
	
	public void printMap() {
		Set<String> set = new HashSet<String>();
		set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
			System.out.println("-------------------------------------------");
		}
		
	}
	
	public static void main(String[] args) {
		BloodType bt = new BloodType();
		System.out.println(bt.typeInfo("b"));
		System.out.println("----------------------------------");
		bt.printMap();
	}

}
