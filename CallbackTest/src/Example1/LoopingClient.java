package Example1;
import java.io.PrintWriter;

public class LoopingClient implements MessagePrintable {
	int counter = 0;
	PrintWriter out = new PrintWriter(System.out, true);
	void run() {
		while (counter++<200000) {
			int dummy = counter*counter/(counter+1);
		}	
	}
	public void printMessage() {
		out.println("The counter is now: "+counter);
	}
}