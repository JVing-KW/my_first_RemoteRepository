package basice2;

public class AreaCalcTest3 {
	// 필드 선언
	// 객체 외부나 내부에서 사용할 수 있
	double num;
	double tot;
	// 필

	// 생

	public AreaCalcTest3(double num, double tot) {
		this.num=num;
		this.tot=tot;
	}
//  생성자 
//	public AreaCalcTest3(double num, double tot) {
//	this.num=num;
//	this.tot=tot;
//	}

	public double plus() {
		tot = tot + num;
		return tot;
	}

	public double minus() {
		tot = tot - num;
		return tot;
	}

	public double times() {
		tot = tot * num;
		return tot;
	}

	public double div() {
		tot = tot / num;
		return tot;
	}
}
