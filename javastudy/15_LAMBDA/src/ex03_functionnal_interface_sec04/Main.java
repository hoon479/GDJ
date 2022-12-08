package ex03_functionnal_interface_sec04;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = (a, b) -> 1 + 1; 
		System.out.println(calc.add(1, 1));

	}

}
