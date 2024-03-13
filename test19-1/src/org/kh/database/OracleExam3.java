package org.kh.database;
//20240313 3교시 수업
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//update 테이블명 set 필드명1= 값1[, 필드명2=값2, 필드명3=값3] [where 필드명= 값] :테이블 데이서에서 특정 조건 맞는 레코드의 데이터값을 변경한다.
public class OracleExam3 {

	public static void main(String[] args) {
		Connection con =null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(on/off)하고, sql 문장 실행
	

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "update student set point=?, name=?, where no=?";
		Student st = new Student(3, "유성환", 98);
		
		int i =0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,st.getPoint());
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getNo());
				i= pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는  SQL 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
