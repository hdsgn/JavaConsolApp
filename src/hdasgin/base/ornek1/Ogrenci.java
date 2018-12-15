package hdasgin.base.ornek1;

public class Ogrenci {
	
	public Ogrenci() {
		sart ();
//		15.12.2018
		int a=5;
		int b=20;
		int sonuc = toplama (a,b);
	}
	private int toplama(int a, int b){
		return a+b;
	}
	private void sart() {
		int sayi = 5;
		if (sayi ==5 && sayi ==0) {
			sayi = sayi+1;
		}else {
			sayi = sayi-1;
			
		}
		System.out.println(sayi);
	}
}