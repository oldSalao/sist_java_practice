package day0119;
/**
����Ʈ ������.
<<, >>, >>>
*/
class Operator3{
	public static void main(String[] args){
		int i = 6;

		System.out.println(i + " << 3 = " + (i << 3));
		
		i = 39;
		
		System.out.println(i + " >> 2 = " + (i >> 2));
		
		i = 45;
		
		System.out.println(i + " >>> 3 = " + (i >>> 3));

		System.out.println("1�� << 31 = " + (1<<31)); //��ȣ��Ʈ�� 1�� �ٲ�� ������ ������ ��µȴ�.

		i = -12;

		System.out.println(i + " �� >>100 = " + (i >> 100)); //��ĭ�� 1�� ä������ ������ �ᱹ -1 ���
        
		i=-1;
		System.out.println(i + " �� >>>1 = " + (i >>>1 ));
		
	}//main
}//class