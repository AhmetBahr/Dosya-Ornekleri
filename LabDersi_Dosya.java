import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class LabDersi_Dosya {
	
	static int os = 0;
	
	public static void main(String args []) throws FileNotFoundException {
	
		File ad = new File("ad.txt");
		File vize = new File ("vize.txt");
		File genel = new File("genel.txt");
		File sonuc = new File("sonuc.txt");
		
		PrintStream pp = null;	//sonucu yazdýrmak için
	
		Scanner oku = null;
		//Scanner scan = new Scanner(ad);
		
		try {
			oku = new Scanner(ad);
			
			while(oku.hasNext()) {
				oku.nextLine();	//Satýr sayýsýný okuma
				os++;
			}
			oku.close();
		//	System.out.println(os);// kontrol için
			
			String a[] =new String [os+1];
			int v[] = new int [os+1];
			int g[] = new int[os+1];
			
			//yukarýda oluþturduðumuz dizilerdeki deðerleri sonuc.txt ye atýyoruz
			oku = new Scanner(ad);
				while(oku.hasNext()) {
					int no = oku.nextInt();
					String isim = oku.next(); 
					a[no] = isim;
			}
				oku.close();
			
			oku = new Scanner(vize);
				while(oku.hasNext()) {
					int no = oku.nextInt();
					int viz = oku.nextInt();
					v[no] = viz;
					
				}
					oku.close();
					
			oku = new Scanner(genel);
				while(oku.hasNext()) {
					int no = oku.nextInt();
					int gen = oku.nextInt();
					v[no] = gen;
						
					}
					oku.close();
					
					if(!sonuc.exists()) {	//Dosya yoksa oluþturmayý saðlýyo
						sonuc.createNewFile();
					}
					pp = new PrintStream(sonuc);
					
					//Yazma iþlemi
					for(int i=1;i<=os;i++) {
						pp.println(i+ " " + a[i] + " " + v[i] + " " +g[i] + " " +((v[i]+(double)g[i]/2)));
					}
					pp.close();	
		}
		catch(Exception e){
			System.out.println("HATA VAR !!");
		}	
	}
}
