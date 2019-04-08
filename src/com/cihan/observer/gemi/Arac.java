package com.cihan.observer.gemi;

public class Arac implements AracImpL{
	private AnaKumanda anaKumanda;
	private String  aracIsim;
	private int uzaklik;
	
	public Arac(String isim,int uzaklik) {
		setAracIsim(isim);
		setUzaklık(uzaklik);
	}
	
	public AnaKumanda getAnaKumanda() {
		return anaKumanda;
	}

	public void setAnaKumanda(AnaKumanda anaKumanda) {
		this.anaKumanda = anaKumanda;
	}
	
	public String getAracIsim() {
		return aracIsim;
	}

	public void setAracIsim(String aracIsim) {
		this.aracIsim = aracIsim;
	}
	
	public int getUzaklik() {
		return uzaklik;
	}

	public void setUzaklık(int uzaklik) {
		this.uzaklik = uzaklik;
	}

	@Override
	public void update(String bilgi) {
		
		if(getUzaklik()<1000) {
			System.out.println(getAracIsim()+" "+bilgi +" Bilgisini aldı.");
		}
		else
		{
			System.out.println(getAracIsim()+"  Görüş alanından çıktı. Bilgi Gönderilemedi");
				
		}
		
	}

	@Override
	public void kayitOl(AnaKumanda anakumanda) {
		setAnaKumanda(anakumanda);
		anakumanda.aracEkle(this);
		System.out.println(getAracIsim()+"  "+" kayıt oldu.");
		
	}

	@Override
	public void kayitiptal() {
		getAnaKumanda().aracSil(this);
		System.out.println(getAracIsim()+"  "+" kayıtı silindi.");
	}

}
