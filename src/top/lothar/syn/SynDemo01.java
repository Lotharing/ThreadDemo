package top.lothar.syn;
/**
 * ���̷߳���ͬһ����Դ��ȷ����Դ��ȫ-�̰߳�ȫ
 * 
 * synchronized �߳�ͬ��   
 * 
 * 					  Integer ����
 * ͬ����      synchronized(��������|this|��.class)     
 *  
 * ��������Χ����ʱҲ������̲߳���ȫ  ���Ŀ�һ��ֻ�ܽ�һ���̶߳���
 * 
 * ͬ������  ��voidǰ��synchronized
 * 
 * �̰߳�ȫЧ�ʵ� 
 * @author Lothar
 *
 */
public class SynDemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		Web12306 web = new Web12306();
		//�����ɫ
		Thread t1 = new Thread(web,"��");
		Thread t2 = new Thread(web,"��");
		Thread t3 = new Thread(web,"��");
		//�����߳�
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}
class Web12306 implements Runnable{
	private int num = 10;
	
	private boolean flag = true;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(flag){
			test3();
		}
	}
	//�̲߳���ȫ
	public void test1(){
		if(num<1){
			flag = false;
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"����"+num--);
	}
	//�̰߳�ȫ��һ��ֻ�ܽ���һ���̶߳���
	public synchronized void test2(){
		if(num<1){
			flag = false;
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"����"+num--);
	}
	//ͬ���飬�̰߳�ȫ
	public void test3(){
		synchronized (this) {
			if(num<1){
				flag = false;
				return;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����"+num--);
		}
	}	
	
}