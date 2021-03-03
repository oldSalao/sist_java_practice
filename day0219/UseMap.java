package day0219;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map : 키와 값의 쌍으로 이루어진 데이터를 사용할 때.<br>
 * Hashtable과 HashMap이 Map을 구현한 클래스이다.<br>
 * 
 * @author user
 */
public class UseMap {
	
	public void useHashtable() {
		//1.생성
		Map<String,String> map = new Hashtable<String,String>();//11개의 행 생성.
		//2.값 할당) 값은 순서대로 입력되지 않는다.
		//키는 유일하며, 값은 중복될 수 있다.
		//같은 키가 입력되면 기존의 키에 값이 덮어써진다.
		
		map.put("자바","완벽한 객체지향언어.");
		map.put("오라클","대용량 데이터 베이스.");
		map.put("JDBC","자바에서 DBMS를 연동하기 위한 기술.");
		map.put("HTML","웹페이지에서 구조를 담당.");
		map.put("파이썬","완벽한 객체지향언어.");// 값은 중복가능.
		map.put("HTML","Tim Berners LEE가 만든 언어.");// 같은 키가 입력되면 기존의 키에 덮어 쓴다.
		
		System.out.println(map + " / " + map.size());
		
		//3.값 얻기 : 키를 사용하여 키에 해당하는 값을 얻는다. 키가 존재하지 않으면 null 반환.
		String value = map.get("오라클");
		System.out.println(value);
		
		//4.키가 존재하는지?
		boolean flag = map.containsKey("자바");
		System.out.println(flag);
		
		//5.값 삭제
		
		//키를 이용한 값 삭제
		map.remove("자바");
		System.out.println(map + " / " + map.size());
		
		//모든 엔트리 삭제
		//map.clear();
		
		//모든 키 받기.
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		System.out.println();
	}

	public void useHashMap() {
		//1.생성
				Map<String,String> map = new HashMap<String,String>();//11개의 행 생성.
				//2.값 할당) 값은 순서대로 입력되지 않는다.
				//키는 유일하며, 값은 중복될 수 있다.
				//같은 키가 입력되면 기존의 키에 값이 덮어써진다.
				
				map.put("자바","완벽한 객체지향언어.");
				map.put("오라클","대용량 데이터 베이스.");
				map.put("JDBC","자바에서 DBMS를 연동하기 위한 기술.");
				map.put("HTML","웹페이지에서 구조를 담당.");
				map.put("파이썬","완벽한 객체지향언어.");// 값은 중복가능.
				map.put("HTML","Tim Berners LEE가 만든 언어.");// 같은 키가 입력되면 기존의 키에 덮어 쓴다.
				
				System.out.println(map + " / " + map.size());
				
				//3.값 얻기 : 키를 사용하여 키에 해당하는 값을 얻는다. 키가 존재하지 않으면 null 반환.
				String value = map.get("오라클");
				System.out.println(value);
				
				//4.키가 존재하는지?
				boolean flag = map.containsKey("자바");
				System.out.println(flag);
				
				//5.값 삭제
				
				//키를 이용한 값 삭제
				map.remove("자바");
				System.out.println(map + " / " + map.size());
				
				//모든 엔트리 삭제
				//map.clear();
				
				//모든 키 받기.
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
