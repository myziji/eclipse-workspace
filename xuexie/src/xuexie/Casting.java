package xuexie;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xuexie.Immutable;
public class Casting {

	public static void main(String[] args) {
	
		
	// Ҫ��up or down casting �������м̳еĹ�ϵ extends something	
	//upcasting  ������dog object to animal
	// Animal myAnimal = new Dog();
    // 
	

	Map<String,String> map = new HashMap<>();
	ConcurrentHashMap<String,String> map2 = (ConcurrentHashMap)map;
	
	String s = new String("123") ;
	String s1 ="123";
	String s3 ="123";
	String s4 ="123";
	String s2 = new String("123") ;
	System.out.print(s1==s3);
	System.out.print(s2.equals(s));
	}

}