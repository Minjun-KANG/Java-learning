package example4_6;

public class GarbageEx {

	public GarbageEx() {
		// ������ �����Ƽ� ������
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = new String("Good");
			String b = new String("Bad");
			String c = new String("Normal");
			String d, e;
			a = null; //������ �߻� a�� ����Ű�� Good��ü�� �������� ��.
			d = c; 
			c = null; //c�� ������� ������ ��.
			
			System.gc(); //��������ü�� ����޸𸮷� ��ȯ (�� ���ִ°�)
	}

}

