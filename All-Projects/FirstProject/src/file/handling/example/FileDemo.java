package file.handling.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String fn = sc.next();
		sc.nextLine();
		File f = new File("C:\\Users\\user\\Downloads\\Meow\\"+fn+".txt");
//		System.out.println(f.createNewFile());
//		f.delete();
		f.deleteOnExit();
//		System.out.println(f.exists());
		f.getParentFile().mkdirs();
		if (!f.exists()) f.createNewFile();
		
//		FileOutputStream fos = new FileOutputStream(f);
//		String s = sc.nextLine();
//		for (int i=0; i<s.length(); i++) fos.write(s.charAt(i));
//		fos.close();

		FileWriter fw = new FileWriter(f);
		fw.write(sc.nextLine());
		fw.close();
		
//		FileInputStream fis = new FileInputStream(f);
//		int count;
//		while((count = fis.read()) != -1) System.out.print((char) count);
//		System.out.println();
//		fis.close();
		
		sc = new Scanner(f);
		System.out.println(sc.nextLine());
	}
}
