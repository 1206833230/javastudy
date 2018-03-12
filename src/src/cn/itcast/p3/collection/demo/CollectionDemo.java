package cn.itcast.p3.collection.demo;
import java.util.ArrayList;
/**
 * 
 */
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Collection coll = new ArrayList();
		
		show(coll);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		
		show(c1,c2);
		

	}
	public static void show(Collection c1,Collection c2) {
		//�������Ԫ��
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//���� ���Ԫ��
		c2.add("abc2");
		c2.add("abc5");
		c2.add("abc6");
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		//��ʾaddAll
//		c1.addAll(c2);//��C2�е�Ԫ����Ӵﵽ��c2��
		
		//��ʾremoveAll
//		boolean b = c1.removeAll(c2);//�����������е���ͬԪ�شӵ���removeAll�ļ�����ɾ����
//		System.out.println("remove:"+b);
//		
		//��ʾcontainsAll
//		boolean b = c1.containsAll(c2);
//		System.out.println("containsAll:"+b);
		
		//��ʾratainAll
		boolean b = c1.retainAll(c2);//ȡ������������ͬԪ�أ�ȥ����ͬԪ��
		System.out.println("containsAll:"+b);
		System.out.println("c1:"+c1);
	}
	public static void show(Collection coll) {
		//���Ԫ��
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		
		//ɾ��Ԫ��
		coll.remove("abc2");
		
		//��ռ���
//		coll.clear();
		
		System.out.println(coll.contains("abc3"));
		System.out.println(coll);
	}

}
