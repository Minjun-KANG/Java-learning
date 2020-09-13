package example4_6;

public class GarbageEx {

	public GarbageEx() {
		// 생성자 귀찮아서 안지움
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = new String("Good");
			String b = new String("Bad");
			String c = new String("Normal");
			String d, e;
			a = null; //가비지 발생 a가 가르키던 Good객체는 가비지가 됨.
			d = c; 
			c = null; //c는 쓸모없는 변수가 됨.
			
			System.gc(); //가비지객체를 가용메모리로 반환 (걍 없애는거)
	}

}


