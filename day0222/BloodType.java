package day0222;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BloodType {

	private Map<String,String> map = new HashMap<String, String>(); 
	
	public BloodType() {
		map.put("A","A형 : 내향적입니다. 그들이 비록 외향적으로 보일지라도\n실제 내면의 모습은 조심스럽고 세심한 면이 있습니다.\n대체로 생각은 비관적입니다.");
		map.put("AB","AB형 : 합리적입니다. 그래서 사회의 의리나 인정 그리고\n가타 제도 등에 대해 관심이 적고\n합리적인 반듯함을 선호하게 됩니다.");
		map.put("O", "O형 : 따스한 인간성 자신이 목표로 하고있는 일에 대하여\n한결같은 노력과 전문가적인 강점으로 목표를\n달성하는 추진력이 있다.");
		map.put("B", "B형 : 대체적으로 자기중심적입니다.\n규율이나 규칙, 속박을 극히 싫어함.\n생각이 유연하고 기발한 발상에 뛰어납니다.");
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
