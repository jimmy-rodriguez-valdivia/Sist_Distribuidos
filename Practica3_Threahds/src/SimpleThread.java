public class SimpleThread extends Thread {

	
	public SimpleThread(String name) {
		super(name);
	}
	
	public void run()	{
		String j="";
		for (int i=0; i<10; i++); {
			j = Integer.toString(MIN_PRIORITY);
			System.out.println(j + " " + getName());
		}
	}
	public static void main(String[] args) {
		new SimpleThread("Juan").start();
		new SimpleThread("Maria").start();
	}

}
