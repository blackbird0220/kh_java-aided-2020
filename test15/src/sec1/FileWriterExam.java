package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException{
		File file = new File("e.txt");
		if(file.exists()) {
			file.createNewFile();
		}
		BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));
		fw.write("졸리다");
		fw.newLine();
		fw.write("집에 가고 싶어");
		fw.newLine();
		fw.write("집에 가서 안 나오고 싶어");
	}

}
