package singleton.enumimpl;
//Singleton can be implemented as an enum and be thread safe. Enum resolves issues
//with serialization and reflection which other implementations have
//enum implementation is the best recommended approach to create a singleton
public enum Singleton {
	UNIQUE_INSTANCE;
 
	// other useful fields here
	private boolean empty = true;
	private boolean boiled = false;

	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
	
	public void fill() {
		if (isEmpty()) {
			System.out.println("Filling the Boiler");
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			System.out.println("Draining...");
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			System.out.println("Boiling...");
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
