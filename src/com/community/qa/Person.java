package com.community.qa;

public class Person {

	private String name;
	private double height;
	private int age;
	private int shoesize;
	private String jobtitle;

	public Person(String name, double height, int age, int shoesize, String jobtitle) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.shoesize = shoesize;
		this.jobtitle = jobtitle;
	}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;

	}

	public void greet() {
		System.out.println("Hello my name is " + name + ". I am " + height + "cms tall. I am " + age
				+ " years old. My shoe size is " + shoesize + ". I am a " + jobtitle);
	}

	public void greet2() {
		System.out.println("My name is " + name + ". My height is " + height + "cms.");
	}

}