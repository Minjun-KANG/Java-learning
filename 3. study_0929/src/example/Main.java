package example;
import java.util.Scanner;
public class Main {
	//public Main() {}
	//사실 class Main이라고 생성하던 것도 C에의한 어폐 였으며,
	//Main 클래스에 대한 기본생성자를 컴파일러가 위와같이 자동생성하고 있었다. 밑에 public static void main이 test 클래스 속에 있는 main문인 것이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Circle pizza = new Circle();
		pizza.name = "자바피자";
		pizza.radius = 10;
		double area = pizza.getArea();
		System.out.println("pizza의 이름은 : "+pizza.name+" pizza의 면적은 "+area);
		*/
		
		/*Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();*/
		
		
	}

}
/*
클래스 내용정리
객체는 붕어빵이고 클래스는 붕어빵틀이다.
유전적 상속처럼 생물이란 SUPER클래스에는, 동물, 식물이라는 SUB클래스가 존재한다.

오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의 해서 사용한다.

생성자
생성자는 메소드이다.
또한 생성자의 이름은 클래스이름과 동일해야한다. 이는 Circle pizza = new Circle(); 에서도 볼 수 있다. 
이게 Circle의 래퍼런스 변수 pizza를 생성(Circle 객체생성)하며, new로 할당하는데, Circle의 생성자에 의해 할당하는 것이다.
또한 생성자는 오버로딩에 의해 여러개 생성할 수 있다.
또한 모든 생성자의 타입은 void라서, return 타입이 없다. 
또한 디폴트 생성자를 자동생성하는데, 사용자가 메소드오버로딩으로 만든 생성자가 있다면, 디폴트생성자를 생성하지 않는다.

this 레퍼런스
this는 클래스의 멤버변수(필드)와, 메소드의 변수들의 이름이 겹칠 때 사용한다.


*/