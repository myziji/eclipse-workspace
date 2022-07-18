package xuexie;

public class Singleton1 {

	public static Singleton1 singleton_instance = null;
	
	public static Singleton1 getInstance() {
		if(singleton_instance==null) {
			synchronized(Singleton.class){
				if(singleton_instance==null) {
					return singleton_instance = new Singleton1();
				}
			}
		}
		return singleton_instance;
	}
	
}
