package cn.itcast.p2.wapper.demo;
/**
 * 
 * @author Jun Li
 * 2018��1��5��
 * ����3:26:08
 */
public class WrapperDemo2 {

	public static void main(String[] args) {
		int num = 4 ;
		num = num + 5;
		
		Integer i = 4;//i = new Integer(4);�Զ�װ�䣬����д
		i = i + 6;//i = new Integer(i.intValue() + 6);//i.intValue() �Զ�����
		
//		show(55);
		
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		//���Կ��ܻ�����
		Integer x = 127;//jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		Integer y = 127;
		System.out.println(x==y);//�ж�λ��
		System.out.println(x.equals(y));//�ж�ֵ
		
	}

	public static void show(Object a) {
		// TODO �Զ����ɵķ������
		System.out.println("a="+a);
	}
}
