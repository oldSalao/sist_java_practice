package day0222;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work0222 {

	// Map 생성 : HashMap은 16개의 행 생성.
	private Map<String, String> bloodMap = new HashMap<String, String>();

	public String bloodType(String blood) {
		String result = "입력 혈액형은 사람의 것이 아닙니다.";

//		blood = blood.toUpperCase();
		// 값 할당.
		bloodMap.put("A", "소심하다");
		bloodMap.put("B", "성질 더럽다");
		bloodMap.put("AB", "싸이코다");
		bloodMap.put("O", "우유부단하다");

		if (bloodMap.containsKey(blood)) {
			result = bloodMap.get(blood);
		}

		return result;
	}

	public void searchBlood() {
		String inputBlood = "a";
		inputBlood = inputBlood.toUpperCase();
		System.out.println(inputBlood + "형은 " + bloodType(inputBlood));
	}

	public void validationMap() {
		// Map의 모든 키를 Set으로 받기.
		if (!bloodMap.isEmpty()) { // 인스턴스 변수로 Map 변수에 객체화된 HashMap의 주소를 할당하였으므로 isEmpty 사용.
			// 할당하지 않았다면 !=null 을 사용 할 수 있었음.
			Set<String> keys = bloodMap.keySet();
			Iterator<String> iter = keys.iterator();
			String key = "";
			while (iter.hasNext()) {
				key = iter.next();
				System.out.println(key + " : " + bloodMap.get(key));
			}
		} else {
			System.out.println("맵이 비어있다. searchBlood method를 먼저 호출하시오.");
		}
	}

	public static void main(String[] args) {
		work0222 w = new work0222();
		w.searchBlood();
		System.out.println("----------------------------------");
		w.validationMap();
	}
}
