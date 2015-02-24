public class Person {
	private String date_of_birth;
	private char gender;
	public Person parent;

	Person(String name, String date_of_birth, char gender) {
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
	}

	public static Person create(String name, String date_of_birth, char gender){
		if(isValid(name) && isValidDate(date_of_birth)  && isValid(gender)){
			return new Person(name, date_of_birth, gender);
		}
		return null;
	}

	public static boolean isValid(String name) {
		return true;
	}

	public static boolean isValidDate(String date_of_birth) {
		return true;
	}

	public static boolean isValid(char gender) {
		return true;
	}

	public String toString() {
		String result;
		result = name + ", " + date_of_birth + ", " + gender;
		return result; 
	}
	private String name;

}

class Program {
	public static void main(String[] args) {
		//main(null);
		Person person = Person.create("Jayanth", "25-06-1980", 'M');//new Person();
		System.out.println(person.parent);
	}
}