package homework5;

class GStack<T> {
	
	int tos;
	Object [] stck; //Generic�� �Ķ���ͷ� �޴� ��ŭ, � ���� ������ ���� Object type���� ���۷��� ���� ����
	
	public GStack() {
		tos = 0;
		stck = new Object [10]; //�̵� ���Ͱ��� ������ Object type���� �Ҵ�
	}
	
	public void push(T item) {
		if(tos == 10)
		{
			return;
		}
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {	
		if(tos == 0)
		{
			return null;
		}
		tos--;
		T t = (T)stck[tos];
		return t; //Object type stck��ü�� ����Ÿ��ĳ�������� (T)Ÿ������ ��ȯ���� return;
	}
}