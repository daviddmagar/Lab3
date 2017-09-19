/**
 * CS 2003 - Lab 3
 * Code to display a persons name, age, birthday, and if they are eligible for Medicare
 *
 * @author David Magar
 * @version 1.1
 * @since 09-12-2017
 */

public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthDate;
	private int age;
	
	//constructor
	public Person(String name, int birthDate){
		this.name = name;
		this.birthDate = birthDate;
	}

	//Method to set variable "birthDate" to year passed by Person object
	public void reset_birthday(int year){
		birthDate = year;
	}
	//Method to display person's name
	public void display_name(){
		System.out.println("This is " + name);
	}
	//Method to print birthday to console
	public void display_birthday(){
		System.out.printf("I was born in %d. ",birthDate);
	}
	//Method to find current age and print it to console
	public void display_age(){
		age = currentYear - birthDate;
		System.out.printf("I am %d years old ",age);
	}

	//Method to check for Medicare eligibility
	public void senior_citizen() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	
	//Method to consolidate a Person's info and print it to the console
	public static void print_info(Person x) {
		x.display_name();
		x.display_birthday();
		x.display_age();
		x.senior_citizen();
	}
	//Main function used to create Person, and pass Person to print_info method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		print_info(John);

		
		
	}

}