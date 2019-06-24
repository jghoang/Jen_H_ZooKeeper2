package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public void fly() {
		energyLevel -=50;
		System.out.println("*flapping wings* but this decreased its energy");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("*Ate a human* so-well, nevermind...its energy increased by 25");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("*town is on fire* nbd...its energy decreased by 100");
		displayEnergy();
	}
}
