package JavaStudyDay10;

public class DuoTaiDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����ʦ x = new ����ʦ();
//		x.����();
//		x.����Ӱ();
		 ����ү x = new ����ʦ();
		 x.����();
		 x.����();
		 
		 ����ʦ y = new ����ʦ();
		 y.����Ӱ();
	}

}
class  ����ү
{
	void ����()
	{
		System.out.println("����");
	}
	void ����()
	{
		System.out.println("����");
	}
}
class ����ʦ extends ����ү
{
	void ����()
	{
		System.out.println("Java");
	}
	void ����Ӱ()
	{
		System.out.println("����Ӱ");
	}
}