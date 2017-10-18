/*
 * 抽象类和接口的异同点：
 * 相同点：
 *     都是不断向上抽取而来的。
 * 不同点：
 *     1.抽象类需要被继承，而且只能单继承。
 *       接口需要被实现，而且可以多实现。
 *     2.抽象类可以定义抽象方法和抽象方法，子类继承后，可以直接使用抽象方法。
 *       接口中只能定义抽象方法，必须由子类去实现。
 *     3.抽象类的继承，是is a关系。在定义该体系的基本共性内容。
 *       接口的是现实like a关系。在定义体系的额外功能。
 *       
 *犬按功能分：导盲犬，搜爆犬。
 */
//abstract class 犬
//{
//	abstract void 吼叫();
//}
//abstract class 导盲
//{
//	abstract void 导盲();
//}
//class 导盲犬 extends 犬 implements 导盲
//{
//	public void 吼叫()
//	{
//		
//	}
//	public void 导盲()
//	{
//		
//	}
//}
//在不同问题领域中，有不同的分析方式。
//学员：
/*
 * 笔记本电脑的使用
 * 为了扩展笔记本功能，但日后出现什么功能设备不知道。
 * 定义一个规则，只要日后出现的设备都符合这个规则局可以了。
 * 规则在Java中就是接口
 */
//class Mouse
//{
//class BookPC
//{
//	public static void useMouse(Mouse m)
//	{
//		m.open();
//	}
//}

package JavaStudyDay9;
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useUSB(new UPan());//功能扩展
		useUSB(new UsbMouse());

	}
//使用规则
	public static void useUSB(USB u)//接口类型的引用，用于接收（指向）接口的子类对象
	{
		u.open();
		u.close();
	}

}
interface USB//暴露规则
{
	public void open();
	public void close();
}
//一年后
//实现的规则
// 降低了设备和电脑的耦合性降低
class UPan implements USB
{
	public  void open() {
		System.out.println("upan open");
	}
	public  void close() {
		System.out.println("upan close");
	}
}
class UsbMouse implements USB
{
	public  void open() {
		System.out.println("UsbMouse open");
	}
	public  void close() {
		System.out.println("Usbmouse close");
	}
}