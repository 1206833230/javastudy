/*
 * ������ͽӿڵ���ͬ�㣺
 * ��ͬ�㣺
 *     ���ǲ������ϳ�ȡ�����ġ�
 * ��ͬ�㣺
 *     1.��������Ҫ���̳У�����ֻ�ܵ��̳С�
 *       �ӿ���Ҫ��ʵ�֣����ҿ��Զ�ʵ�֡�
 *     2.��������Զ�����󷽷��ͳ��󷽷�������̳к󣬿���ֱ��ʹ�ó��󷽷���
 *       �ӿ���ֻ�ܶ�����󷽷�������������ȥʵ�֡�
 *     3.������ļ̳У���is a��ϵ���ڶ������ϵ�Ļ����������ݡ�
 *       �ӿڵ�����ʵlike a��ϵ���ڶ�����ϵ�Ķ��⹦�ܡ�
 *       
 *Ȯ�����ܷ֣���äȮ���ѱ�Ȯ��
 */
//abstract class Ȯ
//{
//	abstract void ���();
//}
//abstract class ��ä
//{
//	abstract void ��ä();
//}
//class ��äȮ extends Ȯ implements ��ä
//{
//	public void ���()
//	{
//		
//	}
//	public void ��ä()
//	{
//		
//	}
//}
//�ڲ�ͬ���������У��в�ͬ�ķ�����ʽ��
//ѧԱ��
/*
 * �ʼǱ����Ե�ʹ��
 * Ϊ����չ�ʼǱ����ܣ����պ����ʲô�����豸��֪����
 * ����һ������ֻҪ�պ���ֵ��豸�������������ֿ����ˡ�
 * ������Java�о��ǽӿ�
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
		useUSB(new UPan());//������չ
		useUSB(new UsbMouse());

	}
//ʹ�ù���
	public static void useUSB(USB u)//�ӿ����͵����ã����ڽ��գ�ָ�򣩽ӿڵ��������
	{
		u.open();
		u.close();
	}

}
interface USB//��¶����
{
	public void open();
	public void close();
}
//һ���
//ʵ�ֵĹ���
// �������豸�͵��Ե�����Խ���
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