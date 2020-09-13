package testpac;
public class CLdefault {

	private int a = 10;
	private int b = 20;
	public CLdefault() {
		System.out.println("default 에서 출력");
	}
	public CLdefault(int a)
	{
		System.out.println("메소드 오버로딩에 의한 결과");
	}
	protected void CLprotected()
	{
		int a= this.a;
		System.out.println("Protected");
		System.out.println("prtvate 변수 a = "+a);
		
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
