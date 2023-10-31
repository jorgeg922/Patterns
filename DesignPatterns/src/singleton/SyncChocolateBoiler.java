package singleton;
//using synchronized makes it thread safe, but synchronize is expensive
//ignore if performance is not important or greatly affected
public class SyncChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static SyncChocolateBoiler cb;
	
	private SyncChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static synchronized SyncChocolateBoiler getInstance() {
		if(cb == null) {
			cb = new SyncChocolateBoiler();
		}
		return cb;
	}
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//fill the biler with mixture
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
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
