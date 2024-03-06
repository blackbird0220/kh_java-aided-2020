package exam;

public class CalorieExam {

	public static void main(String[] args) {
		int calorie, protein, carbohydrate, fat
		Scanner sc = new Scanner(System.in);
		System.out.println("단백질 : ");
		protein = sc.nextInt();
		
		System.out.println("단백질 : ");
		carbohydrate = sc.nextInt();
		
		System.out.println("단백질 : ");
		fat = sc.nextInt();
		
		cal = (protein*4 + carbohydrate*4 + fat*4);
		System.out.println("칼로리 : ");
	}
}
