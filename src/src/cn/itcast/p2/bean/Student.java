package cn.itcast.p2.bean;

public class Student extends Person {

	public Student() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "Student:"+getName()+":"+getAge();
	}

	
}
