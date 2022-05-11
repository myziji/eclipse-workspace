package xuexie;

public class OuterClass {

	int number=6;
	
	public  void heyThere() {
		System.out.println("hey there!");
		
		//情况3
		// 这种情况只能在里面call这个class 其他地方都不行，因为它是在method里的
		
		class LocalInnerClass{
			String localInnerClassVariable = "here's Johnny";
			
			public void printLocalInnnerClassVariable() {
				System.out.println(localInnerClassVariable);
			}
			
			
		}
	
		LocalInnerClass lic = new LocalInnerClass();
		lic.printLocalInnnerClassVariable();
	
	}
	
	// 情况1 
//	public class InnerClass{
//		
//		int innerNumber =9;
//		
//		public void whatsUp() {
//			System.out.println("what's up from the Innere Class");
//		}
//	}
	
	//情况2
//	public static class InnerClass{
//		
//		int innerNumber =9;
//		
//		public void whatsUp() {
//			System.out.println("what's up from the Innere Class");
//		}
//	}
//	
	
}
