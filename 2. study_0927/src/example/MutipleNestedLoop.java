package example;
import java.util.Scanner;

public class MutipleNestedLoop {
	
	public MutipleNestedLoop() {
		System.out.print("�� ��?");
		Scanner scanner = new Scanner(System.in); //scanner ���۷��� ��ü�� �ϳ� ����� ���ÿ� ��ü�� ������.
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