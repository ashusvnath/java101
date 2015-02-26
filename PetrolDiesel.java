import java.io.PrintStream;

class PetrolDiesel {
	public static void main(String[] args) {
		createThread("One", "Hello world.", Colors.ANSI_RED + Colors.ANSI_ENCIRCLED, 2, 20).start();
		createThread("Two","How are you?", Colors.ANSI_BLUE, 1, 10).start();
		// t1.start();
		// t2.start();
		// try {			
		// 	t1.join(1000);
		// 	t1.interrupt();
		// 	t2.join(2000);
		// 	t2.interrupt();
		// } catch(Exception e) {
		// 	System.out.println("\nException in main :" + e);
		// }	
	}

	public static Thread createThread(String name, String message, String color, int sleep_time_in_seconds, int iteration_count) {
		return new Thread(new Runnable() {
			ColoredConsoleWriter ccs = new ColoredConsoleWriter(color);
			int count = 0;
			public void run(){
				try {
					while(count < iteration_count){
						ccs.p(message);
						Thread.sleep(sleep_time_in_seconds * 1000);
						count++;
					}
				} catch (Exception e) {
					ccs.pl("\nException in thread " + name + " : " + e);
				}
			}

		}, name);
	}
}


class ColoredConsoleWriter {
	private PrintStream printStream;
	String color;

	public ColoredConsoleWriter(String color) {
		this.color = color;
		printStream = System.out;
	}

	public void pl(String message) {
		printStream.println(color + message + Colors.ANSI_RESET);
	}

	public void p(String message) {
		printStream.print(color + message + Colors.ANSI_RESET);
	}
}


class Colors {
	public static final String ANSI_RESET = (char) 27 + "[0m";
	public static final String ANSI_BLACK = (char) 27 + "[30m";
	public static final String ANSI_RED = (char) 27 + "[52;31m";
	public static final String ANSI_GREEN = (char) 27 + "[32m";
	public static final String ANSI_YELLOW = (char) 27 + "[33m";
	public static final String ANSI_BLUE = (char) 27 + "[34m";
	public static final String ANSI_PURPLE = (char) 27 + "[35m";
	public static final String ANSI_CYAN = (char) 27 + "[36m";
	public static final String ANSI_WHITE = (char) 27 + "[37m";
	public static final String ANSI_ENCIRCLED = (char) 27 + "[52m";
}
