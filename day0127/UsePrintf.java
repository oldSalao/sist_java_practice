package day0127;

/**
 * Variable Arguments를 사용한 출력 method.
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
		System.out.format("%d\n",10);
		System.out.printf("%d\n",4);
		System.out.printf("정수출력 : %d\n",30);
		System.out.printf("문자출력 : %c\n",'A');
		System.out.printf("실수출력 : %f\n",0.123);
		System.out.printf("문자열출력 : %s\n","오늘은 수요일");
		
		//출력 자릿수 설정 - 오른쪽정렬
		System.out.printf("[%6d][%3d][%4d]\n",2021,1,27);
		System.out.printf("[%6c][%3c][%4c]\n",'A','B','C');
		//.2f :  전체 자릿수는 설정하지 않고 소수점 이하 두자리만 출력
		System.out.printf("[%10.2f]\n",2021.0127);
		System.out.printf("[%6s][%5s]\n","자바","HTML");
		
		//출력 자릿수 음수로 설정 - 왼쪽정렬
		System.out.printf("[%-6d][%-3d][%-4d]\n",2021,1,27);
		System.out.printf("[%-6c][%-3c][%-4c]\n",'A','B','C');
		//.2f :  전체 자릿수는 설정하지 않고 소수점 이하 두자리만 출력
		System.out.printf("[%-10.2f]\n",2021.0127);
		System.out.printf("[%-6s][%-5s]\n","자바","HTML");
		
		int year = 2021, month=1,day=27;
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",year,month,day);
		
		System.out.printf("%d %c %4d %s\n",12,'a',46,"오늘추워요");
	}
}
