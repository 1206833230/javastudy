package cn.itcast.p2.string.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * StingBuffer:�����ַ�����������
		 * ���ڴ洢���ݵ�������
		 * �ص㣺
		 * 1.�����ǿɱ䡣
		 * 2.���Դ��治ͬ���͵����ݡ�
		 * 3.����Ҫת���ַ�������ʹ�á�
		 * 4.���Զ��ַ��������޸ġ�
		 * 
		 * ��Ȼ������Ӧ�þ߱�ʲô�����أ�
		 * 1.���
		 * StringBuffer append(data);
		 * StringBuffer insert(index,data);
		 * 2.ɾ��
		 * stringBuffer delete (start,end);����Ͷ������β
		 * StringBuffer deleteCharAt(int index);ɾ��ָ��λ�õ�Ԫ��
		 * 3.����
		 *  char cahrAt(index);
		 *  int indexOf(string);
		 *  int lastIndexOf(string);
		 * 4.�޸�
		 * stringBuffer replace(start,end,string);
		 * void setCharAt(index,char);
		 * 
		 */
		bufferMethodDemo();
		bufferMethodDemo_2();

	}
	private static void bufferMethodDemo_2() {
		// TODO �Զ����ɵķ������
		StringBuffer sb = new StringBuffer("abce");
//		sb.delete(1, 3);
//		sb.delete(0,sb.length());//��ջ�����
//		sb = new StringBuffer();
//		System.out.println(sb);
//		sb.replace(1,3,"nba");
//		sb.setLength(0);
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
	public static void bufferMethodDemo() {
		//��������������
		StringBuffer sb1 = new StringBuffer("abcd");
		sb1.append("xixi");
		sb1.insert(2, "qq");
		System.out.println(sb1.toString());
		StringBuffer sb = new StringBuffer();
//		StringBuffer s1 = sb.append(4);
		sb.append(4);
		sb.append(true);
		sb.append(4).append(false).append("hehe");
		sb.insert(1,"hehe");
		
		System.out.println(sb);
//		System.out.println(sb==s1);
//		System.out.println(sb);
	}

}
