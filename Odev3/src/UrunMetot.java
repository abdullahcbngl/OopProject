
public class UrunMetot {
	public void ekle(Urun urun) {
		System.out.println(urun.urunAdi + ", sepetinize başarıyla eklenmiştir.");
	}
	
	public void güncelle(Urun urun) {
		System.out.println(urun.urunAdi + ", ürününüz sepette güncellenmiştir.");
		
	}
	
	public void sil(Urun urun) {
		System.out.println(urun.urunAdi + ", sepetten silindi.");
	}
	
	public void hesapla(Urun[] uruns) {
		double toplam=0;
		for(int f=0; f<uruns.length;f++) {
	
			toplam= toplam + uruns[f].fiyat;
		
		}
	
		System.out.println("Ödeyeceğiniz toplam tutar: " + toplam);
	}
	
	public void iadeGarantisi(Urun[] urun) {
		System.out.println("BİLGİLENDİRME : Satın almış olduğunuz ürünlerde teslimat sırasında herhangi bir sorun yaşamanız dahilinde ürünlerinizi iade etme garantisi bulunmaktadr.");
	}
}
