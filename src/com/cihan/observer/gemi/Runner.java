package com.cihan.observer.gemi;

public class Runner {

	public static void main(String[] args) {
	AnaKumanda anaGemi= new  AnaKumanda();
	AracImpL ucak= new Arac("Uçak",10000);
	AracImpL helikopter= new Arac("Helikopter",200);
	AracImpL f16= new Arac("F16",2000);
	AracImpL gemi= new Arac("Gemi",102);
	
	ucak.kayitOl(anaGemi);
	helikopter.kayitOl(anaGemi);
	f16.kayitOl(anaGemi);
	gemi.kayitOl(anaGemi);
	anaGemi.bilgiGonder("Düşman Uçağı Yakınınızda !!!");
	
	}

}
