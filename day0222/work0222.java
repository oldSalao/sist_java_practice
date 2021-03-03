package day0222;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work0222 {

	// Map ���� : HashMap�� 16���� �� ����.
	private Map<String, String> bloodMap = new HashMap<String, String>();

	public String bloodType(String blood) {
		String result = "�Է� �������� ����� ���� �ƴմϴ�.";

//		blood = blood.toUpperCase();
		// �� �Ҵ�.
		bloodMap.put("A", "�ҽ��ϴ�");
		bloodMap.put("B", "���� ������");
		bloodMap.put("AB", "�����ڴ�");
		bloodMap.put("O", "�����δ��ϴ�");

		if (bloodMap.containsKey(blood)) {
			result = bloodMap.get(blood);
		}

		return result;
	}

	public void searchBlood() {
		String inputBlood = "a";
		inputBlood = inputBlood.toUpperCase();
		System.out.println(inputBlood + "���� " + bloodType(inputBlood));
	}

	public void validationMap() {
		// Map�� ��� Ű�� Set���� �ޱ�.
		if (!bloodMap.isEmpty()) { // �ν��Ͻ� ������ Map ������ ��üȭ�� HashMap�� �ּҸ� �Ҵ��Ͽ����Ƿ� isEmpty ���.
			// �Ҵ����� �ʾҴٸ� !=null �� ��� �� �� �־���.
			Set<String> keys = bloodMap.keySet();
			Iterator<String> iter = keys.iterator();
			String key = "";
			while (iter.hasNext()) {
				key = iter.next();
				System.out.println(key + " : " + bloodMap.get(key));
			}
		} else {
			System.out.println("���� ����ִ�. searchBlood method�� ���� ȣ���Ͻÿ�.");
		}
	}

	public static void main(String[] args) {
		work0222 w = new work0222();
		w.searchBlood();
		System.out.println("----------------------------------");
		w.validationMap();
	}
}
