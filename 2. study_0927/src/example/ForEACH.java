package example;

enum Week {��,ȭ,��,��,��,��,��}
public class ForEACH {

	public ForEACH() {
		
		/* int Array[] = {1,2,3,4,5};
		int sum=0;
		for(int k : Array) //�ݺ��� ������ Array[0] , Array[1] ������ �ٲ� 
		{
			sum += k;
		}
		System.out.println(sum);*/
		
		/*String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" } ;
		for (String s : names) // �ݺ��� ������ s�� names[0], names[1], ..., names[5] �� ���� // ���ڿ��� ��������
		System.out.print(s + " ");*/
		
		
		for (Week day : Week.values()) { // �ݺ��� ������ day�� ��, ȭ, ��, ��, ��, ��, �Ϸ� ����
			System.out.print(Week.values() + "\t");
			System.out.println(day + "���� ");
		}
		/*�켱 enum�� Ŭ����ó�� ���̴� ����̴�. Ŭ�����ȿ��� �����Ϸ��� top_level�� �����϶�� ������ �߻��Ѵ�.*/
		/*���� Week.values()�� ���� ������� �� �ּҰ��� �߻��ϴ� ������ ���δ�.*/
	}
}
