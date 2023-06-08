package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	private Scanner sc = new Scanner(System.in);
	
//	
//	public void recursive() {
//		recursive();
//	}
	//5*4*3*2*1
	
	public void practice4() {
		
//		위 문제와 모든 것이 동일하고, “더 하시겠습니까?”라고 추가로 물어보도록 하세요.
//		이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌
//		다른 문자를 입력했을 경우 “잘못된 대답입니다. 다시 입력해주세요.”를 출력하고
//		더 하겠냐는 물음을 반복하세요.
		
		
		
		while(true) {
		
		
		System.out.println("문자열");
		String str =sc.nextLine();
		System.out.println("문자");
		char c = sc.nextLine().charAt(0);
		System.out.println("포함된 개수");
		int count= 0;
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
				
			}
			
		}
		System.out.println("포함된 개수:"+count);
		boolean exit = false;	//while(true) 문자열 : 을 끝내고 나갈수 있도록 하기위한 변수
		while(true) {
		System.out.println("더 하시겠습니까?:(y/n) :");
		String strContinue= sc.nextLine();
		if(strContinue.equals("y")) {
			break;
		}else if(strContinue.toLowerCase().equals("n")){
			exit= true;	//while(true) 문자열: 을 끝낼수 있도록 true 대입
			break;
		}else {
			System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
		}
		}//while(true) 더 하시겠습니까?:(y/n)
		if(exit) {
			break;
		}
		}//while(true) 문자열:
	}
}	