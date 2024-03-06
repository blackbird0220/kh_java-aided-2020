package sec3;

public class People {
	public static int selNum = 100;	// 고유번호	
	//static(정적필드) 을 넣으면 변수의 메모리가 공유되어 공유데이터가 된다. 밑에값을 바꾸면 다 바뀜
	public String name;		//이름
	public int age;		//나이
	public String addr; 	//주소
	
	public void print1() {
		System.out.println("selNum : "+this.selNum);
		System.out.println("name : "+this.name);
		
		
	public static void print() {
		System.out.println("name : 아무개");
		System.out.println("age : 28");	
	}
}
