package top.lothar.status;
/**
 * 线程的停止
 * sleep也是停止的一种方式  直接可是设置时间
 * @author Lothar
 *
 */
public class YieldDemo01 extends Thread{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		YieldDemo01 y = new YieldDemo01();
		Thread t = new Thread(y); //新生
		t.start();				//就绪
		//cpu调度运行
		for(int i = 0 ; i < 100 ; i++){
			if(i%20==0){
				Thread.yield();  //暂停主线程
			}
			System.out.println("main--"+ i);
		}
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("Yield--"+i);
		}
	}
}
