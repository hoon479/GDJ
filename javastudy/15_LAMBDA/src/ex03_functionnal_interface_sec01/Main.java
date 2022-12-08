package ex03_functionnal_interface_sec01;

public class Main {

	public static void main(String[] args) {
		
		Myinterface1 myInterface1 = () -> System.out.println("집에 가고 싶다."); 
			myInterface1.method(); 
		
		Myinterface1 you = () -> System.out.println("나는 자고 싶다."); 
			you.method(); 
		

	}

}
