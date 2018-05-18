package top.lothar.info;

public class MyThread implements Runnable{
	
	private boolean flag = true;
	
	private int num = 0;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(flag){
			System.out.println(Thread.currentThread().getName()+""+num++);
		}
	}
	public void stop(){
		this.flag=false;
	}

}
