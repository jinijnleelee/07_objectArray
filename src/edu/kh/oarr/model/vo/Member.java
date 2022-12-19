package edu.kh.oarr.model.vo;



public class Member {
//필드 == 맴버변수
private String memberId;
private String memberPw;
private String memerName;
private int memeberAge;
private String region; //지역(서울,경기,중복,...)


//생성자
//생성자 규칙
//1. 생성자 이름은 클래스명과 같아야한다.
//2.반환형이 없다

public Member() {}//기본생성자
public Member(String memberId, String memberPw, String memerName, int memeberAge, String region) {
//매개변수 생성자
	this.memberId = memberId;
	this.memberPw = memberPw;
	this.memerName = memerName;
	this.memeberAge = memeberAge;
	this.region = region;
	
	
}



//메소드
//getter/setter
//알트 쉬프트 s
//다 접근 가능 하도록  public
//	String 자료형 돌려보내겠다
//	매개변수가 없어서 중복된 이름이 memberId가 없기 때문에 memberId라고만 써도 ok
public String getMemberId() {
	return memberId;
}
public void setMemberId(String memberId) {

//setter는 말그대로 셋팅하는 애
//	무엇을 셋팅할지 전달받아올 아이가 필요하다 ==>매개변수
//			setter는 보통 반환 값은 없음 => void
	this.memberId = memberId;
	//모든 매서드는 종료 시 호출한 곳으로 돌아가는
//	return 구문이 작성되어야하지만 단,void일 경우 생략 가능 하다.
//			-> 생략 시 컴파일러가 자동 추가
			//return
}
public String getMemberPw() {
	return memberPw;
}
public void setMemberPw(String memberPw) {
	this.memberPw = memberPw;
}
public String getMemerName() {
	return memerName;
}
public void setMemerName(String memerName) {
	this.memerName = memerName;
}
public int getMemeberAge() {
	return memeberAge;
}
public void setMemeberAge(int memeberAge) {
	this.memeberAge = memeberAge;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}




}
