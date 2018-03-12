package cn.itcast.p6.hashmap.demo;

import java.util.HashMap;
import java.util.Iterator;
import cn.itcast.p.bean.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 将学生对象和学生的归属地通过键与值储存到map集合中。
		 */
		HashMap<Student,String> hm = new HashMap<Student,String>();
		
		hm.put(new Student("lisi",38), "北京") ;
		hm.put(new Student("zhouliu",24), "上海") ;
		hm.put(new Student("xiaoqiang",31), "沈阳") ;
		hm.put(new Student("wangcai",28), "大连") ;
		hm.put(new Student("zhaoliu",24), "铁林") ;
		
//		Set<Student> keySet = hm.keySet();
//		
//		Iterator<Student> it = keySet.iterator();
		
		Iterator<Student> it = hm.keySet().iterator();
		
		while(it.hasNext()) {
			Student key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}

	}

}
