package JavaStudyDay3;

public class PersonThisDemmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Person3();
		//Person3 p = new  Person3("����");
		//p.speak();
		//Person3 p1 = new  Person3("Сǿ");
		//p1.speak();
		Person3 p1 = new Person3("aa",30);
		Person3 p2 = new Person3("ss",30);
		p1.compare(p2);

	}

}
/*
 * ����Ա�����;ֲ����������������ùؼ���this������
 * this��������󣬴����ĸ����󣿵�ǰ����
 * this�������ں����������������
 * �ĸ����������this���ڵĺ�����this�ʹ����ĸ�����
 * this�൱�ڴ����˶���ʵ��ĵ�ַ
 * thisҲ�������ڹ��캯�����ù��캯��**�������ǵ�һ��
 * 
 */

class Person3
{
	private String name;
	private int age;
	//����һ��Person��Ĺ��캯��
	Person3()//���캯����������һ���պ���
	{
		//this("haha"); ��ѭ�� ����ջ��
		name = "baby";
		age = 1;
		System.out.println("person run");
		return ;
	}
	//����еĺ���һ������������
	 Person3 (String name)
	 {
		 //this(); //��ѭ��
		 this.name = name;
		 
	 }
	 public void setName(String n)//һ�㷽������Ҫʱ����
	 {
		 name = n;
	 }
	 Person3(String name,int age)
	 {
		// if(age<0)
			// return ;
		  //this("haha");//�����ǵ�һ��
		 this.name = name;//���Ƹ���haha
		 this.age = age;
		
		 //this.speak();
	 }

	public void speak()//һ�㺯��
	{
		System.out.println(this.name+":"+this.age);
	}
	/*
	 * �ж��Ƿ���ͬ����
	 */
	public boolean compare(Person3 p)
	{
		//if(this.age == p.age)
		//	return true;
		//else
		//	return false;
		return age==p.age;
	}
}
