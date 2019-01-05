package hdasgin.base.ornek6;

public class Donguler {
	
public Donguler(){
	//dongu();
	Islem();
}
private void Islem() {
	int sayi =10;
	System.out.println(sayi++);
	sayi++;
	System.out.println(++sayi);
	sayi--;
	System.out.println(--sayi);
	System.out.println(--sayi);
}
private void Dongu() {
	
	for (int i = 100; i >= 0; i=i-1) {
		System.out.println(i);
		
	}
}
}
