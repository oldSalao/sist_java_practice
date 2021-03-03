package day0218;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * java.util.List�� ���.<br>
 * 1���� �迭ó�� ����. ����������(�����͸� �߰��ϸ� ���̰� �þ��, �����͸� �����ϸ� ���̰� �پ���.)<br>
 * ��� ���������� ������ �� ������, Generic�� ����ϸ� �Է� �������� ������ ������ �� �ִ�.<br>
 * �˻��� ����� ������, �ߺ������͸� ������ �� �ִ�.<br>
 * �߰��� �����ʹ� ���� �ڿ� �ٴ´�.<br>
 * ������ �����ͻ��̿� �����͸� �߰��� ������ LinkedList�� ����ϴ� ���� ����.
 * 
 * @author user
 */
public class UseList {

	/**
	 * Multi thread���� �������� ����.
	 */
	public void useArrayList() {
		// 1.����
		List<String> list = new ArrayList<String>(30);
		// 2.ũ�� : size() => �濡 ���� �ִ� �͸� ũ�⿡ ���Խ�Ų��.
		System.out.println(list.size());
		// 3.�� �Ҵ� : ���� �׻� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.

		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JDBC");
		list.add("HTML");
		list.add("����Ŭ"); // �ߺ��� ���� ���.
		list.add("CSS");
		list.add("JavaScript");

		System.out.println(list + " / " + list.size());
		// 4. �迭�� ����
		// Generic�� ������ ��������, ����Ʈ�� ũ���� �迭�� �����Ѵ�.

		String[] subjectArr = new String[list.size()];

		list.toArray(subjectArr);

		// 4.�� ���� : ���� ũ�Ⱑ �پ���.

		// �ε����� ����

		list.remove(3);

		System.out.println(list + " / " + list.size());

		// ���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����.

		list.remove("����Ŭ");

		System.out.println(list + " / " + list.size());

		// 5.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.

		String temp = "";

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			System.out.println(temp);
		}

		// ������ for

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("----------------------------����� �� ��� -------------------------------");
		for (String str : subjectArr) {
			System.out.printf("%s ", str);
		}
		System.out.println();

	}

	/**
	 * Multi thread���� �������� �Ұ���.
	 */
	public void useVector() {
		// 1.����
		List<String> list = new Vector<String>(30);
		// 2.ũ�� : size() => �濡 ���� �ִ� �͸� ũ�⿡ ���Խ�Ų��.
		System.out.println(list.size());
		// 3.�� �Ҵ� : ���� �׻� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.

		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JDBC");
		list.add("HTML");
		list.add("����Ŭ"); // �ߺ��� ���� ���.
		list.add("CSS");
		list.add("JavaScript");

		System.out.println(list + " / " + list.size());
		// 4. �迭�� ����
		// Generic�� ������ ��������, ����Ʈ�� ũ���� �迭�� �����Ѵ�.

		String[] subjectArr = new String[list.size()];

		list.toArray(subjectArr);

		// 4.�� ���� : ���� ũ�Ⱑ �پ���.

		// �ε����� ����

		list.remove(3);

		System.out.println(list + " / " + list.size());

		// ���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����.

		list.remove("����Ŭ");

		System.out.println(list + " / " + list.size());

		// 5.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.

		String temp = "";

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			System.out.println(temp);
		}

		// ������ for

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("----------------------------����� �� ��� -------------------------------");
		for (String str : subjectArr) {
			System.out.printf("%s ", str);
		}
		System.out.println();

	}

	public void useLinkedList() {
		// 1.���� LinkedList�� capacity ���� �Ұ�.
		List<String> list = new LinkedList<String>();
		// 2.ũ�� : size() => �濡 ���� �ִ� �͸� ũ�⿡ ���Խ�Ų��.
		System.out.println(list.size());
		// 3.�� �Ҵ� : ���� �׻� �ڷ� �߰��� ���� �ְ� �߰��� ���Ե� ���� �ִ�. �ߺ����� ������ �� �ִ�.

		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JDBC");
		list.add(1,"HTML");
		list.add("����Ŭ"); // �ߺ��� ���� ���.
		list.add(4,"CSS");
		list.add("JavaScript");

		System.out.println(list + " / " + list.size());
		// 4. �迭�� ����
		// Generic�� ������ ��������, ����Ʈ�� ũ���� �迭�� �����Ѵ�.

		String[] subjectArr = new String[list.size()];

		list.toArray(subjectArr);

		// 4.�� ���� : ���� ũ�Ⱑ �پ���.

		// �ε����� ����

		list.remove(3);

		System.out.println(list + " / " + list.size());

		// ���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����.

		list.remove("����Ŭ");

		System.out.println(list + " / " + list.size());

		// 5.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ�ó���� �� �� �ִ�.

		String temp = "";

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			System.out.println(temp);
		}

		// ������ for

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("----------------------------����� �� ��� -------------------------------");
		for (String str : subjectArr) {
			System.out.printf("%s ", str);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		UseList ul = new UseList();

		System.out.println("------------------ArrayList-----------------------");

		ul.useArrayList();

		System.out.println("------------------Vector-----------------------");

		ul.useVector();

		System.out.println("------------------LinkedList-----------------------");

		ul.useLinkedList();
	}

}
