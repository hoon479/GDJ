package ex03_functionnal_interface_sec02;

public class Main {

	public static void main(String[] args) {
		
		MyInterface2 my = (a) -> System.out.println(a);
		my.method(10);

	}

}
