package cn.itcast.p1.vector.demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector v = new Vector();
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		
		Enumeration enumeration = v.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println("nextElement:"+enumeration.nextElement());
		}
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println("next:"+it.next());
		}

	}

}
