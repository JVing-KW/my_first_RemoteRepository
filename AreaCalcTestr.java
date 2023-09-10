package basice2;

import java.util.Scanner;

public class AreaCalcTestr {




	public static void main(String[] args) {
		
		System.out.println("===============================================");
System.out.println("계산");
		
System.out.println("===============================================");

Scanner scan= new Scanner(System.in);

//AreaCalcTest calc =	new	AreaCalcTest() ;

double num=0 ;
double tot=0 ;

//AreaCalcTestr calc1 =new AreaCalcTestr();

AreaCalcTest3 calc= new AreaCalcTest3(num,tot);

double start = scan.nextInt();


 tot = start;
while(true) {
	String basicOper=scan.nextLine();
	switch(basicOper) {
	
	case"+" :
		num = scan.nextInt();
		tot = calc.plus();
		System.out.println(tot);
		break;
	case"-" :
		num = scan.nextInt();
		tot =calc.minus();
		System.out.println(tot);
		break;
	case"*" :
		num = scan.nextInt();
		tot=calc.times();
		System.out.println(tot);
		break;
	case"/" :
		num = scan.nextInt();
		tot= calc.div();
		System.out.println(tot);
		break;
		
	}
}

}

}

