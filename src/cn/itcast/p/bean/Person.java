package cn.itcast.p.bean;

public class Person /*extends Object*/ implements Comparable {
	private String name;
	private int age;
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public int hashCode() {
		// TODO 自动生成的方法存根
		System.out.println(this+"...........hashCode");
//		return name.hashCode()+age;
		return 100;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		System.out.println(this+"......."+obj);
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
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
	public  String toString() {
		return name + ":" + age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		Person p = (Person)o;
		//按照年龄进行排序，之后按姓名排
//		int temp = this.age-p.age;
//		return temp==0?this.name.compareTo(p.name):temp;
		
		int temp = this.name.compareTo(p.name);
		return temp==0?this.age-p.age:temp;
//		if(this.age>p.age)
//			return 1;
//		if(this.age<p.age)
//			return -1;
//		if(this.age==p.age) {
//			return this.name.compareTo(p.name);
//		}
		
	}

}
