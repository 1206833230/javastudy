package cn.itcast.p4.generic.define.demo;

public class GenericDemo4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Tool<String> tool = new Tool<String>();
		
		tool.show(new Integer(4));
		tool.show("abc");
		tool.print("haha");
		Tool.method("haha");
		Tool.method(new Integer(4));

	}

}
