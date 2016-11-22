package observerevents;

public class CoffeeFilterObserver implements Observer {

	@Override
	public void update(Object obj) {

		if(obj.equals(true)){
			System.out.println("Hot water is dripping onto Coffee Filter");
		}
	}

}
