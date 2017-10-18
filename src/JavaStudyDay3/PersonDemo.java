/*
 * private ：私有，是一个权限修饰符，用于修饰成员
 *           私有的内容只在本类中有效。         
 * 注意：私有仅仅是封装的一种。
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
			System.out.println("输入数据错误")；
		}
		
	}*/
	void speak()
	{
		System.out.println("age="+age);
	}
}
