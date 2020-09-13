package example_static;

final class CL
{
	static int m=10;
	protected final void print()
	{
		System.out.println("FINAL");
	}
	public final static double PI = 3.14; //���ȭ
}

public class Main {
	
	
	public static void main(String[] args) {
		
		CL c = new CL();
		System.out.println(CL.m); //���Ͱ��� ��밡��
		System.out.println(c.m); //��ü�� �ʵ�(��ü�� �������)�ε� ��밡��
		//��ǥ������ Math�� ���δ� static���� �ۼ��Ǿ��־ ���Ͱ��� Math. ���� ����ϸ�ȴ�.
		
		//static �� Ŭ�����ε� �ÿ� ����� ���λ����ǰ� ���α׷��� ����� �� �������.
		//�̷��� �ð��� Ư�������� static method�� ������ ����.
		//static �޼ҵ�� non_static �ʵ� ���Ұ�
		//static �޼ҵ�� non_static �޼ҵ� ���Ұ�
		//static �޼ҵ�� this ���Ұ�
		//non_satatic �޼ҵ�� static ��밡�� 
		
		/*
		 final 
		 final�� ���� Ŭ������ ��ӺҰ�
		 final�� ���� �޼ҵ�� �������̵� �Ұ�
		 final�� ���� �ʵ�� �����.
		 * */
		
	}

}