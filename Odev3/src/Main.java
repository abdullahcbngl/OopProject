
public class Main {

	public static void main(String[] args) {
		System.out.println("                      **********  HOÞGELDÝNÝZ  *************                    ");

		Aksesuar aksesuar1 = new Aksesuar();
		aksesuar1.kategori = "Kadýn ve erkek";
		aksesuar1.urunAdi = "Valiz";
		aksesuar1.urunNo = 123112;
		aksesuar1.boy = "Orta Boy";
		aksesuar1.marka = "Troya Bags";
		aksesuar1.satýcý = "HepsiBurada";
		aksesuar1.fiyat = 300;

		Aksesuar aksesuar2 = new Aksesuar();
		aksesuar2.kategori = "Çocuk";
		aksesuar2.urunAdi = "Þapka";
		aksesuar2.urunNo = 452546;
		aksesuar2.boy = "Küçük Boy";
		aksesuar2.marka = "NuxFah";
		aksesuar2.satýcý = "Nesvay";
		aksesuar2.fiyat = 60;

		Aksesuar aksesuar3 = new Aksesuar();
		aksesuar3.kategori = "Erkek";
		aksesuar3.urunAdi = "Güneþ Gözlüðü";
		aksesuar3.urunNo = 86475;
		aksesuar3.camSekli = "Dikdörtgen";
		aksesuar3.marka = "Ray-Ban";
		aksesuar3.satýcý = "Hande Optik";
		aksesuar3.fiyat = 475;
		
		Aksesuar aksesuar4 = new Aksesuar();
		aksesuar4.kategori = "Erkek";
		aksesuar4.urunAdi = "Erkek Cüzdan";
		aksesuar4.urunNo = 1442;
		aksesuar4.boy = "Orta Boy";
		aksesuar4.marka = "Kiðýlý";
		aksesuar4.satýcý= "Dodo Butik";
		aksesuar4.fiyat = 199;

		System.out.println("Ürün kategorisi : Aksesuar \n");
		System.out.println("********ÜRÜNLERÝMÝZ*********\n");
		Aksesuar[] aksesuarlar = { aksesuar1, aksesuar2, aksesuar3, aksesuar4 };
		for (int i = 0; i < aksesuarlar.length; i++) {
			System.out.println("=> " + aksesuarlar[i].urunAdi + "\n");
		}
		System.out.println("-----------------------------------\n");
		Giyim giyim1 = new Giyim();
		giyim1.kategori = "Erkek";
		giyim1.urunAdi = "T-shirt";
		giyim1.urunNo = 1112;
		giyim1.kumaþTipi = "Pamuk";
		giyim1.renk = "Siyah";
		giyim1.marka = "DeFacto";
		giyim1.satýcý = "DeFacto";
		giyim1.fiyat = 45;

		Giyim giyim2 = new Giyim();
		giyim2.kategori = "Kadýn";
		giyim2.urunAdi = "Jean Pantolon";
		giyim2.urunNo = 2353;
		giyim2.kumaþTipi = "Kot";
		giyim2.renk = "Mavi";
		giyim2.marka = "Koton";
		giyim2.satýcý = "KOTON";
		giyim2.fiyat = 120;

		Giyim giyim3 = new Giyim();
		giyim3.kategori = "Erkek";
		giyim3.urunAdi = "Ceket";
		giyim3.urunNo = 112352;
		giyim3.kumaþTipi = "Deri";
		giyim3.renk = "Kahverengi";
		giyim3.marka = "BERSHKA";
		giyim3.satýcý = "BERSHKA";
		giyim3.fiyat = 270;

		Giyim giyim4 = new Giyim();
		giyim4.kategori = "Bebek";
		giyim4.urunAdi = "Elbise";
		giyim4.urunNo = 1246235;
		giyim4.kumaþTipi = "Pamuk";
		giyim4.renk = "Pembe";
		giyim4.marka = "Nazar Bebe";
		giyim4.satýcý = "Nazar Bebe";
		giyim4.fiyat = 85;

		System.out.println("Ürün kategorisi : Giyim \n");
		System.out.println("*********ÜRÜNLER******\n");
		Giyim[] giyimler = { giyim1, giyim2, giyim3, giyim4};
		for (int k = 0; k < giyimler.length; k++) {
			System.out.println("=> " + giyimler[k].urunAdi + "\n");
		}

		System.out.println("-----------------------------------\n");

		Mutfak urun1 = new Mutfak();
		urun1.kategori = "Yemek Ýçecek Gereçleri";
		urun1.urunAdi = "Çaydanlýk";
		urun1.urunNo = 45628;
		urun1.yapý = "Paslanmaz Çelik";
		urun1.hacimLt = 2;
		urun1.marka = "KARACA";
		urun1.satýcý = "HepsiBurada";
		urun1.fiyat = 265;

		Mutfak urun2 = new Mutfak();
		urun2.kategori = "Piþirme ürünleri";
		urun2.urunAdi = "Fýrýn";
		urun2.urunNo = 78546;
		urun2.yapý = "Metal";
		urun2.hacimLt = 5;
		urun2.marka = "Beko";
		urun2.satýcý = "Beko";
		urun2.fiyat = 450;

		Mutfak urun3 = new Mutfak();
		urun3.kategori = "Yemek piþirme";
		urun3.urunAdi = "Tencere Takýmý";
		urun3.urunNo = 632565;
		urun3.yapý = "Alüminyum";
		urun3.hacimLt = 3;
		urun3.marka = "KORKMAZ";
		urun3.satýcý = "HepsiBurada";
		urun3.fiyat = 740;
		
		Mutfak urun4 = new Mutfak();
		urun4.kategori = "Sofra & Mutfak";
		urun4.urunAdi = "Baharat Takýmý";
		urun4.urunNo = 442315;
		urun4.yapý = "Porselen";
		urun4.hacimLt = 0.5;
		urun4.marka = "Paþabahçe";
		urun4.satýcý = "Pama Home";
		urun4.fiyat = 98;

		System.out.println("Ürün kategorisi : Ev&Yaþam \n");
		System.out.println("*********ÜRÜNLER******\n");
		Mutfak[] gereçler = { urun1, urun2, urun3, urun4 };
		for (int m = 0; m < gereçler.length; m++) {
			System.out.println("=> " + gereçler[m].urunAdi + "\n");
		}

		System.out.println("-----------------------------------\n");

		Elektronik cihaz1 = new Elektronik();
		cihaz1.kategori = "Bilgisayar";
		cihaz1.urunAdi = "Dell Insprion Laptop";
		cihaz1.urunNo = 22234513;
		cihaz1.islemci = "Intel i7";
		cihaz1.marka = "Dell";
		cihaz1.garantiSuresiYýl = 2;
		cihaz1.satýcý = "NetHouse";
		cihaz1.fiyat = 7450;

		Elektronik cihaz2 = new Elektronik();
		cihaz2.kategori = "Telefon";
		cihaz2.urunAdi = "Iphone 11 Pro";
		cihaz2.urunNo = 1153142;
		cihaz2.islemci = "IOS";
		cihaz2.marka = "Apple";
		cihaz2.hafýza = "128 GB";
		cihaz2.garantiSuresiYýl = 3;
		cihaz2.satýcý = "Vatan Bilgisayar";
		cihaz2.fiyat = 9500;

		Elektronik cihaz3 = new Elektronik();
		cihaz3.kategori = "Oyun Konsolu";
		cihaz3.urunAdi = "Playstation 5";
		cihaz3.urunNo = 6547822;
		cihaz3.marka = "Sony";
		cihaz3.garantiSuresiYýl = 2;
		cihaz3.satýcý = "MediaMarkt";
		cihaz3.fiyat = 5402;

		Elektronik cihaz4 = new Elektronik();
		cihaz4.kategori = "Bilgisayar & Tablet";
		cihaz4.urunAdi = "Logitech G213 Mekanik Oyuncu Klavyesi";
		cihaz4.urunNo = 562678;
		cihaz4.marka = "Logitech";
		cihaz4.garantiSuresiYýl = 1;
		cihaz4.satýcý = "NetHouse";
		cihaz4.fiyat = 350;

		System.out.println("Ürün kategorisi : ELEKTRONÝK \n");
		System.out.println("*********ÜRÜNLER******\n");
		Elektronik[] cihazlar = { cihaz1, cihaz2, cihaz3, cihaz4 };
		for (int c = 0; c < cihazlar.length; c++) {
			System.out.println("=> " + cihazlar[c].urunAdi + "\n");
		}
		System.out.println("\n\n");

		System.out.println("*****************Sepetiniz**************\n");

		UrunMetot urunMetot = new UrunMetot();

		urunMetot.ekle(cihaz1);
		urunMetot.ekle(cihaz2);
		urunMetot.ekle(giyim1);
		urunMetot.ekle(giyim2);
		urunMetot.ekle(urun1);
		urunMetot.ekle(urun2);
		urunMetot.ekle(aksesuar1);
		urunMetot.ekle(aksesuar2);
		urunMetot.ekle(cihaz4);
		urunMetot.ekle(urun4);
		System.out.println("--------------------------------------");

		urunMetot.güncelle(giyim2);
		urunMetot.güncelle(cihaz2);
		System.out.println("------------------------------");
		urunMetot.sil(cihaz1);
		urunMetot.sil(aksesuar2);
		System.out.println("----------------------------------");
		Urun[] uruns = { giyim1, giyim2, aksesuar1, urun1, urun2, cihaz2, cihaz4, urun4 };
		urunMetot.iadeGarantisi(uruns);
	
		System.out.println("--------------------------");
		
		urunMetot.hesapla(uruns);

		System.out.println("\n--------------------------------------");

		System.out.println("//// Avantajlar ////\n");

		AksesuarMetot aksesuarMetot = new AksesuarMetot();
		aksesuarMetot.kampanya(aksesuar1);
		aksesuarMetot.kampanya(aksesuar2);
		aksesuarMetot.kampanya(aksesuar3);
	
		

		ElektronikMetot elektronikMetot = new ElektronikMetot();
		elektronikMetot.indirim(cihaz1);
		elektronikMetot.indirim(cihaz2);
		elektronikMetot.indirim(cihaz3);

		System.out.println("----------------------------");

		System.out.println("!!!!!UYARI!!!!!!\n");

		GiyimMetot giyimMetot = new GiyimMetot();
		giyimMetot.uyarý(giyim1);
		giyimMetot.uyarý(giyim2);
		giyimMetot.uyarý(giyim3);

	}

}
