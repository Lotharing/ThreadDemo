package top.lothar.Thread.init;

public class Tortoise extends Thread{
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ; i < 80 ; i++){
			System.out.println("乌龟走了"+i+"步");
		}
	}
}
