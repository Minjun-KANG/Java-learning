package homework6;

import java.util.Scanner;

public class Threadtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in); 
		
		Runnable r = new Runnabletest();
		Thread th = new Thread(r); 
		//Runnable ��ü�� start �޼ҵ尡 ����, Thread ��ü�� �����ϸ� ���ڷ� �ѱ�
		
		System.out.print("�ƹ�Ű�� �Է� : ");
		input = sc.next();
		sc.close();
		
		if(input != null)
		{
			th.start();
		}
		
	}

	

}

