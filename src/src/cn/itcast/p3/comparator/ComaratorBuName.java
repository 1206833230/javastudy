package cn.itcast.p3.comparator;

import java.util.Comparator;

import cn.itcast.p2.bean.Person;

public class ComaratorBuName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO 自动生成的方法存根
		int temp = o1.getName().compareTo(o2.getName());
		
		return temp==0? o1.getAge()-o2.getAge(): temp;
	}

}
