package cn.itcast.p5.generic.advance.demo;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;


import cn.itcast.p2.bean.Person;
import cn.itcast.p2.bean.Student;
import cn.itcast.p2.bean.Worker;

public class GenericAdvanceDemo3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList<Worker> al = new ArrayList<Worker>();
		
		al.add(new Worker("abc",30));
		al.add(new Worker("abc4",34));
		
        ArrayList<Student> al2 = new ArrayList<Student>();
		
		al2.add(new Student("abc1",19));
		al2.add(new Student("abc2",18));
		
//		printCollection(al);
//		printCollection(al2);
        ArrayList<Person> al3 = new ArrayList<Person>();
		
		al3.add(new Person("abc1",19));
		al3.add(new Person("abc2",18));
//		printCollection(al3);
		
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("anbcjdd");
//		al3.add(al4);//�������Ͳ�ƥ��
		
		al3.addAll(al2);
//		al3.addAll(al);
		
		System.out.println(al3.size());

	}
/*
 * һ���ڴ洢Ԫ�ص�ʱ���������ޣ���Ϊ����ȡ�����ǰ�����������������ģ�����������Ͱ�ȫ������
 */

class MyCollection<E>{
	public void add(E e) {
		
	}
	public void addAll(MyCollection<? extends E> e) {
		
	}
}



	

}
