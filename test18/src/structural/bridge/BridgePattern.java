package structural.bridge;
//추상화를 구현으로부터
//Bridge(Color)를 특정 추상화 클래스(Shape)에 멤버로 기용하고, 서브 클래스(Triangle, Pentagon)에서 
//해당 색상을 골라 서로 다른 클래스 를 조합하여 원래보다 더큰 객체를 구현할 수 있도록 하는 패턴
public class BridgePattern {

	public static void main(String[] args) {
		Shape triangle1 = new Triangle(new RedColor());
		Shape pentagon1 = new Pentagon(new GreenColor());
		Shape triangle2 = new Triangle(new GreenColor());
		Shape pentagon2 = new Pentagon(new RedColor());

		triangle1.applyColor();
		triangle2.applyColor();
		pentagon1.applyColor();
		pentagon2.applyColor();
	}

}
