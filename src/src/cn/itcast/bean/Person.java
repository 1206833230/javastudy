package cn.itcast.bean;

public class Person {

	private int age;
	private String name;
	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("Person para run..."+this.name+":"+this.age);
	}
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
		System.out.println("person run");
	}

	public void show() {
		System.out.println(name+"...show run..."+age);
		
	}
	private void method() {
		System.out.println(" method run ");
	}
	
	public void paramMethod(String str,int num) {
		System.out.println("paraMethod run...."+str+":"+num);
	}
	
	public static void staticMethod() {
		System.out.println("static run ....");
	}
}
