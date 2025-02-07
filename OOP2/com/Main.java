 package com;

public class Main {

	public static void main(String[] args){
		Human rehan = new Human(18, "Rehan", 150000, false);
		Human noman = new Human(24, "Noman", 450000, false);
		Human imran = new Human(30, "Imran", 390000, true);
		Human adnan = new Human(32, "Adnan", 700000, true);

		System.out.println(Human.population);

	}
}
