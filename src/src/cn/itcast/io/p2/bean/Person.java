package cn.itcast.io.p2.bean;

import java.io.Serializable;
/*
 * Serializable：用于给被序列化的类加ID号
 * 用于判断类和对象是否是同一个版本。
 */
public class Person implements Serializable/*标记几口*/{
    
	/**
	 * transient:非静态字段不想被序列化
	 */
	private static final long serialVersionUID = 95271;
	private transient String name;
	private  int age;
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
