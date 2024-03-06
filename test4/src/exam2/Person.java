package exam2;

public class Person {
	private String name;
	private int age;
	private int gender;
	private boolean isMarried;
	private int childAmount;

	public Person(String name, int age, short gender, boolean isMarried, short childAmount) {		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isMarried = isMarried;
		this.childAmount = childAmount;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildAmount() {
		return childAmount;
	}
	public void setChildAmount(int childAmount) {
		this.childAmount = childAmount;
	}

	public void print () {
		System.out.println("이 사람의 나이 :"+ age);
		System.out.println("이 사람의 이름 :"+ name);
		System.out.println("이 사람의 결혼여부 :"+ isMarried);
		if(isMarried) {
			System.out.println("기혼\n");
		} else System.out.println("미혼\n");
	}
	
}
