package cn.itcast.p2.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int num = 4;
		num = num  + 5;
		Integer i = 4;//i = new Integer(4);�Զ�װ�����д
		i = i + 6;
		
		show(66);
		Integer a = new Integer(127);
		Integer b = new Integer(128);
		System.out.println(a==b);;
		System.out.println(a.equals(b));
		Integer x = 127;//jdk�Ժ��Զ�װ�䣬���װ���ֻһ���ֽڣ���ô�����ݻᱻ��������Ὺ����Ů�Ŀռ䡣
		Integer y = 128;
		System.out.println(x==y);;
		System.out.println(x.equals(y));

	}

	private static void show(Object i) {
		// TODO �Զ����ɵķ������
		System.out.println("i="+i);
	}

}
