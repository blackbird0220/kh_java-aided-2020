package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {

	public static void main(String[] args) {
		List<Board> bList = new ArrayList<>();
		for(int i=1 ; i<10 ; i++) {
			Board board = new Board(i, "제목"+i, "내용", "글쓴이"+i, "2024-03-"+i, 50);
			bList.add(board);
		}
		for(Board b:b
				List) {
			System.out.println(b.toString());
		}
	}

}
