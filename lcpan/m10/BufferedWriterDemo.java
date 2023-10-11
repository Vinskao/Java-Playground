package lcpan.m10;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\testDir\\input.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("C:\\testDir\\output1.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				out.write(str);
				out.newLine();
			}			
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
