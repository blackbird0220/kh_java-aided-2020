package sec3;
//알아서 써보세요~
public class LunchExam {
	public static void main(String[] args) {

		Lunch lunch;
		
		
		System.out.println("한식");
		lunch = new Korean();
		lunch.date("2024. 02. 05");
		lunch.place("광화문 장안문");
		lunch.people("친구들");
		lunch.make("돼지고기","\t돼지갈비");
	/*
		System.out.println("중식");
		lunch = new Korean();
		lunch.date("2024. 02. 05");
		lunch.place(null);
		lunch.people(null);
	
	
		System.out.println("일식");*/
	
	
	
	}
}