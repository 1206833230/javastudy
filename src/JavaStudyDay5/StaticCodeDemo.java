/*
 * ��̬����顣
 * ������ļ��ض�ִ��.����ִֻ��һ�Ρ�
 * ���ã�
 *  ���ڸ�����г�ʼ����
 */

package JavaStudyDay5;

public class StaticCodeDemo {
	static
	{
		System.out.println("a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new StaticCode().show();
		//new StaticCode().show();
		//StaticCode.show();
		Person p1 = new Person();
		p1.speak();
		Person p2 = new Person("����");
		p2.speak();
		new Person();

	}

}
class StaticCode
{
	static int num;
	static
	{
		num = 10;
		num *= 3;
		System.out.println("hahaha");
	}
	//StaticCode{}{}
	static void show()
	{
		System.out.println(num);
	}
}
class Person
{
	private String name1;
	{//�������飬���Ը����ж�����г�ʼ��
		//System.out.println("person run");
		cry();
	}
	Person()//���캯��������Ӧ�Ķ�����г�ʼ��
	{
		name1 = "baby";
		//cry();
	}
	Person(String name1)
	{
		this.name1 = name1;
		//cry();
	}
	public void cry()
	{
		System.out.println("����");
	}
	public void speak()
	{
		System.out.println("name="+name1);
	}
}