package test;

class Weapon
{
	Weapon()
	{
		System.out.println("Weapon�� ������ ����");
	}
	int fire()
	{
		System.out.println("Weapon fire�� ����");
		return 1;
	}
	void print(Weapon p)
	{
		System.out.println("����!");
	}
	int fire2(int a)
	{
		System.out.println("Weapon fire�� ����"+a);
		return 10;
	}
}
class cannon extends Weapon
{
	cannon()
	{
		System.out.println("Cannon�� ������ ����");
	}
	int fire()
	{
		System.out.println("Cannon fire�� ����");
		return 10;
	}
	double fire2(double a)
	{
		System.out.println("Cannon fire�� ����"+a);
		return 3.4;
	}
}
public class test {

	public static void main(String[] args) {
		
		Weapon p;
		p = new Weapon(); // p�� �Ҵ�
		System.out.println(p.fire());
		//�� ���� Cannon�� ���縦 �𸣴� ��
		//������ ���� ��Ӱ��踦 �𸣱� ������ Weapon�� fire()�� �����̵ǰ�
		
		p = new cannon(); // ��ĳ���� ���� p�� cannon clase�� ����� ������
		System.out.println(p.fire());
		//������� ����Ǹ鼭, ��Ӱ��踦 ��ĳ�����ϸ� �˾ұ� ������, �������̵���.
		
		p = (Weapon)p; // �ٽ� �ٿ�ĳ���� p�� �̋� cannon���� ��������ȯ�Ͽ� Weapon���� �ٿ�ĳ���� ���, 
		// �̶��� �̹� �ٿ�ĳ�����ϸ� ����������� ��Ӱ��踦 �˰� �ֱ� �������̵��� fire�� �����.
		System.out.println(p.fire());
		
		
		
		
	}

}