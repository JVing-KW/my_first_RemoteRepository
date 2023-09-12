package coffeeTest;

public class Main {
	
	public static void main(String[] args) {
		Customer lee = new Customer("이씨", 20000);
		Customer kim = new Customer("김씨", 25000);
		
		Cafe star = new Cafe("별다방","정자");	
		Cafe moon = new Cafe("달다방","미금");
		
		Specialcoffee nutty = new Specialcoffee("에티오피아","고소함");
		Specialcoffee sour = new Specialcoffee("칠레","산미");
		
//		lee.buy(Cafe.ame_price);
//		lee.buy(Cafe.latte_price);
//		star.star_ame(lee);
		nutty.special_ame(star);

		System.out.println(lee.money);
		
		
//		kim.buy(Cafe.ame_price);
//		kim.buy(Cafe.latte_price);
//		System.out.println(kim.money);

	}

}
