package org.kh.database2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.kh.database.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		Connection con =null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(on/off)하고, sql 문장 실행
		ResultSet rs = null;	//검색(select문 )의 결과를 반환받음

		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student updSt = new Student(3, "park", 88);
		String sql = "update student set name=?, point=?, where no=?";
		//MariaDB의 temp 데이터베이스의 student 테이블3번 학생의 데이터를 updSt의 내용으로
		//레코드가 변경될 수 있도록 자바 프로그래밍을 완성하시오.
		List<Student> stList = new ArrayList<>();

	}

}
