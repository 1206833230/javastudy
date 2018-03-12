package cn.itcast.p6.hashmap.demo;

import java.util.HashMap;
import java.util.Iterator;
import cn.itcast.p.bean.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ��ѧ�������ѧ���Ĺ�����ͨ������ֵ���浽map�����С�
		 */
		HashMap<Student,String> hm = new HashMap<Student,String>();
		
		hm.put(new Student("lisi",38), "����") ;
		hm.put(new Student("zhouliu",24), "�Ϻ�") ;
		hm.put(new Student("xiaoqiang",31), "����") ;
		hm.put(new Student("wangcai",28), "����") ;
		hm.put(new Student("zhaoliu",24), "����") ;
		
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