package xuexie;

public class A {
	
	class B{};
	static class C{};
	void foo1() {
		class D{};
	}
	
	void foo2() {
		class D{};
	}
	
	public static void main(String[] args) {
		A a =new A();
		A.B b = a.new B();
		A.C c = new A.C();
		// A.C c1 = a.new C(); static c 
		I i = new I() {
			@Override
			public void foo() {};
		};
	
	

	}
	
}	
	interface I{
		void foo();
		
	}
