package xuexie;

public class OuterClass {

	int number=6;
	
	public  void heyThere() {
		System.out.println("hey there!");
		
		//���3
		// �������ֻ��������call���class �����ط������У���Ϊ������method���
		
		class LocalInnerClass{
			String localInnerClassVariable = "here's Johnny";
			
			public void printLocalInnnerClassVariable() {
				System.out.println(localInnerClassVariable);
			}
			
			
		}
	
		LocalInnerClass lic = new LocalInnerClass();
		lic.printLocalInnnerClassVariable();
	
	}
	
	// ���1 
//	public class InnerClass{
//		
//		int innerNumber =9;
//		
//		public void whatsUp() {
//			System.out.println("what's up from the Innere Class");
//		}
//	}
	
	//���2
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
