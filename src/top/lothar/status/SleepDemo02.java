package top.lothar.status;
/**
 * ������ʱģ��
 * ������Դ��ͻ����
 * @author Lothar
 *
 */
public class SleepDemo02 {
	public static void main(String[] args) {
		//��ʵ��ɫ
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
	
	private int num = 50;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
			//�� �� �� ��������
			if(num<1){
				break;
			}
			//�߳�ֹͣ ͬһʱ�䣬���������߶���һ������ط���ֻ����a��������1
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����"+num--);
			//  a ����1������  ������bû��1ֻ�� --  c -- -- 
		}
	}
}