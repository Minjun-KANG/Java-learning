package homework6;

import java.util.Scanner;

public class Threadtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in); 
		
		Runnable r = new Runnabletest();
		Thread th = new Thread(r); 
		//Runnable 객체는 start 메소드가 없어, Thread 객체를 생성하며 인자로 넘김
		
		System.out.print("아무키나 입력 : ");
		input = sc.next();
		sc.close();
		
		if(input != null)
		{
			th.start();
		}
		
	}

	

}


