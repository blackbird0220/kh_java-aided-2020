package sec1;

class Point<T, V>{//좌표점 제너릭
	T x;
	V y;
	
	public Point() {}
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}


public class GenericExam4 {
//제너릭 메소드: 해당 클래스에 메소드로 반환타입에 관계없이 활용할 수 있는 메소드
//Public <인자1, 인자2> 반환타입 메소드명(매개변수타입 매개변수,...){}
	public static void main(String[] args) {
	
	}
}
