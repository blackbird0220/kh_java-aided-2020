package sec1;

public class AnimalExam {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		
		//Mammal m1 = new Animal(); //자식함수는 생성자함수가 될수없
		Mammal m2 = new Mammal(); //
		//Mammal m3 = new Birds();
		
		Animal a4;	//선언
		a4 = new Animal(); // Animal로 객체 생성
		a4.setName("호랑이");
		a4.setSpine(true);
		System.out.println(a4.print());

		
		a4 = new Mammal(); //Mammal로 객체 형변환
		//a4.setLegs(4);	// Animal a4; 로 선언되어 있기 때문
		System.out.println(a4.print());
		
		a4 = new Birds(); //Birds
		//a4.setWings(0);
		a4.setName("갈매기");
		System.out.println(a4.print());	
	
		//메소드 오버라이딩: 부모클래스로부터 상속받은 메소드를 다르게 구현
		//그러므로, 부모 클래스로 선언된 객체는 부모자신 또는 자식 생성자를 활용하여 다양하게 형변환 가능 =>다형성
		//클래스 =>캡슐화, 정보은닉, 다형성, 재사용성, 추상화(아직안배움 2/27일 수업함)
	}
}
