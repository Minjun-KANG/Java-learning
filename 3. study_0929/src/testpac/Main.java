package testpac;
import testpac2.hello2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Class���� ���");
		CLdefault a = new CLdefault();
		CLdefault b = new CLdefault(10);
		b.CLprotected();
		// b.CLprivate(); ���������ڰ� private�̶� ��¾ȵ�.
		b.hello(); // hello��� default�޼ҵ�� private �޼ҵ带 ȣ��
		hello2 c = new hello2();
		c.CLprotected();
		// CLprotected�� testpac ��Ű���� �ִ� �޼ҵ��ε�, c�� hello2�� ����ִ� �����̰�, hello2 Ŭ������ CLdefault�� ����߱� ������
		// ����� �� �ִ� �Ŵ� protected type�� CLdefault �ۿ� ����.
		//�Ѹ���� ���� �������� ��Ű���� �������� �ڵ��.
	}
	

}


/*
��Ű�� - Class�� �����ϴ� ���͸�
�ڹ��� ���� ������
private, protected, public defualt(���������� �����ϸ� �ڵ����� �߰�)

private��, �ܺηκ��� �Ϻ�����
default��, ������Ű������ ���
protected�� ���� ��Ű���� �ڽ�Ŭ�������� ���
public�� ������
*/