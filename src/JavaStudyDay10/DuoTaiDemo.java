/*
 * ��̬�ڴ����е����֣�
 * ������߽ӿڵ�����ָ����=���������
 * 
 * ��̬�ĺô���
 *  ����˴������չ�ԣ�ǰ�ڶ���Ĵ������ʹ�ú��ڵ����ݡ�
 * ��̬�ı׶ˣ�
 *  ǰ�ڶ�������ݣ�����ʹ�ú������ඨ����������ݡ�
 *  ��̬��ǰ�᣺
 *   1.�����й�ϵ���̳У�ʵ��
 *   2.Ҫ�и���
 */

package JavaStudyDay10;

public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat c = new Cat();
//		c.eat();
//		c.catchMouse();
		
		Animal a = new Cat();//�Զ���������è���������˶������͡��������й����޷����ʡ�
		                     //���þ����������й��ܵķ��ʡ�
                             //����ת��
		a.eat();
		//�������ʹ�þ��嶯��è�Ĺ���
		//����Խ��ö����������ת��
//		Cat c = (Cat)a;//����ת�͵�Ŀ����Ϊ��ʹ�������е����з�����
//		c.eat();
//		c.catchMouse();
//		Animal a1 = new Dog();
//		Cat c1 = (Cat)a1;
//		//ע�� ����ת�ͣ���ʼ���ն��������������������ת����
//		Cat c = new Cat();
//		Dog d = new Dog();
//		method(c);
//		method(d);
//		method(new Pig());
		method(new Dog());
	}
	public static void method(Animal a)//Animal a = new Dog();
	{
		a.eat();
		if(a instanceof Cat)//instanceof�������ж϶���ľ������ͣ�ֻ�������������������ж�
		{                   //ͨ����������ת������ת��
		Cat c = (Cat)a;
		c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.lookHome();
		}
//		a.catchMouse();
	}
//		public static void method(Cat c)
//		{
//			c.eat();
//		}
//		public static void method(Dog d)
//		{
//			d.eat();
//		}

	

}
abstract class Animal
{
	abstract void eat();
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("�й�ͷ");
		
	}
	void lookHome()
	{
		System.out.println("����");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("����");
	}
	void catchMouse()
	{
		System.out.println("ץ����");
	}
}
class Pig extends Animal
{
	void eat()
	{
		System.out.println("����");
	}
	void gongdi()
	{
		System.out.println("����");
	}
	
}