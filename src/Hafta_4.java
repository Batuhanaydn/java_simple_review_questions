import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hafta_4 {
	// Gözden geçirme sorularý 
	// Soru 1
	// class, public, int, x, y, radius
	
	// Soru 2
/*
	 * public static void main(String[] args) { 
	 * double mil = 100; 
	 * double donusum = 1.609;
	 * double kilometre = (mil * donusum); System.out.print(kilometre);
	 * 
	 * }
 */
	
	// Soru 3 bu sorularý a'larý int d'leri ise double alarak kontrol saðlayabilirsiniz.
	// Soru 4 ilk þekli string kullanarak DRY ilkesine uygun olmayarak yazýlmýþtýr.
/*
	public static void main(String[] args) { 
		String bugun = "Salý";
		String carsamba = "Carþamba";
		String persembe = "Perþembe";
		String cuma = "Cuma";
		String cumartesi = "Cumartesi";
		String pazar = "Pazar";
		String pazartesi = "Pazartesi";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç gün sonra? = ");
		int kac_gun = scanner.nextInt();
		int artýk = kac_gun % 7;
		if (artýk == 0) {
			System.out.println(bugun);	
		}
		else if (artýk == 1) {
			System.out.println(carsamba);	
		}
		else if (artýk == 2) {
			System.out.println(persembe);	
		}
		else if (artýk == 3) {
			System.out.println(cuma);	
		}
		else if (artýk == 4) {
			System.out.println(cumartesi);	
		}
		else if (artýk == 5) {
			System.out.println(pazar);	
		}
		else if (artýk == 6) {
			System.out.println(pazartesi);	
		}
		
			
	}
*/
	// Soru 4 ikinci yöntem  not = Burada arrayList yöntemi kullanýlmýþtýr 
	// eðer derste görmediyseniz kafanýzý karýþtýracaðý için bakmayýn
/*
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Salý");
		list.add("Çarþamba");
		list.add("Perþembe");
		list.add("Cuma");
		list.add("Cumartesi");
		list.add("Pazar");
		list.add("Pazartesi");
		// Burada kodu uzatmamak adýna sorudaki gibi bugünün salý olduðunu kabul edeceðim
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç gün sonra? = ");		
		int kac_gun = scanner.nextInt();
		int artýk = kac_gun % 7;		
		System.out.println(list.get(artýk));
		
		
		
		
	}
	*/
	// Soru 5-6 Sorumuzu en baþta mantýksal olarak inceleyelim. 25/4 sorusunu kayan noktalý sayý olarak bulmak istiyoruz.
	// Ýlk açýklamamýz gereken olay kayan noktalý sayýnýn ne olduðudur. Kayan noktalý sayýlarý matematikteki
	// reel sayýlarla eþleþtirebiliriz. Yani bir deðiþkenin baþýna float yahut double yazdýðýmýzda sayýnýn her zaman 
	// bir noktalý kýsmý oluþacaktýr.
	// Sorumuzu koda dökelim ve inceleyelim.
/*
	public static void main(String[] args) {
		double a_25_d = 25;
		double b_4_d = 4;
		int a_25_i = 25;
		int b_4_i = 4;
		// Alýnabilinecek bütün ihtilalleri oluþturduk þimdi yukarýdaki ifadelerin 25/4'ü veren tüm olasý
		// çýktýlarýný oluþturalým
		System.out.println(a_25_d/b_4_i); // 6.25
		System.out.println(a_25_d/b_4_d); // 6.25
		System.out.println(a_25_i/b_4_i); // 6
		System.out.println(a_25_i/b_4_d); // 6.25
		// Yukarýdaki sonuçlara baktýðýmýzda int / int bölüm hariç bütün bölme iþlemlerinde kayan noktalý sayý 
		// þeklinde çýktý alýrýz.
		
		
		
	}
*/
	// Soru 7 Sorumuzda verilen abcdr bilinmeyenlerini istediðiniz sayýlarla doldurabilirsiniz
/*
	public static void main(String[] args) {
		double a, b, c, d, r;
		double istenen = (4 / (3 * (r + 34))) - (9 * (a + (b * c))) + ((3 + d *( 2 + a) ) / (a + (b * d)) );
	}
*/
	//Soru 8 m ve r yi int yani tamsayý deðerleri üzerinden alýyoruz. 
/*
	public static void main(String[] args) {
		int m = 3;
		int r = 5;
		int cevap = (m * (r*r));
		int cevap_2 = (int) (m * (Math.pow(r, 2)));
		// Çok ekstrem bir þekilde bilgisayarýn yaptýðý gibi yapalým. Not: Bilgisayarlar 4 iþlem içerisinde sadece toplama yapar.
		int r_toplam = 0;
		int toplam_toplam = 0;
		for (int i = 1; i <= r; i++) {
			r_toplam = r_toplam + r;
		}
		for (int a = 1; a <= m; a++) {
			toplam_toplam = toplam_toplam + r_toplam;
		}
		System.out.println(toplam_toplam);
		
				
				
	}
*/
	// Soru 9 Soruda int i ' ye deðer verilmesi gerekiyor int i = 0 gibi
	// Soru 10 i = 12 f = 12.5
	// Soru 12 çýktýlar sýrasýyla b, c, -2 'dir.
	// Soru 13 print ile println arasýnda println'in sonundaki ln eklemesi new line (yeni satýr) manasýna gelmektedir.
    // Soru 14 kodun doðru yazýlmýþ hali aþaðýda verilmiþtir çýktýsý hepsini Stringin harflerini büyük harflere çevir.
/*
	public static void main(String []args){
        String cumle="Merhaba JaVa";
        cumle = cumle.toUpperCase();
        System.out.println(cumle);
     }
*/
	// Soru 15 noprs çýktýsýný verir
}












