package com.Bridgelabz.sweetshop;

import java.util.ArrayList;
import java.util.List;

public class SweetRepository {
	private List sweetList = new ArrayList();
	
	public List getSweetList() {
		return sweetList;
	}

	public void add(Sweet sweet) {
		sweetList.add(sweet);
	}	
	
	public void delete(Sweet sweet) {
		sweetList.remove(sweet);
	}
	
	
	
	
}
