package example;

class Shape { // ���� Ŭ����
	public Shape next;
	public Shape() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { // static method�� non_static ����� �޼ҵ带 ����� �Ұ��ѵ�, Ŭ���� ���۷��� �����̹Ƿ� ��밡�� �׸��� ���δ� ��ĳ���õ�.
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��.
		// ���� ���ε� - �Ѿ���� ���ڿ� ���� �ٲ�ȣ��
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