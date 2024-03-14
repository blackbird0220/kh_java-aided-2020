package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.database.Student;



public class MariaDBExam2 {

	public static void main(String[] args) {
		Connection con =null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(on/off)하고, sql 문장 실행
		//왠만하면 Statement말고 PreparedStatement 쓰기
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		String sql = "insert into student values (?,?,?)";
		Student newSt = new Student(6, "kim", 95);
		List<Student> stList = new ArrayList<>();
		
		//MariaDB의 temp 데이터베이스의 student 테이블의 newSt의 내용을 레코드로 추가되도록
		//자바 프로그래밍을 완성하시오.
		
		
		Class.forName(driver);	
			
			
			
		/*} catch (ClassNotFoundException e) {
			
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();*/
		}
		

		
		
		
	}

}
