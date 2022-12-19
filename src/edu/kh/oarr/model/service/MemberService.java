package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	
	
	private Scanner sc= new Scanner(System.in);
	
	//Member 5칸 짜리 객체 배열 선언 및 할당
	
	private Member[] memberArr = new Member[5];

	//현재 로그인한 정보를 저장할 변수 선언
	private Member loginMember = null;
	
	public MemberService() { //기본생성자
		//memberArr 배열 0,1,2 인덱스 초기화
		memberArr[0] = new Member("user01","pass","홍길동",30,"서울");
		memberArr[1] = new Member("user02","pass2","홍길슨",20,"경기");
		memberArr[2] = new Member("user03","pass3","홍길길",35,"양양");
	
	}
	
	//메뉴 출력용 메서드
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("\n회원정보관리프로그램");
			System.out.println("1 회원가입");
			System.out.println("2 로그인");
			System.out.println("3 회원정보조회");
			System.out.println("4회원정보수정");
			System.out.println("5회원검색(지역)");
			System.out.println("0프로그램종료");
			
			System.out.println("메뉴 입력>>>");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			
		switch(menuNum ) {
		case 1 : break;
		case 2 : break;
		case 3 : break;
		case 4 : break;
		case 5: break;
		case 0 : break;
		default : System.out.println("\n잘못 입력 하셨습니다");
		}
		
		
		}while(menuNum !=0); 
			
	}
	
		
		public String signUp() {
			System.out.println("회원가입");
			//새로운 회원 정보를 저장할 공간이 있ㄲ는지 확인하고
		int index = emptyIndex();
		System.out.println("현재 회원수"+index);
		
		
			
		//memberArr의 비어있는 인덱스 번호를 반환하는 매서드
		//단 비어있는 인덱스가 없으면 -1 반환
		
		public  int  emptyIndex() {
			//memberArr배열을 0번 인덱스부터 끝까지 접근해서
			//참조하는 값이 null인 경우 인덱스를 반환
			
			for(int i =0; i<memberArr.length; i++) {
				if(memberArr[i] ==null) {
					return i;
				}
			}
			
			return -1;
		}

	
	
	//회원 가입 메서드
	public String login() {
	
		
		//1) memberArr배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
			//2)회원정보(memberArr[i]의 아이디, 비밀번호와)
		//입력받ㅈ은 아이디, 비밀번호가 같은지 확인 
					//3)로그인 회원정보 객체(member)를 참조하는 변수  login
	//	Member에 현재 접근중인 memberArr[i]요소에 저장된 주소를 얕은 복사
		
		
		//4 로그인성공/실패 여부에 따라 결과값 반환
		return "";
		
	}
	}

