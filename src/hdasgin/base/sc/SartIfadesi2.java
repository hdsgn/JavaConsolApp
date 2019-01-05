package hdasgin.base.sc;

public class SartIfadesi2 {
	public SartIfadesi2() {
		Islem();
	}
	private  void Islem() {
		int deger = 0;
		switch (deger) {
		case 0:{
			System.out.println("Deger 0");
			break;
		}
		case 10:{
			System.out.println("Deger 10");
			break;
		}
		case 20:{
			System.out.println("Deger 20");
			break;
		}
		default:
			System.out.println("Deger eþitlenmedi");
			break;
		}
	}
	
}
