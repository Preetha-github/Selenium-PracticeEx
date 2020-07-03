package com.lao;

class Vehicle {

	int speed = 50;
}

class Bike extends Vehicle {

	int speed = 100;

	void display() {

		System.out.println(speed);
	}

	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.display();
	}

}
