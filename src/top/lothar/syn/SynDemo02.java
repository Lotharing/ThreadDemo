package top.lothar.syn;
/**
 * ����ʱ���±ߵľ�̬����1234 ������һĨȥ
 * @author Lothar
 *
 */
public class SynDemo02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�ڶ��߳��в�syn�����ͬһ������ʵ�����ַ��һ��,ʵ��ʱ��syn��ַ�ͻ�һֱ
		 JvmThread jv1 = new JvmThread(100);
		 JvmThread jv2 = new JvmThread(100);
		 jv1.start();
		 jv2.start();
	}

}

class JvmThread extends Thread{
	
	private long time;
	
	public JvmThread(long time){
		this.time=time;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println(Thread.currentThread().getName()+"����"+Jvm.getInstance(time));
	}
}

class Jvm{
	/**
	 * ����ģʽ
	 * ȷ��һ����ֻ��һ������
	 * ����ʽ
	 * 1.������˽�л�
	 * 2.����˽�о�̬����
	 * 3.����һ�����⹫���ľ�̬���������ʸñ���������ñ���û�ж����򴴽�����
	 */
	private static Jvm instance = null;
	//������˽�л��������ⲿֱ�Ӵ�������
	private Jvm(){
		
	}
	//����һ�����⹫���ľ�̬���������ʸñ���������ñ���û�ж����򴴽�����
	public static synchronized Jvm getInstance2(long time){
		if(null==instance){
			try {
				Thread.sleep(time); //��ʱ
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
	
	//����һ�����⹫���ľ�̬���������ʸñ���������ñ���û�ж����򴴽�����   
	//ͬ���� Ч�ʲ���
		public static Jvm getInstance1(long time){
			synchronized (Jvm.class) {
				if(null==instance){
					try {
						Thread.sleep(time); //��ʱ
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					instance = new Jvm();
				}
			}
			return instance;
		}
		
		
		public static Jvm getInstance(long time){
				//Ч��  ���ڶ���Ҳ��Ҫ�ȴ�
				if(null==instance){
					
					synchronized (Jvm.class) {
						try {
							Thread.sleep(time); //��ʱ
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
						instance = new Jvm();
					}
				}
			return instance;
		}
}
