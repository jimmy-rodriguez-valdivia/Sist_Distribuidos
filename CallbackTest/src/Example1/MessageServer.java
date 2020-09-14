package Example1;

public class MessageServer extends Thread {
int times;
int interval;
MessagePrintable object;
public MessageServer(int times, int interval, MessagePrintable object) {
	this.times = times;
	this.interval = interval;
	this.object = object;
	this.setPriority(Thread.NORM_PRIORITY+2);
	this.start();
	}

public void run( ) {
	for(int i = 0; i<times; i++) {
		try {
			sleep(interval);
			} catch(InterruptedException e) {}
		object.printMessage();
		}
	}
}