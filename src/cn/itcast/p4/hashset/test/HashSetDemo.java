package cn.itcast.p4.hashset.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashSet hs = new HashSet();
		String str = null;
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
