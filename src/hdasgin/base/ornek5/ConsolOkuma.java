package hdasgin.base.ornek5;

import java.util.Scanner;

public class ConsolOkuma {
	
	private int sayi; 
	private Scanner scan;
	
	public ConsolOkuma () {
		scan= new Scanner (System.in);
		
		System.out.println("bir say� giriniz...");
		sayi= scan.nextInt();
		System.out.println("girdi�iniz say� :" +sayi);
		System.out.println("isminizi giriniz");
		scan.close();
		
		
	}

}
