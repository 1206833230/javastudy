package cn.itcast.p1.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;

import cn.itcast.p2.bean.Person;
import cn.itcast.p3.comparator.ComaratorBuName;

public class GenricDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		TreeSet<Person> ts = new TreeSet<Person>(new ComaratorBuName());
		ts.add(new Person("lisi",21));
		ts.add(new Person("zhangsan",23));
		ts.add(new Person("wangwu",22));
		ts.add(new Person("wangcai",26));
		ts.add(new Person("xiaoqiang",27));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}

	}

}
