package example5_5;

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
	
	public static void main(String [] args) {
		
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Line(); // Line 객체 연결
		last = start;
		
		obj = new Rect();
		last.next = obj; // Rect 객체 연결
		last = obj;
		
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		
		obj = new Circle(); // Circle 객체 연결
		last.next = obj;
		// 모든 도형 출력
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}
	/*
	 *오버라이딩을 활용한 링크드리스트로 구성한 동적바인딩 
	 *
	 */
}