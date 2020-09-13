package homework5;

class GStack<T> {
	
	int tos;
	Object [] stck; //Generic을 파라미터로 받는 만큼, 어떤 값이 들어올지 몰라 Object type으로 래퍼런스 변수 생성
	
	public GStack() {
		tos = 0;
		stck = new Object [10]; //이도 위와같은 이유로 Object type으로 할당
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
		return t; //Object type stck객체를 강제타입캐스팅으로 (T)타입으로 변환다음 return;
	}
}
