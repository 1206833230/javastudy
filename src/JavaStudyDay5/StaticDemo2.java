/*
 * 静态什么时候用？
 * 1.静态变量
 *   a.当分析对象中所具备的成员变量的值都是相同的。这时这歌成员就可以被静态修饰。
 *   如果数据在对象中都是不同的，就是对象的特有数据，必须储存在对象中，是非静态的。
 *   如果是相同的数据，对象不需要做修改只需要使用即可，不需要储存在对象中，定义成静态。
 *     
 * 2.静态方法
 *  a.函数是否用静态修饰，或参考一点，就是该函数功能是否访问到对象中的特有数据。
 *  简单点说，从源代码看，该功能是否需要访问非静态的成员变量，如果需要就是非静态的。
 *  如果不需要，就可以将该功能定义成静态的。当然，也可以定义成非静态的。
 *  但是非静态需要被对象调用，而仅创建对象调用非静态的
 *  没用访问特有的数据的方法，该对象的创建时没意义的。  
 */

package JavaStudyDay5;

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Demo p =new Demo(30);
		 //p.speak();
		 Demo.speak();
		 //Demo.show();

	}

}
class Demo
{
	static int num = 9;
	int age;
	Demo(int age)
	{
		this.age = age;
	}
	public static void speak()
	{
		System.out.println(num);
	}
	public void show()
	{
		System.out.println(age);
	}
}
