package util;

public class Print {
	//Print object with a newline
	public static void println(Object obj) {
		System.out.println(obj);
	}

	//Print only a newline
	public static void println(){
		System.out.println();
	}

	public static void print(Object obj) {
		System.out.print(obj);
	}

	public static void printf(String format, Object... args) {
		System.out.printf(format, args);

	}
}
