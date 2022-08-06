
public class UrunMetot {
	public void ekle(Urun urun) {
		System.out.println(urun.urunAdi + ", sepetinize ba�ar�yla eklenmi�tir.");
	}
	
	public void g�ncelle(Urun urun) {
		System.out.println(urun.urunAdi + ", �r�n�n�z sepette g�ncellenmi�tir.");
		
	}
	
	public void sil(Urun urun) {
		System.out.println(urun.urunAdi + ", sepetten silindi.");
	}
	
	public void hesapla(Urun[] uruns) {
		double toplam=0;
		for(int f=0; f<uruns.length;f++) {
	
			toplam= toplam + uruns[f].fiyat;
		
		}
	
		System.out.println("�deyece�iniz toplam tutar: " + toplam);
	}
	
	public void iadeGarantisi(Urun[] urun) {
		System.out.println("B�LG�LEND�RME : Sat�n alm�� oldu�unuz �r�nlerde teslimat s�ras�nda herhangi bir sorun ya�aman�z dahilinde �r�nlerinizi iade etme garantisi bulunmaktadr.");
	}
}
