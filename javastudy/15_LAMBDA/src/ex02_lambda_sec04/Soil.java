package ex02_lambda_sec04;

public class Soil {
	
	private int totalOil = 1000;
	private int payPerLiter = 2000;
	private int earning;
	
	// 3. 메소드의 매개변수로 익명 객체 저장하기
	public int sellOil(Car car) {
		return totalOil;
	}
		
	

	public int getTotalOil() {
		return totalOil;
	}

	public void setTotalOil(int totalOil) {
		this.totalOil = totalOil;
	}

	public int getPayPerLiter() {
		return payPerLiter;
	}

	public void setPayPerLiter(int payPerLiter) {
		this.payPerLiter = payPerLiter;
	}

	public int getEarning() {
		return earning;
	}

	public void setEarning(int earning) {
		this.earning = earning;
	}
	
	
}
