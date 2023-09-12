package coffeeTest;

public class Customer {
	String name;
	int money;
	String trans;

	public Customer() {
	}
	//Main 함수에 만들어진 객체에 속성을 넣어주기 위한 매개변수
	//매개변수로 사용하기 위한 초기
	public Customer(String name, int money) {
	this.money=money;
	this.name=name;
	}
	void buy(int price) {
		money-=price;
	}
	
	
	 


}
