package xuexie;

public class InnerClassMain {
	
	public static void main(String[]args) {
		OuterClass outer = new OuterClass();
		outer.heyThere();
	
	
	//正常情况下(non-static)的创建obj的方便 是不对的 
	//因为你需要先创建outerclass的obj 才能用到里面的数据
	// 你现在这样是无法直接拿到这个数据的（这个Class的）因为它是在outerclass里的
	// 所以这个是错的 
	//	InnerClass inner =  new InnerClass();
	// IDE会告诉你 先去创建一个 InnerClass 的obj 才能用
	// 正确做法是先创建OuterClass 的obj 在创建 innerclass的obj 
	
		//OuterClass.InnerClass inner = outer.new InnerClass();
		 //inner.whatsUp();
		
	// static 情况下 因为已经在PG里了 所以可以直接调用 
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		 inner.whatsUp();
	
	// 情况3 local innerclass （在一个method 里创建一个class）
	
	}

}
