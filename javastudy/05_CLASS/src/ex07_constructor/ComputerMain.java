package ex07_constructor;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer myCom = new Computer("garm", 150);
		myCom.printComputerstatus();
		
		Computer yourCom = new Computer();
		yourCom.printComputerstatus();
		
		

	}

}
