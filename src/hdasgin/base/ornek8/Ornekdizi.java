package hdasgin.base.ornek8;

public class Ornekdizi {
	public Ornekdizi() {
		// TODO Auto-generated constructor stub
//		Dizi();
		OrnekDizi1();
	}
	private void OrnekDizi1() {
		int [] dizi= {1,2,3,4,5,6,7,8,9,10};
		int [] dizi1= new int [10];
		int count = dizi.length-1;
		int temp;
		for (int i = 0; i < dizi.length/2; i++) {
			temp =dizi[i];
			dizi1[i]=dizi[count]=temp;
			count--;

			System.out.println(dizi1[i]);
	}
	}
}


//		int [] dizi= {1,2,3,4,5,6,7,8,9,10};
//		int [] dizi1= new int [10];
//		int count = dizi.length-1;
//		for (int i = 0; i < dizi1.length; i++) {
//			dizi1[i]=dizi[count];
//			count--;
		
//		for (int i = 0; i < dizi1.length; i++) {
//			System.out.println(dizi1[i]);
		


