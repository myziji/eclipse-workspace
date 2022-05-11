//package xuexie;
//
//public class PassByValueVsPassByReference {
//	int x =50;
//	change(x);
//	System.out.println(x);
//
//
//	public String change(int value) {
//		value =  value*2;
//		String valueToString = valueToString.toString();
//	}
//
//
//}
////  print x 会是50，因为 x 是PBV 意思是 pass by copy 把X 复制一下传到 change
//// 把X的值 复制一下传到 change 里去 本来的x的地址是没有变得 无论这个value怎么变
//// 只是在另外一个地址上变 和X 的地址没有关系
//
//
//// PBR 是copy a memery adress 如果有东西改变 那这个原始的也会改变。 