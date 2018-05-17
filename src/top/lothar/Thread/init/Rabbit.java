package top.lothar.Thread.init;

public class Rabbit extends Thread{
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("兔子走了"+i+"步");
		}
	}
}
