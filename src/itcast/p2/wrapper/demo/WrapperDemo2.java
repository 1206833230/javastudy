package cn.itcast.p2.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 4;
		Integer i = 4;//i = new Integer��4�����Զ�װ�����д
		i = i + 6;//i=i+6;i = new Integer(i.intValue() + 6);//i.intvalue(); �Զ�����
		
		show(55);
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//ture
		
		Integer x = 128;//jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ�
		Integer y = 128;
		System.out.println(x==y);
		System.out.println(x.equals(y));
		
		

	}

	private static void show(Object a) {
		// TODO Auto-generated method stub
		System.out.println("a="+a);
	}

}
