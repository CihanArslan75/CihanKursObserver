package com.cihan.observer.ozcanacar;

import java.util.ArrayList;
import java.util.List;

public class Hurriyet implements Gazete{
	
	private List<Abone> aboneler= new ArrayList<Abone>();
	

	public List<Abone> getAboneler() {
		return aboneler;
	}

	public void setAboneler(List<Abone> aboneler) {
		this.aboneler = aboneler;
	}

	@Override
	public void aboneEkle(final Abone abone) {
			getAboneler().add(abone);	
	}

	@Override
	public void aboneSil(final Abone abone) {
		getAboneler().remove(abone);		
	}

	@Override
	public void gazeteGonder() {
		for (int i = 0; i < getAboneler().size(); i++) {
			getAboneler().get(i).update();
		}
		
	}

}
