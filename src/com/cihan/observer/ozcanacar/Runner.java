package com.cihan.observer.ozcanacar;

public class Runner {
	public static void main(String[] args) {
		final Gazete hurriyet=new Hurriyet();
		final Abone musteri1=new Musteri("Cihan", "Arslan");
		final Abone musteri2=new Musteri("Atilla", "Arslan");
		final Abone musteri3=new Musteri("Edanur", "Arslan");
		final Abone musteri4=new Musteri("Bilge", "Arslan");
		musteri1.aboneOl(hurriyet);
		musteri2.aboneOl(hurriyet);
		musteri3.aboneOl(hurriyet);
		musteri4.aboneOl(hurriyet);
		hurriyet.gazeteGonder();
		musteri2.aboneligiIptalEt();
		hurriyet.gazeteGonder();
		
	}

}
