package example_5_6;
class Weapon {
	protected int fire() {
		return 1; // ����� �⺻������ �� ���� ���
	}
}
class Cannon extends Weapon {
	@Override
	protected int fire() { // �������̵�
		return 10; // ������ �� ���� 10���� ���
	}
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon(); 
		//�� ���� Cannon�� ���縦 �𸣴� ��
		//������ ���� ��Ӱ��踦 �𸣱� ������ Weapon�� fire()�� �����̵ǰ�
		
		System.out.println("�⺻ ������ ��� �ɷ��� " +weapon.fire());
		weapon = new Cannon();
		//���� ���ʹ� ��Ӱ��踦 ��ĳ�����ϸ� �˾ұ� ������, �������̵���.
		System.out.println("������ ��� �ɷ��� " +weapon.fire());
	}
}