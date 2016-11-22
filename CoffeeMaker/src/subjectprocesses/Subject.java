package subjectprocesses;

import observerevents.Observer;

public abstract class Subject {

	public abstract void registerObserver(Observer obj);
	public abstract void unregisterObserver(Observer obj);
	
	public abstract void notify(Object obj);
	
	
}
