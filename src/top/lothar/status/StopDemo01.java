package top.lothar.status;
/**
 * 新生 就绪 运行 就绪 死亡  五种状态
 * 停止线程的方式：
 * 1.自然终止，线程体执行完毕
 * 2.外部干涉
 * 		1.线程类中定义定义线程体使用的标识
 * 		2.while 线程体使用该标识
 * 		3.提供对外方法改变该标识
 * 		4.根据外部条件调用该方法
 * @author Lothar
 *
 */
public class StopDemo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Study s = new Study();
		
		new Thread(s).start();
		
		for(int i =0 ;i<100;i++){
			if(80==i){
				s.stop();
			}
			System.out.println("main - -"+i);
		}
	}

}
class Study implements Runnable{

	private boolean flag = true;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(flag){
			System.out.println("study ...");
		}
	}
	
	public void stop(){
		this.flag = false;
	}
}
