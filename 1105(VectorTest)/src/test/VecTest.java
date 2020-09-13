package test;
import java.util.Vector;



public class VecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>(10);
		System.out.println("벡터의 사이즈" + v.size());
		System.out.println("벡터의 사이즈" + v.capacity());
		
		for(int i = 0 ; i<10; i++)
		{
			v.add(i*10);
			System.out.println("벡터의 " + i + "번째 요소 = " +v.elementAt(i));
		}
		v.remove(3);
		for(int i = 0 ; i<v.size(); i++)
		{
			//v.add(i*10);
			System.out.println("벡터의 " + i + "번째 요소 = " +v.elementAt(i));
		}
		System.out.println("벡터의 사이즈" + v.lastElement());
	}

}
