import java.util.Scanner;

import ex04_has_a_inherit.Soldier;

public class Practice {

	public static void main1(String[] args) {
		
		
	
		// 문제1. 점수와 학년을 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
		//	4학년인 경우 70점 이상이어야 합격이다.
		// 점수를 입력하세요(0~100) >>> 65
		// 학년을 입력하세요(1~4) >>>1.
		// 합격!
		
		// 점수를 입력하세요(0~100)>>> 65
		// 학년을 입력하세요(1~4) >>> 4
		// 불합격!
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100)>>> ");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요(1~4) >>>");
		int year = sc.nextInt();
		
		if(score >= 60) { // 60점 이상 합격
				if(year != 4)
					System.out.println("합격!"); // 4학년 아니면 합격
				else if (score >= 70)
					System.out.println("합격!"); // 4학년 70 이상이면 합격
				else 
				System.out.println("불합격!"); // 4학년이 70 미만이면 불합격
		} else {
				System.out.println("불합격!");
		}
			sc.close();
			
		
		
		
		
		
		
		
		
		
			
		
		
		
		// 문제 2. 커피 메뉴를 입력받아 가격을 알려주는 프로그램을 구현하시오. Switch 문을 이용하여 구현하시오.
		// ( 에스프레소, 카푸치노, 카페라떼 3500원, 아메리카노는 2000원이다.)
		
		// 무슨 커피드릴까요 >>> 에스프레소
		// 에스프레소는 3500원입니다.
		
		// 무슨 커피드릴까요? >>> 아메리카노
		// 아메리카노는 2000원입니다.
		
		// 무슨 커피드릴까요? >>> 밀크커피
		// 밀크커피는 메뉴에 없습니다.
		
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("무슨 커피 드릴까요? >>>");
			String order = sc1.next();
			int price = 0;
			switch(order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
					price = 3500;
					break;
			case "아메리카노":
					price = 2000;
					break;
			default:
				System.out.println(order + "는 메뉴에 없습니다");
			
			}
				
			if (price !=0)
				System.out.println(order + "는" + price + "원입니다.");
			
			sc1.close();
			
		
		
		// 문제 3. 돈을 입력받아 오만원권, 만원권, 오천원권, 천원권, 오백원 동전, 백원동전,
		// 오십원 동전, 십원 동전, 일원 동전이 각각 몇 개로 변화되는지 출력하시오.
		// 이 때 반드시 다음과 같은 배열을  사용하여 반복문으로 처리하시오.
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		int[] count = new int[unit.length];
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("금액 입력 >>> ");
		int money = sc2.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			count[i] = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "원 " + count[i] + "개");
		}
		sc2.close();
		
		
		//문제 4. 정수를 몇 개 저장할지(최대 100개) 입력받아서 해당 길이를 가진 배열을 생성하고,
		//        이곳에 1에서 100사이 범위의 정수를 랜덤하게 삽입하시오. 같은 값은 생성하지 못하도록
		//        설정하고 생성된 배열을 출력하시오.
		
		// 몇 개의 랜덤을 생성할까요? >>> 150
		// 다음에는 1~100사이로 입력하세요!
		
		// 몇 개의 랜덤을 생성할까요? >>> 25
		// 29    64    47    14    37    61    83    33    65    96
		// 48    44    92    77    70    34    23    35    13    68
		// 74    15    67    42    38
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("몇 개 생성할까요? >>> ");
		int count1 = sc3.nextInt();
		
		if(count1 < 1 || count1 > 100) {
			System.out.println("1~100 사이만 가능합니다.");
			           return;
		}
		
		int[] arr = new int[count1];
			// 배열 arr에 난수(1~100) 저장
			// 중복 생성되면 재생성
		for(int i = 0; 1 < arr.length; i++) {
			// random 검사 메소드
			// 중복이 있으면 true 반환, 중복이 없으면 false 반환
			// exists(배열 arr, 인덱스, 난수)
		//	if(exits(arr,i,random)) {
					i--; 
					continue;
			}
			//	arr[i] = random;
		}
		
		
		
		// 문제 5. 3명의 학생의 점수를 입력 받아서 평균 점수와 1등의 이름과 꼴등의 이름을
		// 출력하시오.
		
		// 피카츄의 점수 입력 >>> 75
		// 뽀로로의 점수 입력 >>> 95
		// 브레드의 점수 입력 >>> 85
		
			
						
						
				
					
		
		
		// 문제 6. 랜덤으로 윷놀이를 구현하시오. 도개걸윷모 중 랜덤 생성하여 이동 횟수와 함께
		// 화면에 출력하시오. 윷이나 모가 나오면 계속 랜덤 생성하여 총 이동 횟수를
		// 계산하여 출력하시오.
		// 도 : 1칸 이동
		// 개 : 2칸 이동
		// 걸 : 3칸 이동
		// 윷 : 4칸 이동
		// 모 : 5칸 이동
		
		
		// 예시1)
		// 개, 2칸 이동한다.
		// 예시2)
		// 윷, 걸, 7칸 이동한다.
		
			String[] yut = {
						 "", // 더미 요소 (사용안함)
						 "도",
						 "개",
						 "걸",
						 "윷",
						 "모"
			};
				int total = 0;{
			while(true) {
				// 이동횟수 == 인덱스 -> 난수 처리
				int move = (int)(Math.random() * 5) + 1;
				
				total += move;
				
				if(move <= 3) {
					System.out.println(yut[move] + ", " + total + "칸 움직인다.");
						break;
				} else {
					System.out.println(yut[move] + ", ");
				}
			}
		
		
		
		// 문제 7. 경과시간을 맞추는 게임을 작성하시오. 첫 번째 <Enter>를 누르면 해당 시점의 초시간을 보여주고,
		// 두번째 <Enter>를 누르면 해당 시점의 초 시간을 다시 보여준다.
		// 여기서 10초에 근접하도록 < Enter>를 누른 사람이 이기는 게임이다.
		
		// 힌트
		// 1. <Enter>를 누른다. : Scanner 클래스의 nextLine() 메소드는 <Enter>를 인식함
		// 예) <Enter>를 누르면 1000이 출력되는 코드
		// Scanner sc = new Scanner(System.in);
		// sc.nextLine();
		// System.out.println(1000);
		// 2. 경과 시간 : System.currentTimeMillis()를 이용해 <Enter>를 누른 시간을 2개 구하고.
		// 그 차이를 구한 뒷 0.001을 곱하면 초 단위로 결과를 확인할 수 있다.
		
		// 강아지님 시작하려면 <Enter>를 누르세요
		// === 시작 시간(초) : 10
		// 10초가 된 것 같으면 <Enter>를 누르세요.
		// === 종료 시간(초) : 17
		// 고양이님 시작하려면 <Enter>를 누르세요.
		// === 시작시간(초): 21
		// 10초가 된 것 같으면 <Enter>를 누르세요.
		// === 종료 시간(초) : 29
		// 강아지님 결과 7초, 고양이님 결과 8초, 승자는 고양이님입니다.
		
		
		
		
		
		
		
		// 문제 8. 다음 main 메소드를 참고하여 Watch 클래스를 구현하시오.
		
		//public static void main(String[] args) {
			
			//Watch watch = new Watch(16, 15, 30);
			
			//watch.addHour(25);        // 25시간 후 (1시간)
			//watch.addMinute(61);	 // 61분 후 (1시간 1분)
			//watch.addSecond(3661);   // 3661초 후(1시간 1분 1초)	
			
			//watch.see();  // 19시 17분 31초
			
		// }
			
		
		
		// 문제 9. 다음 main 메소드를 참고하여 BankAccount 클래스를 구현하시오.
		
				// public static void main(String[] args) {
					 
				//	 BankAccount me = new BankAccount("1234", 10000);
					// BankAccount mom = new BankAccount("4321", 100000);
					 
				//	 me.deposit(10000);  // 내 계좌에 10000원 입금
				//	 me.deposit(-100);	 // 내 계좌에 마이너스 입금(불가)
					 
				//	 me.withdraw(5000);  // 내 계좌에 5000원 출금
				//	 me.withdraw(100);	 // 내 계좌에서 잔액보다 큰 금액 출금(불가)
					 
				//	 me.inquiry(); // 계좌번호 1234, 잔액: 15000원
					 
				//	 mom.transfer(me, 50000); // 엄마가 나에게 50000원 이체
				//	 mom.transfer(me, -100);  // 실패
			   //	 mom.transfer(me, 100000000); // 실패
					 
				//	 me.inquiry()// 계좌번호 : 1234, 잔액 64900원
				 }

		
				 // 계좌번호 : 1234, 잔액 : 14900원
				 // 계좌번호 : 4321, 잔액 : 50000원
				 // 계좌번호 : 1234, 잔액 : 64900원
				 
				 
		
				 
		// 문제 10. 다음 main 메소드를 참고하여 Gun 클래스와 Soldier 클래스를 구현하시오.
		
				 public static void main(String[] args) {
					 
				//	 Gun gun = new Gun("K2", 2); // 모델명, 총알수
					// Soldier soldier = new Soldier("람보", gun); // 군인명, 총
					 
				//	 soldier.shoot(); // 빵야! 1발 남았다.
				//	 soldier.shoot(); // 빵야! 0발 남았다.
				//	 soldier.shoot(); // 헛빵!
					  
				//	 soldier.reload(3);	// 3발이 장전되었다. 현재 3발.
				//	 soldier.reload(6); // 3발이 장전되었다. 현재 6발.
				//	 soldier.reload(6); // 0발이 장전되었다. 현재 6발.
					 
				//	 soldier.info();
					 
				 }
		
					// 빵야! 1발 남았다.
				 	// 빵야! 0발 남았다.
				 	// 헛빵!
				 	// 3발 장전되었다. 현재 3발
				 	// 3발 장전되었다. 현재 6발
				 	// 0발 장전되었다. 현재 6발
				 	// 람보 : K2(6)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


