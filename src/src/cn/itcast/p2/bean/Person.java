package cn.itcast.p2.bean;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int compareTo(Person p) {
//		Person p = (Person)obj;
		int temp = this.age -p.age;
		return temp==0?this.name.compareTo(p.name):temp;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	public boolean equals(Object obj) {
//		// TODO 自动生成的方法存根
//		if(!(obj instanceof Person))
//			throw new 
//		return super.equals(obj);
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Person:"+getName()+"::"+getAge();
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}

}
