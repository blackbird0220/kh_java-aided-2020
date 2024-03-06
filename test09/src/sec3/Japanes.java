package sec3;

public class Japanes implements Lunch  {


	@Override
	public void date(String day) {
		System.out.println(day);
		
	}
	
	@Override
	public void place(String location) {
		System.out.println(location+"에서");
		
	}
	
	@Override
	public void people(String who) {
		System.out.println(who+"와");
		
	}

	@Override
	public void make(String ingredients, String cook) {
		System.out.println(ingredients+"로 만들어진"+cook+"을 먹습니다.");
		
	
	}
}


/*void make(String ingredients,String sause, String cook);
void place(String indoor, String outdoor);
void date(String year, String month, String day);
void people(String who);

*
*
*
*final static String DRIVER = "org.mariadb.jdbc.Driver";
		final static String URL = "jdbc:mariadb://localhost";
		final static int PORT = 3308;
		final static String ID = "root";
		final static String PW = "1234";*/