package quiz03;

import ex06_constructor.Person;

public class Main {

	public static void main(String[] args) {
		
		
		Bus bus = new Bus(25);
		
		bus.ride(1, new quiz03.Person("kim"));
		
		bus.ride(2, new quiz03.Person("lee"));
		
		bus.ride(5,new Student("choi"));

		bus.ride(10, new Alba("min"));
		
		bus.info();
		
			
		
		
	
	}

}
