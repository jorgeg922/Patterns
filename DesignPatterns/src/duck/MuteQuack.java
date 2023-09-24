package duck;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println("<<<<Silent Quack>>>>");
	}
}
