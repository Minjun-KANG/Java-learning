package example5_5_1;

class Shape
{
	protected String name;
	public void paint()
	{
		draw();
	}
	public void draw()
	{
		System.out.println("Class is Shape - "+name);
	}
}
public class Circle extends Shape {
	protected String name; //name 두개여도, 클래스가 다르기때문에 ㄱㅊ. 접근지정자외 관계없음.
	
	//Overriding
	public void draw()
	{
		name = "Circle"; // 내클래스 name에 들어감
		super.name = "Shape";
		super.draw();
		System.out.println("Class is Circle - "+name);
	}
	public static void main(String[] args)
	{
		//name = "hello"; 스태틱에선, non_static 인 name을 사용하지 못한다. 
		Shape b = new Circle(); //업캐스팅으로 Shape type b래퍼런스 변수 생성하고 Cirle 할당
		b.paint(); // 업캐스팅 되었기 때문에 b는 Circle의 paint자체를 모름. 따라서 Shape class에 paint()실행,
		//Paint()가 실행되면서, draw()는 동적바인딩이 일어나여 메소드오버라이딩 한 Circle객체의 draw실행, name에 Circle을 넣는데,
		//나의 클래스인 name에 먼저 들어감(가장가까운). 이후, super.연산자를 통해 super클래스의 name에 Shape을 넣고, super.draw()하며 정적바인딩을 일으킴.
	}
}
