/*
 * �쳣����������ʱ�����Ĳ����������
 * ��Java���������ʽ�Բ�����������������ͷ�װ��
 * 
 * ����������������׳��쳣�ࡣ
 * 
 * ��ǰ�������̴�������⴦��������ϡ�
 * ���ڽ��������̴�������⴦�������룬����Ķ��ԡ�
 * 
 * ��ʵ�쳣����Javaͨ����������˼�뽫�����װ���˶���
 * ���쳣��������������
 * ��ͬ�������ò�ͬ���������������������Խ�磬��ָ��ȵȡ�
 * ����ܶ࣬��ζ��������Ҳ�ܶ࣬
 * �����Խ������ϳ�ȡ���γ����쳣��ϵ��
 * 
 * �������⣨������������ͷ�Ϊ�����ࣺ
 * Throwable��������error�������쳣���⣬���ⷢ���Ϳ���
 * �õ���֪��������Throwable�����������ࡣ
 * �����ԣ�����throws����throw�ؼ������ε���Ͷ��󶼾߱������ԡ�
 * 
 * 1.һ�㲻�ɴ���ģ�Error
 * �ص㣺����jvm�׳������������⡣
 *      �������ⷢ��һ�㲻����Դ���ֻ���޸ġ�
 * 2.�ɴ���ģ�Exception
 * 
 */

package JavaStudyDay13;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[3];
//		arr = null;
//		System.out.println(arr[3]);
		sleep(-5);
//		int[] arr2 = new int[1024*1024*800000];

	}

	public static void sleep(int time)
	{

		if(time<0)
		{
//			����취;
			/*throw*/new FuTime();//ʱ��Ϊ������������а����ŵ���������ơ���Ϣ��λ�õ���Ϣ��
		}
		if(time>1000)
		{
//			����취;
			/*throw*/new BigTime();
		}
		System.out.println("��˯������"+time);
	}
}
class FuTime
{
	
}
class BigTime
{
	
}