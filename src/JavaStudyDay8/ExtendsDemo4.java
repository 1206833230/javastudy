/*
 * �Ӹ����й��캯�����ص㣺
 * �����๹�����ʱ�����֣��������๹�캯��ʱ������Ҳ�����ˡ�
 * Ϊʲô�أ�
 * ԭ���ǣ�������Ĺ��캯���е�һ������һ��Ĭ�ϵ���ʽ��䡣super������
 * �����ʵ��������:�������еĹ��캯��Ĭ�϶���ȥ���ʸ���Ŀղ������캯��
 * Ϊ��ô����ʵ������ʱ��Ҫ���ʸ��๹�캯���أ�
 * ������Ϊ����̳��˸��࣬��ȡ���˸�������ݣ����ԣ���������ʹ�ø��������֮ǰ��
 * Ҫ�ȿ���������γ�ʼ���ġ�
 * ���������๹�����ʱ��������ʸ���Ĺ��캯����
 * Ϊʲô����������Ķ�������������Ĺ��캯���м���super();
 * 
 * ���������û�ж���ղ������캯������ô����Ĺ��캯��������super��ȷҪ���ø���
 * �е��Ǹ����캯����
 *  �������Ǹ����캯����ͬʱ���๹�캯�����ʹ��this�����˱��๹�캯��ʱ��
 *  ��ôsuper��û���ˣ���Ϊsuper��this��ֻ�ܶ����һ�У�����ֻ��һ����
 *  ���ǿ��Ա�֤���ǣ������п϶������������캯�����ʸ���Ĺ��캯����
 * 
 * ע�⣺super�����붨�������๹�캯���ĵ�һ�У���Ϊ����ĳ�ʼ������Ҫ����ɡ�
 */

package JavaStudyDay8;

public class ExtendsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zi3(6);

	}

}
class Fu3
{
	int num;
	Fu3()
	{
		num = 10;
		System.out.println("A fu run");
	}
	Fu3(int x)
	{
		System.out.println("B fu run ..."+x);
		return ;
	}
}
class Zi3 extends Fu3
{
	int num;
	Zi3()
	{
		System.out.println("C Zi run"+num);
	}
	Zi3(int x)
	{ 
		this();
		//super(4);//���õľ��Ǹ����пղ����Ĺ��캯��
		//super(x);
		System.out.println("D Zi run ..."+x);
		
	}
}
class Demo //extends Object
{
	/*
	 * Demo()
	 * {
	 *     super();
	 *     return ;
	 * }
	 */
}