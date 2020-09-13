package ex6_1;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return getClass().getName() + "#" + hashCode();
	} //Integer.toHexString을 빼고 hashcode를 진행함. 오버라이딩함
}

public class ObjectPropertyEx {
	
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // 클래스 이름
		System.out.println(obj.hashCode()); // 해시 코드 값
		System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
		System.out.println(obj); // 객체 출력
	}
		
	public static void main(String [] args) {
		Point p = new Point(2,3);
		print(p);
	}
}
//패키지 - 클래스 이름이 겹칠 우려 -> 따라서 모듈이라는 개념등장
//모듈 -> 패키지나 이미지를 보관
//toString은, 객체를 문자열로 변환한다. 이때, return getClass().getName() + "@" + Integer.toHexString(hashcode()); 가 원형이다.
//print 메소드에서는, 파라미터로 Object 타입을 받는데, 이는 최상위 수퍼클래스로 자동 업캐스팅을 불러오게끔 한다.