package cn.itcast.p.bean;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
