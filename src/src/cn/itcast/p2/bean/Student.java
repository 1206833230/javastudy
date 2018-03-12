package cn.itcast.p2.bean;

public class Student extends Person {

	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Student:"+getName()+":"+getAge();
	}

	
}
