package top.lothar.syn;
/**
 * 多线程访问同一个资源，确保资源安全-线程安全
 * 
 * synchronized 线程同步   
 * 
 * 					  Integer 对象
 * 同步块      synchronized(引用类型|this|类.class)     
 *  
 * 当锁定范围不当时也会造成线程不安全  锁的块一次只能进一个线程对象
 * 
 * 同步方法  在void前加synchronized
 * 
 * 线程安全效率低 
 * @author Lothar
 *
 */
public class SynDemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		Web12306 web = new Web12306();
		//代理角色
		Thread t1 = new Thread(web,"你");
		Thread t2 = new Thread(web,"我");
		Thread t3 = new Thread(web,"他");
		//启动线程
		
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
		// TODO 自动生成的方法存根
		while(flag){
			test3();
		}
	}
	//线程不安全
	public void test1(){
		if(num<1){
			flag = false;
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到"+num--);
	}
	//线程安全，一次只能进来一个线程对象
	public synchronized void test2(){
		if(num<1){
			flag = false;
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"抢到"+num--);
	}
	//同步块，线程安全
	public void test3(){
		synchronized (this) {
			if(num<1){
				flag = false;
				return;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到"+num--);
		}
	}	
	
}