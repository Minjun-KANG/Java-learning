package testpac;
public class CLdefault {

	private int a = 10;
	private int b = 20;
	public CLdefault() {
		System.out.println("default ���� ���");
	}
	public CLdefault(int a)
	{
		System.out.println("�޼ҵ� �����ε��� ���� ���");
	}
	protected void CLprotected()
	{
		int a= this.a;
		System.out.println("Protected");
		System.out.println("prtvate ���� a = "+a);
		
	}
	private void CLprivate()
	{
		System.out.println("private");
	}
	void hello()
	{
		CLprivate();
	}
	//@SuppressWarnings("unused")
	

}