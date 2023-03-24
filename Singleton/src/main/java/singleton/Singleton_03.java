package singleton;

public class Singleton_03 {

	// 데이터
	public String data = "Apple";
	
	// 생성자
	private Singleton_03() {}
	
	// 싱글톤 객체 변수 선언
	private static Singleton_03 instance;
	
	public static Singleton_03 getInstance() {
		
		
		// 인스턴스를 생성한 적이 없을 경우
		if ( instance == null ) {
			
			try {
				instance = new Singleton_03();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		// 싱글톤 객체 반환
		return instance;

	}

	
}
