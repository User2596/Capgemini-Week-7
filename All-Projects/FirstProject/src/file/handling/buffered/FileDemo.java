package file.handling.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\Downloads\\text.txt");
		if (!f.exists()) f.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		
		System.out.println("Enter File Content(End with \\): ");
		String str;
		while (!(str = sc.nextLine()).equals("\\")) {
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}

}
