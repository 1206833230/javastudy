package JavaStudyDay3;

public class PersonDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person2 p = new Person2();//���캯����������������ʱ���õĺ������Ը�������г�ʼ��
		 p.speak();//�������󶼱���ͨ�����캯�����г�ʼ����һ����û�ж��幹�캯������ô�����ջ���һ��Ĭ�ϵĿղ������캯��
		 p.speak();
		 Person2 p1 = new Person2("����");
		 p1.setName("����");
		 p1.speak();
		 Person2 p2 = new Person2("Сǿ",10);
		 p2.speak();
				 
		 
	}

}
class Person2
{
	private String name;
	private int age;
	//����һ��Person��Ĺ��캯��
	Person2()//���캯����������һ���պ���
	{
		name = "baby";
		age = 1;
		System.out.println("person run");
		return ;
	}
	//����еĺ���һ������������
	 Person2 (String n)
	 {
		 name = n;
		 
	 }
	 public void setName(String n)//һ�㷽������Ҫʱ����
	 {
		 name = n;
	 }
	 Person2(String n,int a)
	 {
		 if(a<0)
			 return ;
		 name = n;
		 age = a;
	 }

	public void speak()//һ�㺯��
	{
		System.out.println(name+":"+age);
	}
}
/*
 * һ�㺯���빹�캯��������
 * ���캯�������󴴽�ʱ���ͻ������֮��Ӧ�Ĺ��캯����������г�ʼ��
 * һ�㺯�������󴴽�����Ҫ��������ʱ�ŵ��á�
 * ���캯�������󴴽��󣬻����ֻ����һ�Ρ�
 * һ�㺯�������󴴽�����Ա���ε��á�
 * ʲôʱ��ʹ�ù��캯��?
 * ������ʵ��ʱ���������Ѿ�����һЩ����,һ��ʼ�Ͷ����ڹ��캯���С�
 */

