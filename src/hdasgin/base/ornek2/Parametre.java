package hdasgin.base.ornek2;

public class Parametre {
	public Parametre() {
		
		String ad="Hacer";
		String soyad="da�g�n";
		String Isimsoyisim=Isimsoyisim(ad,soyad);
		System.out.println(Isimsoyisim);
}
	private String Isimsoyisim(String ad, String soyad) {
		// TODO Auto-generated method stub
		return ad+ " "+soyad;
	}
}