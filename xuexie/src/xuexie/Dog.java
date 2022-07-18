package xuexie;

public abstract  class Dog {
	
	// extends 继承animal(parents)里所有的东西
	// 即使dog里没有的method 到main method 里也能调用 
	 public int y=2 ;
	
	//overriding 在animal里有相同的method(same signature) 在dog里可以改变 前提是一模一样
	// static can not be overriden !  non-static can be override
	// static 是直接报错，两个static 就不是override了
	public void eat() {
		System.out.println("wang wang");
	}
	//overlording 就是相同的名字的method 不同的parameter the return type can be different
	public abstract void eat1(int y);
	 public void printY(int y) {
		 System.out.print(y);
		 
	 }
	
}
