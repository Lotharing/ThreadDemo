package top.lothar.info;
/**
 * currentThread()��ȡ���̶߳��������
 * setName()�����߳�����
 * getName()�õ��߳�����
 * isAlive()�ж��߳��Ƿ���
 * @author Lothar
 *
 */
public class InfoDemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		MyThread it = new MyThread();
		Thread poxy = new Thread(it,"MY");
		
		poxy.setName("Myy");
		System.out.println(poxy.getName());
		System.out.println(Thread.currentThread().getName());  //main
		
		poxy.start();
		System.out.println(poxy.isAlive());
		
		Thread.sleep(20);
		it.stop();
		Thread.sleep(10);
		System.out.println(poxy.isAlive());
		
	}

}
