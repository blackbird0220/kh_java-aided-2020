package sec1;

interface Matrial {
	void doPrinting(); //기능구현 못함
}
class Powder implements Matrial{

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다");
	}
	public String toString() {
		return "Powder";
		
	}
}
class Plastic implements Matrial {

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다");
		
	}
	public String toString() {
		return "Plastic";
	
	}
}

//T extends Matrial=>제너릭의 한정자

class GenericPrint<T extends Matrial> {
	private T matrial;
	public GenericPrint() {}
	public GenericPrint(T matrial) {
		this.matrial = matrial;
	}

	public void setMatrial(T matrial) {
		this.matrial = matrial;
	}

	@Override
	public String toString() {
		return "GenericPrint [matrial=" + matrial + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
public class GenericExam3 {

	public static void main(String[] args) {
		Plastic p1 = new Plastic();
		p1.doPrinting();
		GenericPrint<Print>(T matrial){
			super();
			
		}

	}

}
