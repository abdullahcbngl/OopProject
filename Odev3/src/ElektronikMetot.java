
public class ElektronikMetot {
	public void indirim(Elektronik elektronik) {
		if(elektronik.fiyat >4000) {
			double indirimliFiyat;
			indirimliFiyat= elektronik.fiyat - ((elektronik.fiyat * 10)/100);
			System.out.println(elektronik.urunAdi + " ürünün indirimli fiyatý = " + indirimliFiyat);
		}
	}
}	
