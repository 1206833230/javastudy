/*
 * final
 * �̳б׶ˣ����˷�װ�ԡ�
 * final�ؼ��֣�
 * 1.final��һ�����η����������η������࣬������
 * 2.final���ε��಻���Ա��̳С�
 * 3.final���εķ��������Ա����ǡ�
 * 4.final���εı�����һ��������ֻ�ܱ���ֵһ�Ρ�
 *  ΪʲôҪʹ��final���α�������ʵ�ڳ������һ�������ǹ̶��ġ�
 *  ��ôֱ��ʹ��������ݾͿ����ˣ����������Ķ��Բ���Ը�������������֡�
 *  ��������������Ƶ�ֵ���ܱ仯�����Լ�����final�̶���
 *  д���淶������������ĸ��д������֮�����»������ӡ�
 */
package JavaStudyDay9;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.method();

	}

}
class Fu
{
	void method()
	{
		//���õײ�ϵͳ��Դ
	}
}
class Zi extends Fu
{
	public final double MY_PI = 3.14;
	static final int X = 1;
	void method()
	{
		final int NUMBER = 9;
		System.out.println("haha"+MY_PI+NUMBER+X);
	}
}
