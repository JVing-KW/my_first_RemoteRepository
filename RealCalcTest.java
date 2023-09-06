package kwTest;

import java.util.Scanner;

//실행함
public class RealCalcTest {

	public static void main(String[] args) {
		RealCalc calc = new RealCalc();

		// num1 , 연산자 , num2 스캐너 연산자

		// 연산자 4개 스위치
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();

		for (int i=0;;i++) {
			String input = scan.nextLine();
			if (input.equals("+")) {
				double num2 = scan.nextDouble();
				System.out.println(calc.plus());
				if( num2 == 0) {
					break;
				}

			} else if (input.equals("-")) {
				double num2 = scan.nextDouble();
				System.out.println(calc.minu());
				if( num2 == 0) {
					break;
				}

			}

			else if (input.equals("*")) {
				double num2 = scan.nextDouble();
				System.out.println(calc.times());
				if( num2 == 0) {
					break;
				
				}

			} else if (input.equals("/")) {
				double num2 = scan.nextDouble();
				if( num2 == 0) {
					break;
				
				}
				
				System.out.println(calc.divid());
				
			}
			

		}

	}

}
