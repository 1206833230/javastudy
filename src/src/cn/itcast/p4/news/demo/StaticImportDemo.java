package cn.itcast.p4.news.demo;

import java.util.ArrayList;
import static java.util.Collections.*;
import static java.lang.System.*;
import java.util.List;
//import  static java.util.Collections.sort;//��̬���룬��ʵ����������еľ�̬��Ա��
//import  static java.util.Collections.max;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		List<String> list = new ArrayList<String>();
		
		list.add("abc3");
		list.add("abc7");
		list.add("abc1");
		
		out.println(list);
		
		sort(list);
		
		out.println(list);
		
		String max = max(list);
		
		out.println("max:"+max);
		

	}

}
