package cn.itcast.p5.generic.advance.demo;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;


import cn.itcast.p2.bean.Person;
import cn.itcast.p2.bean.Student;
import cn.itcast.p2.bean.Worker;

public class GenericAdvanceDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList<Worker> al = new ArrayList<Worker>();
		
		al.add(new Worker("abc",30));
		al.add(new Worker("abc4",34));
		
        ArrayList<Student> al2 = new ArrayList<Student>();
		
		al2.add(new Student("abc1",19));
		al2.add(new Student("abc2",18));
		
//		printCollection(al);
		printCollection(al2);
       ArrayList<Person> al3 = new ArrayList<Person>();
		
		al3.add(new Person("abc1",19));
		al3.add(new Person("abc2",18));
		printCollection(al3);

	}



	/**
	 * ��������ӡ�����е�Ԫ��
	 * 
	 * ���Զ����ͽ����޶���
	 *? extends E : ����E���ͻ���E������������ޣ�
	 *�� supere E ������E���ͻ���E�ĸ����͡����ޣ�
	 * @param al
	 */
//	public static void printCollection(Collection<? extends Person> al) {
//		Iterator<? extends Person> it = al.iterator();
//		
//		while(it.hasNext()) {
////			String str = it.next();
////			System.out.println(str);
////			System.out.println(it.next());
//			
//			Person p = it.next();
//			System.out.println(p.getName()+"::"+p.getAge());
//		}
//	}
	public static void printCollection(Collection<? super Student> al) {
		Iterator<? super Student> it = al.iterator();
		
		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//			System.out.println(it.next());
			
//			Person p = it.next();
//			System.out.println(p.getName()+"::"+p.getAge());
			System.out.println(it.next());
		}
	}

}
