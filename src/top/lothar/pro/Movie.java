package top.lothar.pro;
/**
 * 一个场景，共同的资源
 * 生产者消费者模式，信号灯法
 * notifyAll  唤醒在此对象监视器下的所有线程
 * wait 其他线程调用此对象的notify方法时  该线程等待  等待释放锁
 * @author Lothar
 *
 */
public class Movie {
	
	private String pic;
	//信号灯    true 时生产  消费者等待  生产完成通知消费者
	//		flase  消费 生产者等待 消费完成通知生产者
	
	private boolean flag = true;
	public synchronized void play(String pic){
		if(!flag){  //生产者等待 
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//开始生产
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("生产了"+pic);
		//生产完毕
		this.pic=pic;
		//通知消费
		this.notify();
		//生产者停下
		this.flag=false;
	}
	
	public synchronized void watch(){
		if(flag){  //消费者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//开始消费
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		System.out.println("消费了"+pic);
		//消费完毕，通知生产
		this.notifyAll();
		//消费停止，生产开始
		this.flag=true;
	}
}
