package singleton.enumimpl;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.UNIQUE_INSTANCE;
		System.out.println(singleton.getDescription());
		singleton.fill();
		singleton.boil();
		singleton.drain();
	}
}
