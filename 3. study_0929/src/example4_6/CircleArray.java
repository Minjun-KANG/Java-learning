package example4_6;

class Circle { //���� public�� ���� Ÿ�Կ��� ����ϰ�����, public class�� ������, Circle.java ������ ������ �����ؾ��Ѵ�.
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5]; //c�� �迭5���� ����ϴµ�, �� �迭�� Circle ���۷������� �����ϴ� 5���� �迭�̴�.
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i); //�� ���� 5���� �迭���� ���� ���۷����� �����Ѵ�.
		
		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " "); //�����ڿ��� return�� doubleŸ������ ������, int�� ���⼭ ����Ÿ��ĳ������.
	}
}