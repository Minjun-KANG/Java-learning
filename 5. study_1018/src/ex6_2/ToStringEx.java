package ex6_2;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

}

public class ToStringEx {

	public static void main(String [] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); // p는 p.toString()으로 자동 변환
		System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
	}

}

/*
 * 접근지정자
 * public -모든거 다가능
 * protected - 다른 패키지에서 protected로 선언한 클래스를 상속받은 경우까지 
 * default - 패키지까지(해당 메소드)
 * private 같은 클래스(같은 공간)
 */
