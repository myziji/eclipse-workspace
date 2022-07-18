package xuexie;

public class BaseA {
	String instanceId;
	public BaseA(String instanceId) {
		this.instanceId = instanceId;
	
	}
	public BaseA() {
		
	
	}
	public void printInstanceName() {
		System.out.print(this.instanceId);
	}
}
