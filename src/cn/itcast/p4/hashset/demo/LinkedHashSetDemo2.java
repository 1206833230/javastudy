package cn.itcast.p4.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashSet hs = new LinkedHashSet();
		hs.add("haha");
		hs.add("xixi");
		hs.add("hehe");
		hs.add("sisi");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
