package io.temp;

class Mobile{
	static final Mobile APPLE = new Mobile();
	static final Mobile SAMSUNG = new Mobile();
	static final Mobile NOKIA = new Mobile();
}

enum Laptop{
	ACER(700.0),HP(900.0),MACBOOK(2000.0),LENOVO,ASUS(850.0),DELL(800.0);
	
	private Laptop(Double price) {
		this.price = price;
	}

	Laptop() {
		System.out.println(this);
		price = 500.0;
	}
	
	private Double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	} 
}

public class Main {
	public static void main(String[] args) {
		Mobile m = Mobile.SAMSUNG;
		
		if(m.equals(Mobile.SAMSUNG)) 
			System.out.println(m.equals(Mobile.SAMSUNG));
		
		Laptop l = Laptop.MACBOOK;
		
		switch(l) {
			case LENOVO: 
				System.out.println("your laptop is "+l); 
				break; 
			case HP: 
				System.out.println("your laptop is "+l); 
				break; 
			case DELL: 
				System.out.println("your laptop is "+l); 
				break; 
			case ACER: 
				System.out.println("your laptop is "+l); 
				break; 
			case ASUS: 
				System.out.println("your laptop is "+l); 
				break; 
			default: System.out.println("your laptop is other type");
		}
		
		l.setPrice(1200);
		System.out.println(l.getPrice());
		
		Laptop laptops[] = Laptop.values();
		
		for (Laptop laptop : laptops) {
			System.out.println(laptop.ordinal()+" - "+laptop+" - "+laptop.getPrice());
		}
	}
}
