/*
 * ��Ա����
 * ���Ӹ����г��ֳ�Ա����һģһ�������������������ĺ�����
 * �������󣬳�Ϊ���ǲ�������ʱ�������Ӹ����е����ԡ�
 * ����������������
 *   1.���أ�ͬһ������overload
 *   2.���ǣ��Ӹ����У�����Ҳ����д����д��override
 *   ����ע�����
 *   1.�ӷ������Ǹ��෽��ʱ������Ȩ�޸��Ǳ�����ڵ��ڸ���Ȩ��
 *   2.��ֻ̬�ܸ��Ǿ�̬���򱻾�̬���ǡ�
 * ʲôʱ��ʹ�ø��ǲ���
 * ������һ��������������չʱ��������Ҫ�������ෳ�˹���������
 * ����Ҫ���������иù��ܵ���������ʱ����Ҫʹ�ø��ǲ�����ɡ�
 */
package JavaStudyDay8;
public class ExtendsDemo3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Zi1 z = new Zi1();
//		z.show2();
//		z.show1();
//		z.show();
//		Phone p = new Phone();
//		p.show();
		NewPhone p = new NewPhone();
		p.newshow();

	}

}
//class Fu1
//{
//	public static void show()
//	{
//		System.out.println("fu show  run");
//		
//	}
//}
//class Zi1 extends Fu1
//{
//	public static void show()
//	{
//		System.out.println("Zi show fu");
//	}
//}
class Phone
{
	void show()
	{
		System.out.println("number");
		
	}
}
class NewPhone extends Phone
{
	void newshow()
	{
		super.show();
		System.out.println("pie");
		System.out.println("name");
	}
}