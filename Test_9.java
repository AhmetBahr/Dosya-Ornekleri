import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test_9 {
//	VERÝ ADLI DOSYANIN ÝÇÝNDEKÝ DEÐERLERÝ TEK VE ÇÝFT ADLI DOSYALARA AKTARMA
	public static void main(String args []) throws FileNotFoundException {
		File f1 = new File("Veri.txt");
		
		File f2 = new File("Tek.txt");
		PrintWriter p1 = new PrintWriter(f2);
		
		File f3 = new File("Cift.txt");
		PrintWriter p2 = new PrintWriter(f3);
		
		Scanner scan = new Scanner(f1);
		
		while(scan.hasNextLine()) {
			int say = scan.nextInt();
			
			if(say%2 == 0) {
				p2.println(say);
			}
			else {
				p1.println(say);
			}
		}
		p1.close();
		p2.close();
	}	
}
