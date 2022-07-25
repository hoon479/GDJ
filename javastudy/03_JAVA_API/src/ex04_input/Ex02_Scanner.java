package ex04_input;


import java.util.Scanner;

public class Ex02_Scanner {

	public static void main(String[] args) {
		
		// java.util.Scanner 클래스
		// 데이터타입별로 입력 받을 수 있는 메소드를 제공
		// int : nextint()
		// long : nextLong ()
		// double : nextDouble ()
		// String : nextLine() - 공백 포함 입력, next() -  공백 포함 불가능
		
		Scanner sc = new Scanner(System.in); // 객체 sc는 Systme.in(키보드)으로부터 입력받는다.
		
		
		  System.out.print("이름을 입력하세요 >>> " ); String name = sc.next();
		  
		  System.out.println("나이를 입력하세요 >>>"); int age = sc.nextInt();
		  
		  System.out.println(name); System.out.println(age);
		 
		// 연습. char 타입의 성별을 입력 받기 
		System.out.println("성별(남/여)을 입력하시오 >>>");
		char gender =sc.next().charAt(0); 
		System.out.println(gender);
		
		
		
		
		
		sc.close(); // 생략이 가능하다.
		
		
		
		
		
	}

}
