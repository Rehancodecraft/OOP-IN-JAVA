 package com;

public class Main {

	public static void main(String[] args){
		Human rehan = new Human(18, "Rehan", 150000, false);
		Human noman = new Human(24, "Noman", 450000, false);
		System.out.println(rehan.name);
		System.out.println(noman.name);
		System.out.println(rehan.age);
		System.out.println(noman.age);
	}
}
