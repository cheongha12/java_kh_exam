package com.kh.practice.list.library.view;

import java.util.Scanner;

public class BookMenu {
	
	  private Scanner sc = new Scanner(System.in);
//   private BookController bc = new BookController();


	  //메인메뉴
	   public void mainMenu() {
	      System.out.println("===== Welcome KH Library =====");
	      System.out.println("=====***** 메인 메뉴 *****=====");
	      System.out.println("1. 새 도서 추가");
	      System.out.println("2. 도서 전체 조회");
	      System.out.println("3.도서 검색 조회");
	      System.out.println("4. 도서 삭제");
	      System.out.println("5. 도서 명 오름차순 정렬");
	      System.out.println("9. 종료");
	      System.out.print(" 메뉴 번호 입력 :");
	      int menuNum = sc.nextInt();
	      if(menuNum == 1) {
	         insertBook();
	      }
	      else if(menuNum == 2) {
	         selectList();
	      }
	      else if(menuNum == 3) {
	         searchBook();
	      }
	      else if(menuNum == 4) {
	         deleteBook();
	      }
	      else if(menuNum == 5) {
	         ascBook();
	      }
	      else if(menuNum == 9) {
	         System.out.println("프로그램을 종료합니다.");
	      }
	      else {
	         mainMenu();   //다시 받도록 반복하기
	      }
	   }
	   
	   //1.새 도서 추가용 view 메소드
	   public void insertBook() {
	      System.out.println("===== 새 도서 추가 =====");
	      System.out.println("책 정보를 입력해주세요.");
	      System.out.println("도서 명 : 갈증에 한수위");
	      System.out.println("저자 명");
	      String author = sc.nextLine();
	      System.out.println("장르(1.인문 / 2.과학 / 3.외국어 / 4.기타) : ");
	      int category = sc.nextInt();
	      
	      System.out.println("가격 :");
	      int price = sc.nextInt();
	      } 
	   
	   
	   //2.도서 전체용 view 메소드
	   public void selectList() {}
	   
	   //3.도서 검색용 view 메소드
	   public void searchBook() {}
	   
	   //4.도서 삭제용 view 메소드
	   public void deleteBook() {}
	   
	   //5.도서 명 오름차순 정렬용 view 메소드 
	   public void ascBook() {}
	   
	   
	}


