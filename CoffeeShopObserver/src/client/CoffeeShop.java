package client;

import observers.Customer;
import subject.CoffeeAttendent;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CoffeeAttendent emp = new CoffeeAttendent();
		
		Customer cust = new Customer();
		Customer cust2 = new Customer();
		Customer cust3 = new Customer();
		
		String order = "coffee";
		String order2 = "ice tea";
		String order3 = "coolata";

		
		emp.takeOrder(cust);
		emp.prepareDrink(order);
		emp.takeOrder(cust2);
		emp.prepareDrink("ice tea");
		emp.takeOrder(cust3);
		emp.prepareDrink("coolata");
		
		
	}

}
