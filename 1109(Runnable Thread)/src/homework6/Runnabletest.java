package homework6;

public class Runnabletest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("스레드 실행 시작");
		for(int i = 1 ; i <= 10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("스레드 종료");
	}
}
