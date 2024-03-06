package sec1;

public class BirthdayExam1 {

	public static void main(String[] args) {
		Birthday birth1 = new Birthday();
		birth1.setName("김응원");
		birth1.setYear(1988);
		birth1.setMonth(2);
		birth1.setDay(20);
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth1.setName("아무개");
		birth1.setYear(1999);
		birth1.setMonth(02);
		birth1.setDay(21);
		birth1.birth();
		birth1.birthAddr();
	}

}
