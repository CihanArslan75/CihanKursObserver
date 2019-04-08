package com.cihan.observer.ozcanacar;

public class Musteri implements Abone{
	private Gazete gazete;
	private String isim;
	private String soyad;
	
	public  Musteri(final String isim,final String soyad) {
		setIsim(isim);
		setSoyad(soyad);
	}

	public Gazete getGazete() {
		return gazete;
	}

	public void setGazete(final Gazete gazete) {
		this.gazete = gazete;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(final String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(final String soyad) {
		this.soyad = soyad;
	}

	@Override
	public void update() {
		System.out.println(getIsim()+" "+ getSoyad()+" "+" gazeteyi aldı.");
		
	}

	@Override
	public void aboneligiIptalEt() {
		getGazete().aboneSil(this);
		System.out.println(getIsim()+" "+ getSoyad()+" "+" aboneliği sonlandı.");
	}

	@Override
	public void aboneOl(final Gazete gazete) {
		setGazete(gazete);
		gazete.aboneEkle(this);
		System.out.println(getIsim()+" "+ getSoyad()+" "+" abone oldu.");
	}

}
