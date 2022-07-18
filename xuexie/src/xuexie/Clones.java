package xuexie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clones implements Cloneable{
	private int x = 3;
	//Deep Copy vs Shallow Copy
	//Shallow copy is the method of copying an object address
	//if you make any change with the old one, it will reflect to the new one
	//deep copy will be not reflect others.(create in constructor)
	//Shallow copy .clone()
	//In shallow copy, only fields of primitive data type are copied while the objects references are not copied. 
	//Deep copy involves the copy of primitive data type as well as object references.
	//deep copy override clone method create a new instance set value and return this instance
	int[] y = {1,2,3};
	Movie m1 = new Movie("Return of the Jedi", 8.4, 1983);
	
	
	public  static void main(String agrs[]) {
		Clones c = new Clones();
		try {
		Clones c1 = (Clones)c.clone(); //shallow copy 
		c1.m1.setName("12333");
		Lock lock = new ReentrantLock();
		c.m1.setName("Empire Strikes Back");
		List<Integer> arr =  new CopyOnWriteArrayList<>();
		arr.add(1);
		System.out.println(c.m1.getName());
		System.out.println(c1.m1.getName());
		} catch (CloneNotSupportedException e) {
			
			
			e.printStackTrace();
		}
	}
	
	
	
	
}
