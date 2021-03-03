package day0219;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �˻��� ����� ������, �ߺ������͸� �������� �ʴ� Set ���.
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1. ����.
		Set<String> set = new HashSet<String>();
		
		//2.���Ҵ� : ���� ������� �Էµ��� �ʴ´�.
		
		set.add("1.�ڹ�");
		set.add("2.����Ŭ");
		set.add("3.JDBC");
		set.add("4.HTML");
		set.add("5.CSS");
		set.add("6.JavaScript");
		set.add("7.Servlet");
		set.add("2.����Ŭ");
		
		System.out.println(set + " / " + set.size());
		
		//�迭�� ����.
		//set�� ũ��� �迭�� ����.
		String[] setArr= new String[set.size()];
		
		set.toArray(setArr);
		
		for(String str : setArr) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		//3.�� ����
		set.remove("6.JavaScript");
		
		System.out.println(set + " / " + set.size());
		
		//���� �� ����.
		//set.clear();
		
		//4.�˻�. => Iterator�� ���
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		//set�� �Ϲ� for�����δ� ����� �Ұ���. (get method�� ��� ��� �Ұ��� �Ѱ���.)
		//������ �������� ��°���.
		for(String temp : set) {
			System.out.print(temp + " ");
		}
		
		
	}

	public static void main(String[] args) {
		new UseSet();
	}

}
