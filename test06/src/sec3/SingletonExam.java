package sec3;

public class SingletonExam {

	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();
		Singleton ins3 = Singleton.getInstance();
		Singleton ins4 = Singleton.getInstance();
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
		System.out.println(ins4);
		//System.out.println(ins1==ins2==ins3==ins4); ==는 항2개밖에 못사용함 4개 안됨
		System.out.println(ins2==ins3);
		System.out.println((ins1==ins2)+":"+(ins1==ins4));
		
	}
	/* ins값을 몇개를 만들어도 sec3.Singleton@48140564
						sec3.Singleton@48140564
						true							로 같은 값이 나옴*/

}
