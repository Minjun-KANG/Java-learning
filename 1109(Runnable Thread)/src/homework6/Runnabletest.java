package homework6;

public class Runnabletest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������ ���� ����");
		for(int i = 1 ; i <= 10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("������ ����");
	}
}