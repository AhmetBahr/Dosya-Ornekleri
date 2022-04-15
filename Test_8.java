import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// DOSYA ÝÇÝNE RAMDOM 100 SAYI GÝRÝLÝYO ASAL OLANALR AYRÝYETTEN BAÞKA BÝ DOSYAYA YAZILIYOR

public class Test_8 {
	public static void main(String args []) throws FileNotFoundException {
		File f1 = new File("Deneme.txt");
		PrintWriter pp= new PrintWriter(f1);
		
		File f2 = new File("ASAL.txt");
		PrintWriter p = new PrintWriter(f2);
		
		for(int i=0;i<100;i++) {
			int a = (int)(Math.random()*100);
			
			pp.println(a);
			
			if(asalmi(a) == false) {
				p.println(a);
			}	
		}
		p.close();
		pp.close();
	}
	static boolean asalmi(int a) {
		int i;
		
		for(i=2;i<a;i++) {
			if(a%i == 0) {
				return true;
			}
		}
		return false;
	}
}
