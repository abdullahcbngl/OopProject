
public class UrunMetot {
	public void ekle(Urun urun) {
		System.out.println(urun.urunAdi + ", sepetinize baþarýyla eklenmiþtir.");
	}
	
	public void güncelle(Urun urun) {
		System.out.println(urun.urunAdi + ", ürününüz sepette güncellenmiþtir.");
		
	}
	
	public void sil(Urun urun) {
		System.out.println(urun.urunAdi + ", sepetten silindi.");
	}
	
	public void hesapla(Urun[] uruns) {
		double toplam=0;
		for(int f=0; f<uruns.length;f++) {
	
			toplam= toplam + uruns[f].fiyat;
		
		}
	
		System.out.println("Ödeyeceðiniz toplam tutar: " + toplam);
	}
	
	public void iadeGarantisi(Urun[] urun) {
		System.out.println("BÝLGÝLENDÝRME : Satýn almýþ olduðunuz ürünlerde teslimat sýrasýnda herhangi bir sorun yaþamanýz dahilinde ürünlerinizi iade etme garantisi bulunmaktadr.");
	}
}
