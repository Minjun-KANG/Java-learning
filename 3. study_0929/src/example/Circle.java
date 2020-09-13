package example;

public class Circle {
	
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
	//System.out.println("heelo"); 위와 같이 클래스에 어떠한 행동을 넣게되면 불가능하다.
	//무조건적으로 class는 state와 behavior로 구성이 되는데, 이는 state영역에 behavior를 넣은 것으로 추정된다.
	
	public Circle() { } // 원의 생성자
	
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	

}
