package com.Bridgelabz.sweetshop;

import java.util.ArrayList;
import java.util.List;

public class SweetRepository {
	private List sweetList = new ArrayList();
	
	public List getSweetList() {
		return sweetList;
	}

	public void add(Modak modak) {
		sweetList.add(modak);
	}	
	
	
	public void add(Jalebi jalebi) {
		sweetList.add(jalebi);
	}
	
	public void add(Peda peda) {
		sweetList.add(peda);
		
	}
	
	public void add(Rasgulla rasgulla) {
		sweetList.add(rasgulla);
		
	}
	
	public void add(Laddu laddu) {
		sweetList.add(laddu);
		
	}
	
}
