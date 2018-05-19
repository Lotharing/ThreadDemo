package top.lothar.pro;

public class Watcher implements Runnable{
	
	private Movie m;
	
	public Watcher(Movie m){
		this.m=m;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ; i < 20 ; i++){
			m.watch();
		}
	}
}
