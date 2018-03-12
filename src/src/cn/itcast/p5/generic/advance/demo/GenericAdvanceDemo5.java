package cn.itcast.p5.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p2.bean.Person;
import cn.itcast.p2.bean.Student;
import cn.itcast.p2.bean.Worker;

public class GenericAdvanceDemo5 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      
        ArrayList<Person> al1 = new ArrayList<Person>();
		
		al1.add(new Person("abc1",19));
		al1.add(new Person("abc2",18));
		
        ArrayList<Person> al2 = new ArrayList<Person>();
		
		al2.add(new Person("abc11",119));
		al2.add(new Person("abc22",118));
		
//		al1.containsAll(al2);
		
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("anbcjdd");
		al4.add("cjdd");
		
		al1.containsAll(al4);
		
//		"abc".equals(new Person("hahha",20));
	}
	public static void printCollection(Collection<?> al) {
		Iterator<?> it = al.iterator();
		
		while(it.hasNext()) {
		
			System.out.println(it.next());
		}
	}

}
class MyCollection2<E>{
	public boolean containAll(Collection<?> coll) {
	
	return true;
   }
}
	
