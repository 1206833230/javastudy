package cn.itcast.p2.stringbuffer.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
/*
 * StringBuffer�������ַ�����������
 * �������ݵĴ����������
 * �ص㣺
 * 1.���Ȳ��ɱ䡣
 * 2.���Դ��治ͬ�������͡�
 * 3.����Ҫת��Ϊ�ַ���ʹ��
 * 4.���Զ��ַ��������޸�
 * 
 * ��Ȼ��һ����������Ӧ�þ߱�ʲô������?
 * 1.��ӣ�
 *  StringBuffer append��data����
 *  StringBufer insert(data);
 *  2.ɾ����
 *  StringBuffer delete��start��end������ͷ������β
 *  StringBuffer deleteCharAt��int index����ɾ��ָ��λ�õ�Ԫ��
 *  3.����
 *  char charAt(index);
 *  int indexOf(string);
 *  int lastIndexOf(string);
 *  4.�޸�
 *  StringBuffer replace(start,end,String);
 *  void setCharAt(index,char);
 *  ��ɾ�ģ�C(create)U(update)R(read)D(delete)
 *  
 *    
 */
		bufferMethodDemo1();
		bufferMethodDemo();
		bufferMethodDemo_2();

	}

	private static void bufferMethodDemo_2() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abce");
//		sb.delete(1, 3);//ee
//		//���������
//		sb.delete(0,sb.length());
//		sb = new StringBuffer();
		
//		sb.replace(1,3,"nba");
//		sb.setCharAt(2, 'q');
//		sb.setLength(10);
//		System.out.println("sb��"+sb);
//		System.out.println("leb:"+sb.length());
		System.out.println(sb.reverse());
	}

	private static void bufferMethodDemo1() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abce");
		sb.insert(2, "qq");
		System.out.println(sb.toString());
		
	}

	private static void bufferMethodDemo() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(4).append(false);//.append("haha");
//		sb.append(ture);
		sb.insert(1,"haha");
		System.out.println(sb);
		
	}

}
