package test;
import java.util.Vector;



public class VecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(10);
		System.out.println("������ ������" + v.size());
		System.out.println("������ ������" + v.capacity());
		
		for(int i = 0 ; i<10; i++)
		{
			v.add(i*10);
			System.out.println("������ " + i + "��° ��� = " +v.elementAt(i));
		}
		v.remove(3);
		for(int i = 0 ; i<v.size(); i++)
		{
			//v.add(i*10);
			System.out.println("������ " + i + "��° ��� = " +v.elementAt(i));
		}
		System.out.println("������ ������" + v.lastElement());
	}

}
