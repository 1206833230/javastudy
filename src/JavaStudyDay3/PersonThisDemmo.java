package JavaStudyDay3;

public class PersonThisDemmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Person3();
		//Person3 p = new  Person3("旺财");
		//p.speak();
		//Person3 p1 = new  Person3("小强");
		//p1.speak();
		Person3 p1 = new Person3("aa",30);
		Person3 p2 = new Person3("ss",30);
		p1.compare(p2);

	}

}
/*
 * 当成员变量和局部变量重名，可以用关键字this来区分
 * this：代表对象，代表哪个对象？当前对象。
 * this就是所在函数所属对象的引用
 * 哪个对象调用了this所在的函数，this就代表哪个对象。
 * this相当于储存了堆中实体的地址
 * this也可以用于构造函数调用构造函数**但必须是第一行
 * 
 */

class Person3
{
	private String name;
	private int age;
	//定义一个Person类的构造函数
	Person3()//构造函数，而且是一个空函数
	{
		//this("haha"); 死循环 导致栈满
		name = "baby";
		age = 1;
		System.out.println("person run");
		return ;
	}
	//如果有的孩子一出生就有名字
	 Person3 (String name)
	 {
		 //this(); //死循环
		 this.name = name;
		 
	 }
	 public void setName(String n)//一般方法，需要时调用
	 {
		 name = n;
	 }
	 Person3(String name,int age)
	 {
		// if(age<0)
			// return ;
		  //this("haha");//必须是第一行
		 this.name = name;//旺财覆盖haha
		 this.age = age;
		
		 //this.speak();
	 }

	public void speak()//一般函数
	{
		System.out.println(this.name+":"+this.age);
	}
	/*
	 * 判断是否是同龄人
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
