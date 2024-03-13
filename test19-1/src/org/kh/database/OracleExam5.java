package org.kh.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam5 {

	public static void main(String[] args) {
		Connection con =null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(on/off)하고, sql 문장 실행
		ResultSet rs = null;	//검색(select문 )의 결과를 반환받음
		String sql = "select * from student";
		
		int i = 0;
		OracleDB oracle = new OracleDB();
		List<Student> stList = new ArrayList<>();
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
				stList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			oracle.close(rs, pstmt, con);
		}

		for(Student s:stList) {
			System.out.println(s.toString());
		}
	
		con = null;
		pstmt = null;
		Student std = new Student(8,"배곤희", 95);
		sql = "insert into student(no, name, point) values(?,?,?)";
	
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  std.getName());
			pstmt.setInt(2, std.getNo());
			pstmt.setInt(3, std.getPoint());
			
			i = pstmt.executeUpdate();
			
			if(i>0) {
				System.out.println(i+"건이 정상적으로 처리되었습니다.");
			} else {
				System.out.println("SQL 처리 오류");
			}
		} catch (SQLException e) {
			System.out.println("SQL구문 오류");
			e.printStackTrace();
		} finally {
			oracle.close(pstmt, con);
		}

		
		
		con = null;
		pstmt = null; //null 처리 습관적으로 해두기. 그래야 오류가 잘 안남
		std = new Student (6,"조빈",100);
		sql = "update student set name=?, point=? where no=?";
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  std.getName());
			pstmt.setInt(2, std.getPoint());
			pstmt.setInt(3, std.getNo());
			i=pstmt.executeUpdate();
			
		if(i>0) {
			System.out.println("SQL처리 성공");
		}else {
			System.out.println("처리 성공");
			
		} catch (SQLException e) {
			System.out.println("SQL구문 오류");
			e.printStackTrace();
		} 
		
		
		//delete
		con =null;
		pstmt = null;
		int bun = 4;
		sql = "delete from student where no=?";
		
		con= oracle.connect();
		
		}
		}
	}
		
		
		
		
		
		

















