package io.temp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static io.temp.Gender.*;


public class funtional_programming {
	public static void main(String[] args) {
		List<Custumer> custumers = Arrays.asList(new Custumer("Husanjon","Tuychiyev",Gender.MALE),new Custumer("Hasanjon","Tuychiyev",Gender.MALE),
				new Custumer("Jamshidbek","Parpiyev",Gender.MALE),new Custumer("Aziza","Ahmedova",Gender.FEMALE),
				new Custumer("Zohidjon","Mamajonov",Gender.MALE),new Custumer("Laziza","Lazizova",Gender.FEMALE),
				new Custumer("Ilhomjon","Xoshimov",Gender.MALE),new Custumer("Kamola","Kamolova",Gender.FEMALE));
		
		Consumer<Custumer> action = custumer -> System.out.println(custumer);
		
		Predicate<Custumer> isfemale = custumer -> Gender.FEMALE.equals(custumer.getGender());
		
		List<Custumer> males = custumers.stream()
				.filter(custumer -> custumer.getGender().equals(MALE))
				.collect(Collectors.toList());
		
		System.out.println("\nErkak klientlar soni- "+males.size()+"\n");
		
		males.forEach(action);
		
		System.out.println("\n\nAyol klientlar soni- "+(custumers.size()-males.size())+"\n");
		
		custumers.stream()
			.filter(isfemale)
			.collect(Collectors.toList())
			.forEach(action);;
	}
}

class Custumer{
	private String firstname;
	private String lastname;
	private Gender gender;
	
	public Custumer(String firstname,String lastname,Gender gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}
	
	public void setFirstName(String s) {
		this.firstname = s;
	}
	
	public void setLastName(String s) {
		this.firstname = s;
	}
	
	public void setGender(String s) {
		this.firstname = s;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	
	public String getLastName() {
		return this.lastname;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	@Override
	public String toString() {
		return this.firstname+"	"
				+ this.lastname+"	"
				+ this.gender;
	}
	
}

enum Gender{
	MALE,FEMALE
}