package com.cihan.observer.gemi;

import java.util.ArrayList;
import java.util.List;

public class AnaKumanda {
	List<Arac> arac =new ArrayList<Arac>();
	
	public List<Arac> getArac() {
		return arac;
	}

	public void setArac(List<Arac> arac) {
		this.arac = arac;
	}
	
	void aracEkle(Arac arac) {
		getArac().add(arac);
	}
	
	void aracSil(AracImpL arac) {
		getArac().remove(arac);
	}
	
	void bilgiGonder(String bilgi)  { //notify
		for (int i = 0; i < arac.size(); i++) {
			getArac().get(i).update(bilgi);
		}
	}

}
