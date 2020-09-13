package example;

class Shape { // 슈퍼 클래스
	public Shape next;
	public Shape() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { // static method는 non_static 멤버나 메소드를 사용이 불가한데, 클래스 래퍼런스 변수이므로 사용가능 그리고 전부다 업캐스팅됨.
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출.
		// 동적 바인딩 - 넘어오는 인자에 따라 바꿔호출
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}