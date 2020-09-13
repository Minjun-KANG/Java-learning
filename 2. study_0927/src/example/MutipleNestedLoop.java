package example;
import java.util.Scanner;

public class MutipleNestedLoop {
	
	public MutipleNestedLoop() {
		System.out.print("몇 단?");
		Scanner scanner = new Scanner(System.in); //scanner 래퍼런스 객체를 하나 만듦과 동시에 객체를 연결함.
		int n = scanner.nextInt();
		
		for(int i = n; i<=n; i++)
		{
			for(int j=1; j<10; j++) {
				System.out.print(i +"x"+ j +"="+i*j+"\t");
			}
			System.out.println();
		}
		scanner.close();
		
	}

}
