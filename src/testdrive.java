
public class testdrive {
	private static void main(String args[]) {
		Context c1 = new Context();
		c1.setState(new StartState());
		c1.execute();
		c1.setState(new StopState());
	}
}
