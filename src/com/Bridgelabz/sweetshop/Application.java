package com.Bridgelabz.sweetshop;

import java.util.List;

public class Application {
	public static void main(String[] args) {
		System.out.println("Welcome to Sweet Shop Management System ");
		Modak modak = new Modak();	
		modak.id = "m001";
		modak.price = 100;
		Jalebi jalebi = new Jalebi();	
		jalebi.id = "j001";
		jalebi.price = 80;
		Laddu laddu = new Laddu();
		laddu.id = "l001";
		laddu.price = 65;
		Rasgulla rasgulla = new Rasgulla();
		rasgulla.id = "r001";
		rasgulla.price = 120;
		Peda peda = new Peda();
		peda.id = "p001";
		peda.price = 95;
		
		SweetRepository sweetRepository = new SweetRepository();
		sweetRepository.add(modak);
		sweetRepository.add(jalebi);
		sweetRepository.add(laddu);
		sweetRepository.add(rasgulla);
		sweetRepository.add(peda);
		
		List sweetList = sweetRepository.getSweetList();
		UserInterface ui = new UserInterface();
		ui.print(sweetList);
		
	}

}
