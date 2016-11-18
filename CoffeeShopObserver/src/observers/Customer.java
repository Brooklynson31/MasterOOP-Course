package observers;

public class Customer implements WaitingCustomer {

	@Override
	public void orderReady(String preparedDrink) {
		
		System.out.println("order is ready for " + preparedDrink);
		
	}

}
