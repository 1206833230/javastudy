/*
 * ���Ӹ�����,��Ա�����֡�
 * 1.��Ա����
 * 2.
 * 3.���캯��
 * �������
 * ������ĳ�Ա�����ͱ���ͬ����this�����֡�
 * �������������Ա����ͬ����super���ָ��ࡣ
 * this���������������á�
 * super:����һ������Ŀռ䡣
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