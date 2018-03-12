package cn.itcast.p5.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");
		al.add("hehe");
		
        ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(5);
		al2.add(67);
		
		printCollection(al);
		printCollection(al2);

	}



	/**
	 * 迭代并打印集合中的元素
	 * @param al
	 */
	public static void printCollection(Collection<?> al) {
		Iterator<?> it = al.iterator();
		
		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
			System.out.println(it.next());
		}
	}

}
