package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDB {
	String driver = "oracle.jdbc.driver.OracleDriver";	//ojdbc8.jar
	String url = "jdbc:oracle:thin:@localhost:1521:xe";//맞는지 틀린지 검증할 수 있어야 함. 정식버전은 xe아니고 orcl임
	String userid = "system";
	String userpw = "1234";//IDE(ex)MySQL 바꿀때 이거 네개만 바꾸면 됨
	
	Connection con = null;
	PreparedStatement pstmt = null;

	public Connection connect()  {
		try{ 
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, userpw); //연결
			//con(연결) -> pstmt (전원 on) -> rs(SQL실행)
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public void close(Connection con) {
		try {
			if(con != null) {
				con.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			 {
			if(pstmt !=null) {
				pstmt.close();
			}
		}if(con !=null) {
			con.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs !=null) {
				rs.close();
			}
			if(pstmt !=null) {
				pstmt.close();
			}
			if(con !=null) {
			con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}