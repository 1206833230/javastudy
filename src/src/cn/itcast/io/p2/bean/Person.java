package cn.itcast.io.p2.bean;

import java.io.Serializable;
/*
 * Serializable�����ڸ������л������ID��
 * �����ж���Ͷ����Ƿ���ͬһ���汾��
 */
public class Person implements Serializable/*��Ǽ���*/{
    
	/**
	 * transient:�Ǿ�̬�ֶβ��뱻���л�
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
