package cn.itcast.p.bean;

public class Student extends Person{

	public Student() {
		super();
	}

	public Student (String name, int age) {
		super(name, age);
	}
	public String toString() {
		return "Student:" + getName()+":"+getAge();
	}
}
