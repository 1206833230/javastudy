/*
 * private ��˽�У���һ��Ȩ�����η����������γ�Ա
 *           ˽�е�����ֻ�ڱ�������Ч��         
 * ע�⣺˽�н����Ƿ�װ��һ�֡�
 */

package JavaStudyDay3;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//p.age = 20;
		//p.haha(20);
		p.setAge(20);
		p.getAge();
		p.speak();
	}

}
class Person
{
	private int age;
	public void setAge(int a)
	{
		age = a;
	}
	public int getAge()
	{
		return age;
	}
	/*
	public void haha(int a)
	{
		if(a>0 && a<130)
		{
			age = a;
			speak();
		}
		else 
		{
			System.out.println("�������ݴ���")��
		}
		
	}*/
	void speak()
	{
		System.out.println("age="+age);
	}
}
