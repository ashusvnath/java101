interface Audible {
	public void makeSound();
}

class MusicalInstrument {
	private String name;
	private String sound;
	private String type;

	public MusicalInstrument(String name, String sound, String type) {
		this.name = name;
		this.sound = sound;
		this.type = type;
	}

	public void makeSound() {
		System.out.println(sound);
	}
}

class Vehicle  implements Audible {
	private String name;
	private String sound;
	private int number_of_wheels;
	private String model;

	public Vehicle(String name, String sound, int number_of_wheels, String model) {
		this.name = name;
		this.sound = sound;
		this.number_of_wheels = number_of_wheels;
		this.model = model;
	}

	public void makeSound() {
		System.out.println(sound);
	}
}

class Animal  implements Audible {
	private String name;
	private String sound;
	private int number_of_legs;

	public Animal(String name, String sound, int number_of_legs) {
		this.name = name;
		this.sound = sound;
		this.number_of_legs = number_of_legs;
	}

	public void makeSound() {
		System.out.println(sound);
	}
}

class SoundEngineer {

	public void recordSound(Animal animal){
		// make a sound and I will record
	}

	public void recordSound(MusicalInstrument mi){
		// make a sound and I will record
	}

	public void recordSound(Vehicle v){
		// make a sound and I will record
	}

}

class Program {
	public static void main(String[] args) {
		Audible[] audibles = {
			new Animal("Dog", "bow bow", 4),
			new Animal("Wolf", "howl", 4),
			new Animal("Cow", "moo moo", 4),
			new Vehicle("Car", "vroom", 4, "Maruti 800"),
			new Vehicle("Truck", "rrrrrrrrrrrrrrrr", 18, "Tata"),
			new MusicalInstrument("Flute", "piiiiiin", "wind"),
			new MusicalInstrument("Guitar", "taaaang", "string")
		};

		for(int i = 0; i < audibles.length; i++) {
			audibles[i].makeSound();
		}
	}
}
