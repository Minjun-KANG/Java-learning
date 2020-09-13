package test;

class Weapon
{
	Weapon()
	{
		System.out.println("Weapon의 생성자 실행");
	}
	int fire()
	{
		System.out.println("Weapon fire의 실행");
		return 1;
	}
	void print(Weapon p)
	{
		System.out.println("나다!");
	}
	int fire2(int a)
	{
		System.out.println("Weapon fire의 실행"+a);
		return 10;
	}
}
class cannon extends Weapon
{
	cannon()
	{
		System.out.println("Cannon의 생성자 실행");
	}
	int fire()
	{
		System.out.println("Cannon fire의 실행");
		return 10;
	}
	double fire2(double a)
	{
		System.out.println("Cannon fire의 실행"+a);
		return 3.4;
	}
}
public class test {

	public static void main(String[] args) {
		
		Weapon p;
		p = new Weapon(); // p를 할당
		System.out.println(p.fire());
		//이 때는 Cannon의 존재를 모르는 것
		//컴파일 때는 상속관계를 모르기 때문에 Weapon의 fire()가 실행이되고
		
		p = new cannon(); // 업캐스팅 따라서 p는 cannon clase의 멤버를 사용못함
		System.out.println(p.fire());
		//여기부턴 실행되면서, 상속관계를 업캐스팅하며 알았기 때문에, 오버라이딩함.
		
		p = (Weapon)p; // 다시 다운캐스팅 p는 이떄 cannon에서 강제형변환하여 Weapon으로 다운캐스팅 됬고, 
		// 이때는 이미 다운캐스팅하며 실행과정에서 상속관계를 알고 있기 오버라이딩된 fire을 출력함.
		System.out.println(p.fire());
		
		
		
		
	}

}
