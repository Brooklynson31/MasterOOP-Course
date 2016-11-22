package user;

import mark4.MarkIV;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarkIV coffeeMaker = MarkIV.getInstance();
		coffeeMaker.makeCoffee();
		
		coffeeMaker.removeCoffeePot();
	}

}
