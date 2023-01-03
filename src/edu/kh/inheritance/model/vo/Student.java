package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// extends
	// Student 클래스에 Person 클래스 내용을 확장한다.
	// == Student 클래스에 Person 클래스 내용 (속성, 기능)이 추가됨.
	
	// 필드
//	private String name;		// 이름
//	private int age;			// 나이
//	private String nationality; // 국적
	private int grade;			// 학년
	private int classRoom;		// 학급
	
	// 생성자
	public Student() { // 기본 생성자
		// Student() 객체 생성시
		// 내부에 상속받은 Person 객체를 생성하기 위한
		// Person 생성자 호출 코드가 필요하다 !

		// Person(); (잘못된 작성법) == super()
		super(); // super 생성자
		// 부모의 생성자를 호출하는 코드
		// 반드시 자식 생성자 최상단에 작성 !
		
		// * super() 생성자 미작성시
		// 컴파일러가 컴파일 단계에서 자동으로 추가해줌
	} 
	
	public Student(String name, int age, String nationality, int grade, int classRoom) {
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
		
		// super() 생성자
		// 1. 자신 내 부모객체 생성
		// 2. 부모객체 생성 시 초기화
	}

	// 메소드
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRomm) {
		this.classRoom = classRomm;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " / " + grade + " / " + classRoom;
	}
}
