/*
 * ��̬ʱ��

 * ��Ա���ص㣨�Ǿ�̬����
 * 1.��Ա����
 *   ����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�������У��б���ͨ����û�У�����ʧ�ܡ�
 *   ����ʱ���ο������ͱ������������е��Ƿ��е��õĳ�Ա�����������и��������еĳ�Ա������
 *   ��˵����������ж��ο��Ⱥ���ߡ�
 * 2.��Ա����
 *   ����ʱ���ο������ͱ������������е��Ƿ��е��õĺ������У�����ͨ����û�У�����ʧ�ܡ�
 *   ����ʱ���ο����Ƕ��������������Ƿ��е��õĺ�����
 *   ��˵�����뿴��ߣ����п��ұߡ�
 * 3.��̬����
 *   ����ʱ��
 *   ����ʱ�����������ͱ����������е��Ƿ��е��þ�̬������
 *   ��˵����������ж�����ߡ�
 *   
 *   ��ʵ���ھ�̬�������ǲ���Ҫ����ģ�ֱ�����������á�
 */

package JavaStudyDay10;

public class DuoTaiDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f = new Zi();
		f.show();
		Fu.method();
		Zi.method();
//		f.method();
//		System.out.println(z.num);
//		Fu f = new Zi();
//		System.out.println(f.num);

	}

}
class Fu
{
//	int num = 3;
	void show()
	{
		System.out.println("Fu show");
	}
	static void method() 
	{
		System.out.println("fu static method");
	}
}
class Zi extends Fu
{
//	int num = 4;
	void show()
	{
		System.out.println("Zi show");
	}
	static void method() 
	{
		System.out.println("zi static method");
	}
}