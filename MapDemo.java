import java.util.Map;
import java.util.HashMap;

class Country {
	private String name;
	Country(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public boolean equals(Object other) {
		return name == ((Country) other).name;
	}

	public int hashCode() {
		return this.name.hashCode();
	}
}

class City {
	private String name;
	City(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

class Program {
	public static void main(String[] args) {
		Map<Country, City> map = new HashMap<Country, City>();
		map.put(new Country("Pakistan"), new City("Islamabad"));
		map.put(new Country("India"), new City("New Delhi"));
		map.put(new Country("India"), new City("Another Capital"));
		for(Country country: map.keySet()) {
			System.out.println("The capital of " + country + " is " + map.get(country));
		}
		String a = "a";
		String anotherA = "a";
		if(a == anotherA) {
			System.out.println("This strings are the same");
		}
	}
}