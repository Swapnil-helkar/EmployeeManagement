package com.example.demo.String;

class Animal {
	public  void sound() {
		System.out.println("Animal is making a sound");
	}
}

class Cat extends Animal {
	@Override
	public  void sound() {
		System.out.println("Meow");
	}
}
public class StringImmutability {

	public class Main {
	    public static void main(String[] args) {
	        Animal animal = new Cat();
	        animal.sound(); // Output: Animal is making a sound
	    }
	}

}
