package top.lothar.info;
/**
 * ���ȼ������� ���Ǿ������ȣ�ֻ��MAX��ִ�е��������
 * MAX_PRIORITY  10
 * NORM_PRIORITY  5   Ĭ��
 * MIN_PRIORITY   1
 * poxy1.setPriority()  �̶߳����������ȼ���ʽ
 * 
 * @author Lothar
 *
 */
public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		MyThread it1 = new MyThread();
		Thread poxy1 = new Thread(it1,"MY");
		
		MyThread it2 = new MyThread();
		Thread poxy2 = new Thread(it2,"YOU");
		
		poxy1.setPriority(Thread.MIN_PRIORITY);
		poxy2.setPriority(Thread.MAX_PRIORITY);
		
		poxy1.start();
		poxy2.start();
		
		Thread.sleep(100);
		
		it1.stop();
		it2.stop();
	}

}
