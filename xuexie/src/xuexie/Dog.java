package xuexie;

public abstract  class Dog {
	
	// extends �̳�animal(parents)�����еĶ���
	// ��ʹdog��û�е�method ��main method ��Ҳ�ܵ��� 
	 public int y=2 ;
	
	//overriding ��animal������ͬ��method(same signature) ��dog����Ըı� ǰ����һģһ��
	// static can not be overriden !  non-static can be override
	// static ��ֱ�ӱ�������static �Ͳ���override��
	public void eat() {
		System.out.println("wang wang");
	}
	//overlording ������ͬ�����ֵ�method ��ͬ��parameter the return type can be different
	public abstract void eat1(int y);
	 public void printY(int y) {
		 System.out.print(y);
		 
	 }
	
}
