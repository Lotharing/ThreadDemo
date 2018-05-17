package top.lothar.Thread.init;
/**
 * main是主线程
 * 开辟通道，让rabbit tortoise 和main 同时跑 多线程
 * 程序是静态的代码块
 * 进程是执行代码块
 * 操作系统可以同时运行多个进程
 * 一个进程可以开辟多个通道运行多个线程
 * 多线程共享进程中的资源和内存，在同一时间片只能有一个线程在执行
 * @author Lothar
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Rabbit rbt = new Rabbit();
		Tortoise toi = new Tortoise();
		
		rbt.start();
		toi.start();
		
		for(int i = 0 ;i < 110 ; i++){
			System.out.println("main-->"+i);
		}
	}

}
