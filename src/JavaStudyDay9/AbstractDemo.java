/*
 * �����ࣺ
 * ����:��ͳ��ģ�����������������塣
 * �ص㣺
 * 1.����ֻ������û��ʵ��ʱ���÷������ǳ��󷽷�����Ҫ��abstract���Ρ�
 *  ���󷽷����붨���ڳ������У��������Ҳ��abstract���Ρ�
 * 2.�����಻���Ա�ʵ������Ϊʲô����Ϊ�����˳��󷽷�Ҳû�����塣
 * 3.����������������า�������еĳ��󷽷��󣬸�����ſ���ʵ������
 *  ����������໹�ǳ����ࡣ
 * 
 * 1.���������й��캯����
 *  �У����ڸ����������г�ʼ����
 * 2.�������п��Բ�������󷽷���
 *  ���Եģ����Ǻ��ټ���Ŀ�ľ��ǲ��ø��ഴ������AWT��������������������ࡣ
 *  ͨ��������еķ����з����壬����ȴû�����ݡ�
 *  class Demo
 *  {
 *  void show1������
 *  void show2����
 *   {
 *   }
 *  }
 * 3.����ؼ��ֺ���Щ�ؼ��ֹ���?
 *  private ���� �޷�������
 *  static ���� 
 *  final ����
 * 4.�������һ���������
 *  ��ͬ��;
 *      �������һ���඼����������ʵ��ģ� �����ڲ������˳�Ա��
 *  ��ͬ��
 *      1.һ�������㹻����Ϣ�������
 *        �����������������Ϣ�п��ܲ��㡣
 *      2. һ�����в��ܶ�����󷽷���ֻ�ܶ���ǳ��󷽷���
 *         �������п��Զ�����󷽷���ͬʱҲ���Զ���ǳ��󷽷���
 *      3.һ������Ա�ʵ������
 *        �����಻���Ա�ʵ������
 * 5.������һ���Ǹ�����
 *   �ǵ���Ϊ��Ҫ���า���䷽����ſ��Ա�ʵ������
 */

package JavaStudyDay9;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class Demo
{
	abstract /*����*/ void show();
	
}
class DemoA extends Demo
{
	void show()
	{
		System.out.println("demoa show");
	}
}
class  DemoB extends Demo
{
	void show()
	{
		System.out.println("demob show");
	}
}
abstract class Ȯ��
{
	abstract void ���();
	
}
class �� extends Ȯ��
{
	int ���� = 3;
	void ���()
	{
		System.out.println("����");
	}
}
class �� extends Ȯ��
{
	void ���()
	{
		System.out.println("��");
	}
}
