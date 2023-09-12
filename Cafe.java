package coffeeTest;

public class Cafe {
	String cafeName;
	String location;
	static int ame_price=3000;
	static int latte_price=4000;

	public Cafe() {

	}

	public Cafe(String cafeName, String location) {
		this.cafeName = cafeName;
		this.location = location;

	}
	
 void star_ame(Customer cus) {
	cus.buy(ame_price);
	 
 }
 void star_latte(Customer cus) {
	 cus.buy(latte_price);
	 
 }
void moon_ame(Customer cus) {
	cus.buy(ame_price);
	
}

void moon_latte(Customer cus) {
	cus.buy(latte_price);
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}
