package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//insert into 테이블명[(필드명1, 필드명2, ...)] values(값1, 값2....) :테이블에 레코드를 추가
public class OracleExam2 {
	public static void main(String[] args) {
		Connection con =null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(on/off)하고, sql 문장 실행
	

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)";
		Student st = new Student(6, "조대신", 90);
		
	
		int i = 0;
	
	
		try {
			Class.forName(driver); //드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw);//연결
				pstmt = con.prepareStatement(sql);//전원on
				pstmt .setInt(1, st.getNo());//쿼리 옵션 추가
				pstmt .setString(2, st.getName());
				pstmt .setInt(3, st.getPoint());
				i = pstmt.executeUpdate(); //executeUpdate()는 commit 명령이 입력되어 변화가 있을 때 사용함
				//insert delete update는 반드시 commit이 필요하므로 executeUpdate()메소드로 실행해야 함
				if(i>0) {
					System.out.println(i+ "건이 성공적으로 처리 되었습니다.");
				} else {
					System.out.println("SQL구문 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터 베이스 연결 실패 또는 SQL구문 실행 실패");
				e.printStackTrace();
			} 
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(pstmt != null ) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null ) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}	
		}
	}
}
