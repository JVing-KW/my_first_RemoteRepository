package kwTest;

public class RealCalc {
//라이브러리 클래
//계산
	// 필드

	double num1, num2;

	// 생성자
	public RealCalc() {
	}

	public RealCalc(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

//메소드
	double plus() {
		double result = num1 + num2;
		return  result;

	}

	double minu() {

		double result = num1 - num2;
		return result;
	}

	double times() {
		double result = num1 * num2;
		return result;
	}

	double divid() {
		double result = num1 / num2;
		return result;
	}

}
