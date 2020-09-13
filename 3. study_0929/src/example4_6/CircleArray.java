package example4_6;

class Circle { //나중 public과 같은 타입에서 언급하겠지만, public class로 명명시, Circle.java 파일을 별도로 구비해야한다.
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
		c = new Circle[5]; //c에 배열5개를 등록하는데, 그 배열은 Circle 래퍼런스값을 저장하는 5개의 배열이다.
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i); //위 만든 5개의 배열마다 각각 래퍼런스를 연결한다.
		
		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " "); //생성자에서 return은 double타입으로 되지만, int로 여기서 강제타입캐스팅함.
	}
}
