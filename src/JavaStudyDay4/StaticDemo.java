/*static���ص㣺
 * һ�����η� �������γ�Ա
 * ��̬���ε����� �Ƕ��������е�
 * �����ڶ������ ������ļ��ؾ��Ѿ�����
 * ���γ�Ա����һ�ֵ��÷�ʽ���Ϳ���ֱ���������� ������ ��̬��Ա��
 * ��Լ�ڴ�
 */


package JavaStudyDay4;

public class StaticDemo {
	static int num = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "Сǿ";
		//p.show();
		Person.show();
		new StaticDemo().show1();//�������Ǿ�̬��

	}
	public  void show1()
	{
		System.out.println(num);
	}

}
/*
 * ��Ա�����뾲̬��������
 * 1.�����������������ڲ�ͬ��
 *   ��Ա�������Ŷ���Ĵ��������ڣ����Ŷ���ı����ն��ͷ�
 *   ��̬����������ļ��ض����ڣ����������ʧ����ʧ
 * 2.���õķ�ʽ��ͬ��
 *   ��Ա����ֻ�ܱ�������á�
 *   ��̬�������Ա�������ã������Ա��������á�
 * 3.������ͬ��
 *   ��Ա����Ҳ��Ϊʵ��������
 *   ��̬����Ҳ��Ϊ�������
 * 4.���ݵĴ���λ�ò�ͬ��
 *   ��Ա�������ݴ����ڶ��ڴ�Ķ����У�����Ҳ�ж�����������ݡ�
 *   ��̬�������ݴ����ڷ��������ľ�̬���У���Ҳ�ж���Ĺ������ݡ�
 * 
 * ��̬ʹ�õ�ע�����
 * 1.��̬����ֻ�ܷ��ʾ�̬��Ա�����Ǿ�̬���Է��ʷǾ�̬���ֿ��Է��ʾ�̬��
 * 2.��̬�����в�����this��super�ؼ��֡�
 * 3.�������Ǿ�̬�ġ�
 */
class Person
{
	String name;//��Ա������ʵ������
	static String country = "CN";//��̬�����������
	public static void show()
	{
		//System.out.println(Person.country+":"+this.name);
		System.out.println(Person.country);
	}
}