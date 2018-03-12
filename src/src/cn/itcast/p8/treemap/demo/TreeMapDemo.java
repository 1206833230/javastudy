package cn.itcast.p8.treemap.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import cn.itcast.p.bean.Student;
import cn.itcast.p5.treeset.demo.CompartorByName;

public class TreeMapDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new CompartorByName());
		tm.put(new Student("lisi",38), "北京") ;
		tm.put(new Student("zhouliu",24), "上海") ;
		tm.put(new Student("xiaoqiang",31), "沈阳") ;
		tm.put(new Student("wangcai",28), "大连") ;
		tm.put(new Student("zhaoliu",24), "铁林") ;
		

		Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Student, String> me= it.next();
			Student key = me.getKey();
			String value = me.getValue();
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
 

	}

}
