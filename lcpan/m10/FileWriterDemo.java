package lcpan.m10;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			// append data
			FileWriter fw =	new FileWriter("C:\\testDir\\output.txt", true);
			fw.write("This is a test!\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
