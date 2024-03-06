package sec1;


//	class는 추가 가능하지만 클래스 앞에 public은 사용불가능, 주인공은 한개여야 함

 class Animal {
	private String type;
	private String name;
	private int leg = 4; 
	private int wing = 0;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	@Override
	public String toString() {
		return "Aniaml [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
	public void print() {
		System.out.println(this);
	}
}

public class AnimalExam1 {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		ani1.setType("포유류");
		ani1.setName("호랑이");
		ani1.setLeg(4);		
		ani1.setWing(0);
		
		ani1.print();
	
	/*Birthday birth1 = new Birthday();
		birth1.setName("김응원");
		birth1.setYear(1988);
		birth1.setMonth(2);
		birth1.setDay(20);
		birth1.birth();
		birth1.birthAddr();*/
		
	}
}