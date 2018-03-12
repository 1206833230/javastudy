package cn.itcast.p5.generic.advance.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p2.bean.Person;
import cn.itcast.p2.bean.Student;
import cn.itcast.p2.bean.Worker;

public class GenericAdvanceDemo4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet<Worker> al = new TreeSet<Worker>();
		
		al.add(new Worker("abc",30));
		al.add(new Worker("abc4",34));
		
		TreeSet<Student> al2 = new TreeSet<Student>(new CompByStuName());
		
		al2.add(new Student("abc1",19));
		al2.add(new Student("abc2",18));
		

		TreeSet<Person> al3 = new TreeSet<Person>(new CompByName());
		
		al3.add(new Person("abc1",19));
		al3.add(new Person("abc2",18));
		al3.add(new Person("abc4",20));

		
		
		TreeSet<String> al4 = new TreeSet<String>();
		al4.add("anbcjdd");

		
		al3.addAll(al2);
//		al3.addAll(al);
		
//		System.out.println(al3.size());
		
		Iterator<Student> it = al2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}


}
/*class treeSet<E>
 * {
 *     TreeSet(Comparator<? super E> comp);
 *     }
 *     
 *     什么时候下限呢？ 通常对集合元素进行取出操作时，可以是下限。
 */
class CompByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO 自动生成的方法存根
		
		int temp = o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;
	}
	
}
class CompByStuName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO 自动生成的方法存根
		int temp = o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;
	}
	}
	
