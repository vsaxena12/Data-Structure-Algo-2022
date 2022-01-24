package animalKingdom.zoo;

import animalKingdom.animal.Animal;

public class Zoo {

	public static void main(String[] args) {
		//Driver code
		Animal tiger = new Animal("tiger", 10, "Male", 250);
		tiger.eat();
		//tiger.sleep();

		System.out.println("----------------------------------------");

		Animal cat = new Animal("cat", 5, "Female", 50);
		cat.sleep();
	}

}
