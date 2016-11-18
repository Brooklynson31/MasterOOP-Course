package subject;

import java.util.List;
import java.util.ArrayList;

import observers.WaitingCustomer;


public class CoffeeAttendent {
	
	private List<WaitingCustomer> customersList;
	
	private String completedDrink;
	private boolean orderReady;
	
	public CoffeeAttendent() {
		customersList = new ArrayList<WaitingCustomer>();
	}
	
	
	public void takeOrder(WaitingCustomer customer){
		customersList.add(customer);
		
		setOrderReady(false);
	}
	
	public void prepareDrink(String drinkToPrepare){
		this.completedDrink = drinkToPrepare;
		System.out.println("Preparing a " + drinkToPrepare);
		setOrderReady(true);
		callOutCompletedOrder();
	}
	
	//notify
	public void callOutCompletedOrder(){
		if(isOrderReady()){
			for(WaitingCustomer customer: customersList){
				customer.orderReady(completedDrink);
					}
			}
	}


	public boolean isOrderReady() {
		return orderReady;
	}


	public void setOrderReady(boolean orderReady) {
		this.orderReady = orderReady;
	}
	
	
	
	
	

}
