package top.lothar.syn;

public class MyJvm {
/**
 * ����ʽ
 */
	private static MyJvm instance;
	
	private MyJvm(){
		
	}
	
	public static MyJvm getInstance(){
		if(null==instance){   //�ṩЧ��
			synchronized (MyJvm.class) {
				if(null==instance){   //��ȫ����
					instance = new MyJvm();
				}
			}
		}
		return instance;
	}

}


class MyJvm2 {
/**
 * ����ʽ
 * 1.������˽�л�
 * 2.����˽�о�̬���ԣ�ͬʱ��������
 * 3.�����ṩ�������ʾ�̬����
 */
	private static MyJvm2 instance = new MyJvm2();
	
	private MyJvm2(){
		
	}
	
	public static MyJvm2 getInstance(){
		
		return instance;
	}

}

class MyJvm3{
	//�ӻ���ļ���ʱ��
	private static class JvmHandle{
		private static MyJvm3 instance = new MyJvm3();
	}
	
	private MyJvm3(){
		
	}
	
	public static MyJvm3 getInstance(){
		
		return JvmHandle.instance;
	}
}
