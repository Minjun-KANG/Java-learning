package example_5_6;
class Weapon {
	protected int fire() {
		return 1; // 무기는 기본적으로 한 명만 살상
	}
}
class Cannon extends Weapon {
	@Override
	protected int fire() { // 오버라이딩
		return 10; // 대포는 한 번에 10명을 살상
	}
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon(); 
		//이 때는 Cannon의 존재를 모르는 것
		//컴파일 때는 상속관계를 모르기 때문에 Weapon의 fire()가 실행이되고
		
		System.out.println("기본 무기의 살상 능력은 " +weapon.fire());
		weapon = new Cannon();
		//여기 부터는 상속관계를 업캐스팅하며 알았기 때문에, 오버라이딩함.
		System.out.println("대포의 살상 능력은 " +weapon.fire());
	}
}
