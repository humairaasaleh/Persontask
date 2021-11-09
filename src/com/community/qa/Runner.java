package com.community.qa;

public class Runner {

	public static void main(String[] args) {
		Person anna = new Person("Anna", 160, 19, 5, "engineer");
		Person bob = new Person("Bob", 170, 21, 10, "builder");
		Person clive = new Person("Clive", 175, 24, 12, "software developer");
		Person dave = new Person("Dave", 150, 11, 7, "unemployed");

		anna.greet();
		bob.greet2();
		clive.greet2();
		dave.greet();

	}

}
