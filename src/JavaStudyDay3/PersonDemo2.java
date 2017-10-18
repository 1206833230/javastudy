package JavaStudyDay3;

public class PersonDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person2 p = new Person2();//构造函数：构建创建对象时调用的函数可以给对象进行初始化
		 p.speak();//创建对象都必须通过构造函数进行初始化，一个类没有定义构造函数，那么该类终会有一个默认的空参数构造函数
		 p.speak();
		 Person2 p1 = new Person2("旺财");
		 p1.setName("旺旺");
		 p1.speak();
		 Person2 p2 = new Person2("小强",10);
		 p2.speak();
				 
		 
	}

}
class Person2
{
	private String name;
	private int age;
	//定义一个Person类的构造函数
	Person2()//构造函数，而且是一个空函数
	{
		name = "baby";
		age = 1;
		System.out.println("person run");
		return ;
	}
	//如果有的孩子一出生就有名字
	 Person2 (String n)
	 {
		 name = n;
		 
	 }
	 public void setName(String n)//一般方法，需要时调用
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

	public void speak()//一般函数
	{
		System.out.println(name+":"+age);
	}
}
/*
 * 一般函数与构造函数的区别
 * 构造函数：对象创建时，就会调用与之相应的构造函数，对象进行初始化
 * 一般函数：对象创建后，需要函数功能时才调用。
 * 构造函数：对象创建后，会调用只调用一次。
 * 一般函数：对象创建后可以被多次调用。
 * 什么时候使用构造函数?
 * 在描述实物时，该事物已经存在一些性质,一开始就定义在构造函数中。
 */

