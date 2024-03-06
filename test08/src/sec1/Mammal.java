package sec1;
//상속        Animal (부모클래스)    Mammal (자식클래스)
public class Mammal extends Animal { // extends Animal =>Animal클래스에서 상속받음 /재사용가능
	private int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	@Override
	public String print() {
		return "Mammal leg=" + leg + "], name=["+super.getName() +"]";
	}
}
