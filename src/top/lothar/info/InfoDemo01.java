package top.lothar.info;
/**
 * currentThread()获取该线程对象的引用
 * setName()设置线程名字
 * getName()得到线程名字
 * isAlive()判断线程是否存活
 * @author Lothar
 *
 */
public class InfoDemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
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
