package day0302;

public class HomeworkVO {
	private String name;
	private int age;
	
	public HomeworkVO() {
		
	}
	public HomeworkVO(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return ", �̸� : " + name + ", ���� : " + age + ", �¾�� : " + (2021-age+1);
	}
}
