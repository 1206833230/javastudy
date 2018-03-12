package cn.itcast.p4.generic.define.demo;

import cn.itcast.p.bean.Student;
import cn.itcast.p2.bean.Worker;

public class GenericDemo3 {
	public static void main(String[] agrs) {
		
		
		Tool<Student> tool = new Tool<Student>();
		
		tool.setObject(new Student());
		
		Student stu = tool.getObject();
		
		System.out.println(stu);
		
//		Tool tool  = new Tool();
//		tool.setObject(new Student());
//		
//		Student stu = (Student)tool.getObject();
//		
//		System.out.println(stu);
	}

}
