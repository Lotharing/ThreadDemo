package top.lothar.info;
/**
 * 优先级，概率 不是绝对优先，只是MAX方执行的相对优先
 * MAX_PRIORITY  10
 * NORM_PRIORITY  5   默认
 * MIN_PRIORITY   1
 * poxy1.setPriority()  线程对象设置优先级方式
 * 
 * @author Lothar
 *
 */
public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
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
