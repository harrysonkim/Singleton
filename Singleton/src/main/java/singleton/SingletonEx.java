package singleton;

public class SingletonEx {
	public static void main(String[] args) {

//		Sinpleton_01 s01 = new Sinpleton_01();
//		Sinpleton_01 s02 = new Sinpleton_01();
//		Sinpleton_01 s03 = new Sinpleton_01();
		
		//--------------------------------------------
		
		Singleton_01 s1 = Singleton_01.getInstance();
		Singleton_01 s2 = Singleton_01.getInstance();
		Singleton_01 s3 = Singleton_01.getInstance();
		
		System.out.println("s1 : " + s1);
		System.out.println("s3 : " + s2);
		System.out.println("s3 : " + s3);
		
		System.out.println("-----------------------");

		Singleton_02 s4 = Singleton_02.getInstance();
		Singleton_02 s5 = Singleton_02.getInstance();
		
		System.out.println("s4 : " + s4);
		System.out.println("s5 : " + s5);
		
		System.out.println("-----------------------");

		Singleton_03 s6 = Singleton_03.getInstance();
		Singleton_03 s7 = Singleton_03.getInstance();
		
		System.out.println("s6 : " + s6);
		System.out.println("s7 : " + s7);
			
		
		
		
		
		
		
		
	}
}
