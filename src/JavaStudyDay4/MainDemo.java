/*
 *  ������������֮����
 *  1.��ʽ�ǹ̶��ġ�
 *  2.��jvm��ʶ��͵��á�
 *  
 *  public����ΪȨ�ޱ��������ġ�
 *  static: ����Ҫ����ġ�ֱ���������������������ü��ɡ�
 *  void�� ������û�þ���ķ���ֵ��
 *  main�� ���ǹؼ��֣�ֻ��һ��jvmʶ��Ĺ̶������ֶ��ѡ�
 *  String����args:�����������Ĳ����б���һ���������͵Ĳ���������Ԫ�ض����ַ������͵ġ�
 *  
 */

package JavaStudyDay4;

public class MainDemo {

	public static void main(String[] args) {//new String[0]
		// TODO Auto-generated method stub
		System.out.println(args);//[Ljava.lang.String;@15db9742
		System.out.println(args.length);
		for(int x=0; x<args.length;x++)
		System.out.println(args[x]);//java.lang.ArrayIndexOutOfBoundsException: 0

	}
	public static void main(int x)//������ʽ����String�Ͳ�����
	{
		
	}

}
