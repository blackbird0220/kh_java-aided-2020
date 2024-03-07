package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
//d:\\kew\\java202003\\a.txt
	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");	//현재 디렉토리에 파일이 있든 없든 파일 객체 생성
		File f2 = new File("../sec1/a.txt"); 
		//현재 패키지(디렉토리)는 sec0인데 상위 디렉토리로 이동하여 sec1디렉토리의 a.txt의 파일 객체를 생성
		File f3 = new File("d: "+File.separator+"kew"+File.separator+"java202003"+File.separator+"a,txt"); 
		String path = "d:\\kew\\java202003";
		File f4 = new File(path,"a.txt");
		File f5 = new File("d:\\kew\\java202003","a.txt");

		
	}

}
