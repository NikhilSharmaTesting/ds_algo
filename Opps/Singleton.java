package Opps;

public class Singleton {
	
	private static Singleton instance;
	String name;
	
	private Singleton() {
		
	}
	// we have to make this method as the static as we cannot able to make the object as we have 
	//made the constructor private so we want to get one object 
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}

}
