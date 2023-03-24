package singleton;

public class Singleton_01 {

// 단점
	
// 1. 인스턴스를 사용하지 않아도 미리 생성해놓는다
// 2. 인스턴스를 생성할 때 추가 코드를 작성할 수 없다.
//	=> 예외 처리 코드를 작성할 수 없다
// 3. 
	
	
	
	
	// 데이터
	public String data = "Apple";

	//pricate 디폴트 생성자
	private Singleton_01() {}

	// 자신 클래스에 대한 객체 생성
	// static키워드 코드 수행 시점을 조절
	// (프로그램이 실행될 때 한 번 수행)
	
	// 정적이 타이밍(프로그램 실행 시)에 딱 한번 실행되어 유지
	private static Singleton_01 instance = new Singleton_01();

	// 싱글톤 객체를 반환하는 메소드
	// getter
	// 읽기전용 getInstance메소드를 생성
	public static Singleton_01 getInstance() {

		
		
		return instance;
		
	}
	
	
}
