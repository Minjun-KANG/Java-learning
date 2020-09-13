package testpac;
import testpac2.hello2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Class에서 출력");
		CLdefault a = new CLdefault();
		CLdefault b = new CLdefault(10);
		b.CLprotected();
		// b.CLprivate(); 접근지정자가 private이라 출력안됨.
		b.hello(); // hello라는 default메소드로 private 메소드를 호출
		hello2 c = new hello2();
		c.CLprotected();
		// CLprotected는 testpac 패키지에 있는 메소드인데, c는 hello2를 담고있는 변수이고, hello2 클래스는 CLdefault를 상속했기 때문에
		// 사용할 수 있는 거는 protected type의 CLdefault 밖에 없다.
		//한마디로 아주 난장판인 패키지와 난장판인 코드다.
	}
	

}


/*
패키지 - Class를 저장하는 디렉터리
자바의 접근 지정자
private, protected, public defualt(접근지정자 생략하면 자동으로 추가)

private은, 외부로부터 완벽차단
default는, 동일패키지에만 허용
protected는 동일 패키지와 자식클래스까지 허용
public은 모든허용
*/