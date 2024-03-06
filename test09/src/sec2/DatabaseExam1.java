package sec2;

public class DatabaseExam1 {
	public static void main(String[] args) {
		Database db;		//객체선언
		db = new Oracle();
		db.connect(Oracle.URL, Oracle.PORT+"", Oracle.ID, Oracle.PW);
		//int a =1004;
		//String b = ""+a 	//""+붙여주면 문자가 숫자됨
		db.select("board","where title like \'%'+알림+'\'");
		db.insert("board","\"제목10\'",10);
		
		System.out.println("\nMySQL");
		
		
		db = new Mysql();
		db.connect(Mysql.URL, Mysql.PORT+"", Mysql.ID, Mysql.PW);
		db.insert("board","\"제목11\'",11);
		
		
	}
}
