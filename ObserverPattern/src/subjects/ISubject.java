package subjects;

import observer.IObserver;

public abstract class ISubject {
	protected boolean statechange;

	
	public abstract void registerObserver(IObserver obj);
	public abstract void unregisterObserver(IObserver obj);
	
	public abstract void notifyAllDepartments();
	
	public boolean isStatechange() {
		return statechange;
	}

	public void setStatechange(boolean statechange) {
		this.statechange = statechange;
	}


}
