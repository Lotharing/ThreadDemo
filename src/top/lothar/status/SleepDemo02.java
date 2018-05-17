package top.lothar.status;
/**
 * 网络延时模拟
 * 并发资源冲突问题
 * @author Lothar
 *
 */
public class SleepDemo02 {
	public static void main(String[] args) {
		//真实角色
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
	
	private int num = 50;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
			//你 我 他 都进来了
			if(num<1){
				break;
			}
			//线程停止 同一时间，你我他三者都以一到这个地方，只不过a先醒拿走1
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到"+num--);
			//  a 拿着1到这里  ，但是b没有1只能 --  c -- -- 
		}
	}
}