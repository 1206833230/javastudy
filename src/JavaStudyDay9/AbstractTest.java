 /*
  * ��Աʵ����
  * ���󣺹�˾�г���Ա�����������š�нˮ���������ݡ�
  * ��Ŀ������������������š�нˮ���������ݡ����н���
  * �Ը��������ݽ������ݽ�ģ��
  * 
  * ������
  * ��������������У����ҳ��漰�Ķ���
  * ͨ������������
  * ����Ա��
  *  ���ԣ����������š�нˮ��
  *  ��Ϊ��������
  * ��Ŀ����
  *  ���ԣ����������š�нˮ������
  *  ��Ϊ��������
  * ����Ա�;�������ֱ�Ӽ̳й�ϵ��
  * ���ǳ���Ա�;���ȴ���й������ݡ�
  * ���Խ��г�ȡ����Ϊ���Ƕ��ǹ�˾�Ĺ�Ա��
  * ���Խ�����Ա�;�����г�ȡ��������ϵ��
  */

package JavaStudyDay9;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//��������Ա
abstract class Employee
{
//	private String name;
//	private String id;
//	private double pay;
	Employee(String name, String id,double pay)
	{
//		this.name = name ;
//		this.id = id;
//		this.pay = pay;
//		
	}
	public abstract void work();
}
//��������Ա
class Programmer extends Employee 
{
	Programmer(String name,String id,double pay)
	{
		super(name,id,pay);
		
	}
	public void work()
	{
		System.out.println("code...");
		
	}
}
//������Ŀ����
class Manger extends Employee
{
//	private int bonus;
	Manger(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
//		this.bonus = bonus;
	}
	public void work()
	{
		System.out.println("manage...");
	}
}
