package day0122;

/**
 * �ݺ��� : Ư�� �ڵ带 ������ ���� ��Ű�� ����.<br>
 * for : ���۰� ���� �˶� ����ϴ� �ݺ���. <br>
 * ����)<br>
 * 	for(�ʱⰪ ; ���ǽ� ; ��,���ҽ�){<br>
 * 		�ݺ����๮���..<br>
 * 	}
 * @author user
 */
public class TesrFor {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
		System.out.println("�ȳ��ϼ���?");
		}
		
		for(int i = 1; i<101; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 100; i > 0; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 1; i < 101; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		for(int i = 1; i<10; i++) {
			System.out.println("2 * " + i + " = " + (i * 2));
		}
		
		for(int i = 65; i<91; i++) {
			System.out.println((char)i);
		}
		
		System.out.println();
		
		for(int i = 1; i < 65536; i++) {
			if((i>47&&i<58)||(i>64&&i<91)||(i>96&&i<123)) {
				System.out.print((char)i+" ");
			}
		}
		
		System.out.println("\n");
		
		int sum = 0;
		
		for(int i = 1; i<101; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
