package cn.itcast.p5.TreeSet.demo;

import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p5.comparator.ComparatorByLength;

/*
 * ���ַ������г�������
 */
public class TreeSetTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet ts = new TreeSet(new ComparatorByLength());
		
		ts.add("aaaa");
		ts.add("zz");
		ts.add("nabq");
		ts.add("cba");
		ts.add("abc");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
