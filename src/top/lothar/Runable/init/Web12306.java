package top.lothar.Runable.init;
/**
 * 一：继承Thread + run 
 *    启动：创建子类对象，对象.start()
 *    
 * 二：实现Runnable + run
 * 	     启动：创建真实角色 
 *  	      创建代理角色 Thread+引用  
 *  	      代理角色.start()
 *  
 *  推荐使用接口：
 *  	1.避免单继承局限性
 * 		2.共享资源，静态代理模式
 * @author Lothar
 *
 */
public class Web12306 implements Runnable{
	
	private int num = 50;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
			if(num<1){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"抢到"+num--);
		}
	}

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
