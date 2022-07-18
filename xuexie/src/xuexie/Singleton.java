package xuexie;

public class Singleton {
	// Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;
    
    public String s;
    
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton(){
    	s = "singleton class";
    }
    
    // Static method
    // Static method to create instance of Singleton class
    // 
    public static Singleton getInstance() {
    	// To ensure only one instance is created
    	if(single_instance==null) {
    		// if in the multiple threads you have to lock whole class, and double check if any others is in the 
    		// this block 
    		synchronized(Singleton.class) {
    			if(single_instance==null){
    				single_instance = new Singleton();
    			}
    		}
    		
    		
    	}
    	return single_instance;
    }
    
    
    
    
}
