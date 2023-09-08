package kwTest;

import java.util.Scanner;

public class AreaCalcTest2 {
	public static void main(String[] args) {
		
		System.out.println("===============================================");
System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트| 4.분석 | 5.종료|");
		
System.out.println("===============================================");

Scanner scan= new Scanner(System.in);

AreaCalcTest calc =	new	AreaCalcTest() ;

double num;
double tot=0;
double start = scan.nextInt();
double i =0;

 tot = start;
while(true) {
	String basicOper=scan.nextLine();
	switch(basicOper) {
	
	case"+" :
		num = scan.nextInt();
		tot = calc.plus(num,tot);
		System.out.println(tot);
		break;
	case"-" :
		num = scan.nextInt();
		tot =calc.minus(num,tot);
		System.out.println(tot);
		break;
	case"*" :
		num = scan.nextInt();
		tot=calc.times(num,tot);
		System.out.println(tot);
		break;
	case"/" :
		num = scan.nextInt();
		tot= calc.div(num,tot);
		System.out.println(tot);
		break;
		
	}
}

}

}
