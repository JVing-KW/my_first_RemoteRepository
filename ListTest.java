package collection1;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		
		//자료의 갯수를 고정하지 않은 상태에서 저장하는 자료구조는 List (인터페이스)
		
		// 고정된 데이터값 배열
		// 고정되지 않은 데이터 list
		
		//List 인터페이스를 구현한 ArrayList가 있다.
		//ArrayList 객체를 만들어보기
		
		// generic 포괄적인 < > 쓰고, 기본형을 감싼 타입인 wrapper 클래스인 Integer,Double
		
		// list 는 타입형태가 raw 로 기본형과 다른 형태로 타입 설정을 해준다
		ArrayList<Integer> arraylist	=	new ArrayList<Integer> ();
		System.out.println(arraylist);
		arraylist.add(30);
		System.out.println(arraylist);
		//Object 옛날 클래스
		arraylist.add(40);
		System.out.println(arraylist);
		arraylist.add(50);
		System.out.println(arraylist);
		arraylist.add(60);
		System.out.println(arraylist);
		arraylist.add(70);
		
		
	
		System.out.println(arraylist);
		// 1) 인덱싱으로 값 가져와서 누적값 구하는 건 좀 더 배운 후
//		for(int i =0,tot=0;i <arraylist.size();i++) {
//			System.out.println(arraylist.get(i));
//			
//			int value= (arraylist.get(i)); // 에러남
//			
//			tot +=value;
		
		int tot =0;
        int i = 0;
		for(int value : arraylist) {
			System.out.println(i+1 +"번 list : " +arraylist.get(i));
			i++;
			tot +=value;
		}
		System.out.println(tot/arraylist.size());
		
	
		
		}

		
	}


