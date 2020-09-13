package example_static;

final class CL
{
	static int m=10;
	protected final void print()
	{
		System.out.println("FINAL");
	}
	public final static double PI = 3.14; //상수화
}

public class Main {
	
	
	public static void main(String[] args) {
		
		CL c = new CL();
		System.out.println(CL.m); //위와같이 사용가능
		System.out.println(c.m); //객체의 필드(객체의 멤버변수)로도 사용가능
		//대표적으로 Math는 전부다 static으로 작성되어있어서 위와같이 Math. 으로 사용하면된다.
		
		//static 은 클래스로딩 시에 멤버가 전부생성되고 프로그램이 종료될 때 사라진다.
		//이러한 시간적 특성때문에 static method는 제약이 있음.
		//static 메소드는 non_static 필드 사용불가
		//static 메소드는 non_static 메소드 사용불가
		//static 메소드는 this 사용불가
		//non_satatic 메소드는 static 사용가능 
		
		/*
		 final 
		 final로 만든 클래스는 상속불가
		 final로 만든 메소드는 오버라이딩 불가
		 final로 만든 필드는 상수임.
		 * */
		
	}

}
