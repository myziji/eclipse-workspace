package xuexie;

import java.io.IOException;

public  class tst {

	private final static int x=10;
	public static void main(String[] args) throws IOException {
		Immutable imm = new Immutable(3);
		System.out.println(imm.getX());
		imm = new Immutable(4);
		System.out.println(imm.getX());
		
		String str ="";
	}
	
	
}
