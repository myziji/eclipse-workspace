package xuexie;

public class InnerClassMain {
	
	public static void main(String[]args) {
		OuterClass outer = new OuterClass();
		outer.heyThere();
	
	
	//���������(non-static)�Ĵ���obj�ķ��� �ǲ��Ե� 
	//��Ϊ����Ҫ�ȴ���outerclass��obj �����õ����������
	// �������������޷�ֱ���õ�������ݵģ����Class�ģ���Ϊ������outerclass���
	// ��������Ǵ�� 
	//	InnerClass inner =  new InnerClass();
	// IDE������� ��ȥ����һ�� InnerClass ��obj ������
	// ��ȷ�������ȴ���OuterClass ��obj �ڴ��� innerclass��obj 
	
		//OuterClass.InnerClass inner = outer.new InnerClass();
		 //inner.whatsUp();
		
	// static ����� ��Ϊ�Ѿ���PG���� ���Կ���ֱ�ӵ��� 
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		 inner.whatsUp();
	
	// ���3 local innerclass ����һ��method �ﴴ��һ��class��
	
	}

}
