package cn.itcast.p2.linkedlist.test;

public class LinkedTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ��ʹ��LinkedList��ģ��һ����ջ���߶������ݽṹ��
		 * ��ջ���Ƚ���� First In Last Out FILO(��ͳ���
		 * ���У��Ƚ��ȳ� First In First Out FIFO��������)
		 * 
		 * ����Ӧ����ô����������һ����������ʹ���ṩһ������������������ֽṹ��һ�֡�
		 * 
		 */
		Duilie dl = new Duilie();
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		while(!dl.isNull()) {
			System.out.println(dl.myGet());
		}

	}
		
}


