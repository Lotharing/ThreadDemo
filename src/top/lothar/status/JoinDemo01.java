package top.lothar.status;
/**
 * 合并线程 join
 * @author Lothar
 *
 */
public class JoinDemo01 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		JoinDemo01 join = new JoinDemo01();   
		Thread t = new Thread(join);		//新生  
		t.start();							//就绪
		//cpu调度运行
		for(int i = 0 ; i < 100 ; i++){
			if(i==80){
				t.join();//main阻塞
			}
			System.out.println("main --"+i);
		}
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("join in ...");
		}
	}

}

