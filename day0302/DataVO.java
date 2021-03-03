package day0302;

public class DataVO implements Cloneable{
	private String name;
	private int age;
	
	public DataVO() {
		
	}
	public DataVO(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public DataVO cloneDataVO() {
		DataVO temp = null;
		try {
		temp = (DataVO)this.clone();
		}catch(CloneNotSupportedException e) {
			System.err.println("객체 복사 불가.");
			e.printStackTrace();
		}
		return temp;
	}
	@Override
	public String toString() {
		return super.toString() + "DataVO [name=" + name + ", age=" + age + "]";
	}
	
}
