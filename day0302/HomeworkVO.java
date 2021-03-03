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
		return ", 이름 : " + name + ", 나이 : " + age + ", 태어난해 : " + (2021-age+1);
	}
}
