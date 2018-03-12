package cn.itcast.p4.news.demo;

import java.util.ArrayList;
import static java.util.Collections.*;
import static java.lang.System.*;
import java.util.List;
//import  static java.util.Collections.sort;//静态导入，其实导入的是类中的静态成员。
//import  static java.util.Collections.max;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
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
