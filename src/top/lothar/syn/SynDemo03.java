package top.lothar.syn;
/**
 * 过多的同步方法容易造成死锁
 * @author Lothar
 *
 */
public class SynDemo03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Object g = new Object();
		Object m = new Object();
		
		Test t1 = new Test(g, m);
		Test t2 = new Test(g, m);
		
		Thread poxy1 = new Thread(t1);
		Thread poxy2 = new Thread(t1);
		
		poxy1.start();
		poxy2.start();
	}

}
class Test implements Runnable{
	
	Object goods;
	Object money;
	
	public Test(Object goods , Object money){
		this.goods=goods;
		this.money=money;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		test();
	}
	
	
	public void test(){
		synchronized (goods) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			synchronized (money) {
				
			}
		}
		System.out.println("一手给货");
	}
	
}

class Test2 implements Runnable{
	
	Object goods;
	Object money;
	
	public Test2(Object goods , Object money){
		this.goods=goods;
		this.money=money;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		test();
	}
	
	
	public void test(){
		synchronized (money) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			synchronized (goods) {
				
			}
		}
		System.out.println("一手给钱");
	}
	
}
