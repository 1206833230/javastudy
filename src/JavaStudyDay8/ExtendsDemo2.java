/*
 * 在子父类中,成员的体现。
 * 1.成员变量
 * 2.
 * 3.构造函数
 * 成语变量
 * 当本类的成员变量和变量同名用this来区分。
 * 当父类与子类成员变量同名用super区分父类。
 * this：代表本类对象的引用。
 * super:代表一个父类的空间。
 * 
 */
package JavaStudyDay8;
public class ExtendsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.show();

	}

}
class Fu
{
	private int num = 4 ;
	public int getNum()
	{
		return num;
	}
}
class Zi extends Fu
{
	private int num = 5;
	void show()
	{
		System.out.println(this.num+"...."+super.getNum());
	}
}