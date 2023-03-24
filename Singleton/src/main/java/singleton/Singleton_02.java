package singleton;

// 객체 생성 시 추가 작업을 할 수 있도록 단점 보완하기

public class Singleton_02 {
	
	// 데이터
	public String data = "Apple";

	// private 생성자
	private Singleton_02() {}
	
	// 자기 객체(싱클톤 객체)에 대한 객체변수 선언
	private static Singleton_02 instance;
	
	// static 초기화 블록
	// 	클래스 변수(정적 변수)를 초기화하는 블록
	// 	정적인 시점에 {}중괄호 블록의 코들르 실행
	// 	프로그램이 시작되기 직전에 딱 한번만 실행된다
	static {

		try {
			
			// 싱글톤 객체 생성
			instance = new Singleton_02();
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}
		
	}
	
	// 싱글톤 객체 반환 메소드
	public static Singleton_02 getInstance() {
		
		return instance;
	}
	
}