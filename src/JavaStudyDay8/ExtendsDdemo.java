/*
 * �̳еĺô���
 *  1.����˴���ĸ����ԡ�
 *  2.��������֮�������ϵ��Ϊ��һ���ṩ��ǰ�ᡣ
 *  Java��֧�ֵ��̳У���֧�ּ̳У�����c++�еĶ�̳л��ƽ��и�����
 *  ���̳У�
 *    һ������ֻ��һ��ֱ�Ӹ���
 *  ��̳У�
 *    һ����������ж��ֱ�Ӹ��ࣨJava�в��������и�����
 *    ��ֱ��֧�֣���Ϊ�������������ͬ��Ա��������ò�ȷ���ԡ�
 *    ��Java�á���ʵ�֡���ʵ�֡�
 *  Java֧�ֶ��(����)�̳�
 *  C�̳�B,B�̳�A��
 *  �ͻ���ּ̳���ϵ��
 *  
 *  ��Ҫʹ��һ���̳���ϵʱ
 *  1.�鿴����ϵ�ж����࣬�˽���ϵ�Ļ������ܡ�
 *  2.������ϵ�е������������ɹ���ʹ�á�
 *  class DemoA
 *  {
 *  void show1(){}
 *  void show2(){}
 *  }
 *  class Demo2B
 *  {
 *  void show1(){}
 *  void show3(){}
 *  }
 *  ʲôʱ��̳���/
 *  1.��������֮�����������ϵ��ʱ�򣬾Ͷ���̳У�xxx��yyy�е�һ�֣�xxx extends yyy
 *  ������ϵ��is a ��ϵ
 */

package JavaStudyDay8;

public class ExtendsDdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name="zhangsan";
		s.age=22;
		s.study();

	}

}
class Person
{
	String name;
	int age;
}
class Student extends/*�̳�*/ Person
{
//	String name;
//	int age;
	void study()
	{
		System.out.println(name+"...student study..."+age);
	}
}
class Worker extends Person
{
//	String name;
//	int age;
	void work() 
	{
		System.out.println("worker work");
		
	}
}