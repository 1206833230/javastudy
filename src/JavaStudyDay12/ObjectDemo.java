package JavaStudyDay12;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(20);
		Person p2 = new Person(20);
//		Person p3 = p1;
//		Demo d = new Demo();
//		System.out.println(p1==p2);
//		System.out.println(p1.equals(p2));
//		System.out.println(p1);
//		System.out.println(Integer.toHexString(p1.hashCode()));
//		Class class1 = p1.getClass();
//		Class class2 = p2.getClass();
//		System.out.println(class1 == class2);
//		System.out.println(class1.getName());
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p1.getClass().getName()+ "$"+Integer.toHexString(p2.hashCode()));

//		Class class1 = p1.getClass();
//		Class class2 = p2.getClass();
//		System.out.println(class1==class2);
//		System.out.println(class1.getName());
	}

}
//class Fu extends Object
//{
//	
//	Fu(){
//		super();
//	}
//}
//class Zi extends Fu
//{
//	Zi()
//	{
//	super();
//	}
//}
class Person extends Object
{
	private int age;
	Person(int age)
	{
		this.age = age;
	}
//	//�Ƚ�Person�����䣬�Ƿ���ͬ����
//	public boolean compare(Person p)
//	{
//		return this.age ==p.age;
//	}
	/*
	 * һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ��ж϶����Ƿ���ͬ�����ݡ�(non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)//object obj = p2;
	{
		if(!(obj instanceof Person))
		{
//			return false;
//			throw new RuntimeException("���ʹ���")��
			throw new ClassCastException("���ʹ���");
		}
		Person p = (Person)obj;
		return this.age == p.age;
	}
	public int hashCode()
	{
		return age;
	}
	public String toString() 
	{
		return "Person:" +age;
	}

}
class Demo
{
	
}