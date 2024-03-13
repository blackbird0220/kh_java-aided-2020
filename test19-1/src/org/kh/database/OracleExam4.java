package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//delete from 테이블명 [where 필드명 = 값]: 테이블
public class OracleExam4 {

	public static void main(String[] args) {
		Connection con =null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(on/off)하고, sql 문장 실행
	

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		//String sql = "delete from student where no=?";
		//String sql = "delete from student where name=?";
		String sql = "delete from student where point=?";
		Student st = new Student(1, "김응원", 100);
		int i =0;

		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				//pstmt.setInt(1, st.getNo());
				//pstmt.setString(1, st.getName());
				pstmt.setInt(1, st.getPoint());
				i=pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"건이 성공적으로 처리되었습니다.");
				}
				else {
					System.out.println("처리 실패");
				}
			}
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
